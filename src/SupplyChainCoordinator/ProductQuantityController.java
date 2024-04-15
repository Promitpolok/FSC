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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class ProductQuantityController implements Initializable {

    @FXML
    private ComboBox<String> productNameComboBox;
    
    private ArrayList <CartItem> cartList;
    @FXML
    private TextArea productInfoTextArea;

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
    private void CheckQuantityButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        if (selectedProduct != null) {
            int quantity = getQuantityForProduct(selectedProduct);
            productInfoTextArea.setText("Product: " + selectedProduct + "\nQuantity: " + quantity);
        } else {
            productInfoTextArea.setText("Please select a product.");
        }
    }
    
    private int getQuantityForProduct(String productName) {
            
            switch (productName) {
            case "Nitrotech":
                return 50;
            case "100% Gold Standard Whey Protein":
                return 30;
            case "On Micronizen Creatine":
                return 20;
            case "Nitrotech Whey Gold":
                return 10;
            case"Warrior Protein Ber":
                return 30;    
            case  "ISO Xp":
                return 40;    
            case  "Dymatize Iso":
                return 50;
            case  "Seriousmass":
                return 100;
            case  "Mass Tech Extreme 2000":
                return 150;
            case  "Mass Gainer":
                return 200;    
            case  "Hyper Mass Gainer":
                return 130;
            case  "Xtend BCAA":
                return 120;
            case  "Amino Energy":
                return 110;
            case  "BPI Best BCAA":
                return 100;
            case  "BCAA Energy":
                return 90;
            case  "Lipo 6 Black Ultra Concentrate":
                return 80;
            case  "Cuts":
                return 100;    
            case  "Evll Carnitine":
                return 1000;    
            case  "HydeoXYCut Hardcore Elite":
                return  250;
            case  "Gold Creatine":
                return 300;
             case "Applied Nutrition":
                return 350;
            case  "Plantinum Creatine":
                return 400;
            default:
                return 0;
            
        }
            
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        productInfoTextArea.clear();
    }
    
}
