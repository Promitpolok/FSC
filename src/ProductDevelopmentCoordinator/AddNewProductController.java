/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
    public class AddNewProductController implements Initializable {
        
    

    @FXML
    private ComboBox<String> productNameComboBox;
    
    private ArrayList <CartItem> cartList;
    @FXML
    private TextArea productInfoTextArea;
    @FXML
    private TextField enterProductNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cartList = new ArrayList<>();
        productNameComboBox.getItems().addAll(
               "Nitrotech",
                "100% Gold Standard Whey Protein",
                "On Micronizen Creatine",
                "Nitrotech Whey Gold",
                "Warrior Protein Ber",
                "ISO Xp",
                "Dymatize Iso",
                "Seriousmass",
                "Mass Tech Extreme 2000",
                "Mass Gainer",
                "Hyper Mass Gainer",
                "Xtend BCAA",
                "Amino Energy",
                "BPI Best BCAA",
                "BCAA Energy",
                "Lipo 6 Black Ultra Concentrate",
                "Cuts",
                "Evll Carnitine",
                "HydeoXYCut Hardcore Elite",
                "Gold Creatine",
                "Applied Nutrition",
                "Plantinum Creatine"
                
                );
    }    

    @FXML
    private void BackbuttonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Product.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }



    @FXML
    private void clearbuttonOnMouseClick(ActionEvent event) {
        
        productInfoTextArea.clear();
    }

    @FXML
    private void addbuttonOnMouseClick(ActionEvent event) {
        
        String newProductName = enterProductNameTextField.getText();
        if (!newProductName.isEmpty() && !productNameComboBox.getItems().contains(newProductName)) {
           productNameComboBox.getItems().add(newProductName);

           productInfoTextArea.appendText("New product added: " + newProductName + "\n");
        
           enterProductNameTextField.clear();
        } else {
        
            productInfoTextArea.appendText("Product name is empty or already exists.\n");
        }
    }

    @FXML
    private boolean savebuttonOnMouseClick(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("Add New Product.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(cartList);
            oos.close();
            return true;

        } catch (IOException e) {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           // System.out.println("Error writing Object to binary file");
            return false;

        }
    }

    private static class AddProduct {

        public AddProduct() {
        }
    }
    
    
}
