/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainCoordinator;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
public class ProductPriceController implements Initializable {

    @FXML
    private ComboBox<String> productNameComboBox;
    @FXML
    private TextField enterPriceTextField;
    @FXML
    private TextArea productInfoTextArea;
    
    private ArrayList <CartItem> cartList;

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
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Dashboard Supply Chain Coordinator.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

DashboardSupplyChainCoordinatorController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void SetPriceButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        String price = enterPriceTextField.getText();
        if (selectedProduct != null && !price.isEmpty()) {
 
        productInfoTextArea.setText("Product: " + selectedProduct + "\nPrice: " + price);
    }
        
}


    private void setProductPrice(String productName, String price) {
    
      System.out.println("Setting price for " + productName + " to " + price);

    }


    @FXML
    private void UpdateProductButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        if (selectedProduct != null) {
        
           String updatedProductName = updateProductName(selectedProduct);

           productNameComboBox.getItems().remove(selectedProduct);
           productNameComboBox.getItems().add(updatedProductName);
           productNameComboBox.setValue(updatedProductName);
           productInfoTextArea.setText("Updated Product: " + updatedProductName);
    }
}


    private String updateProductName(String productName) {
    
        return productName + " Updated";
    }

    @FXML
    private void UpdatePriceButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        String price = enterPriceTextField.getText();
        if (selectedProduct != null && !price.isEmpty()) {
           updateProductPrice(selectedProduct, price); 
           productInfoTextArea.setText("Product: " + selectedProduct + "\nUpdated Price: " + price);
    }
}

    private void updateProductPrice(String productName, String price) {
    
        System.out.println("Updating price for " + productName + " to " + price);
        
    }

    @FXML
    private void DeleteProductButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        if (selectedProduct != null) {
            productNameComboBox.getItems().remove(selectedProduct);
            productInfoTextArea.clear();
        }
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        productInfoTextArea.clear();
    }
    
}
