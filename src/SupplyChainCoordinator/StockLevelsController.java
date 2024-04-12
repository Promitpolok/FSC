/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainCoordinator;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class StockLevelsController implements Initializable {

    @FXML
    private ComboBox<String> productNameComboBox;
    @FXML
    private TextArea viewProductInfoTextArea;
    
    private ArrayList <CartItem> cartList;
    
    private Map<String, Integer> productStockLevels;
    @FXML
    private TextField enterStockForSelectedProduct;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cartList = new ArrayList<>();
        productStockLevels = new HashMap<>();
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
        
                productStockLevels.put("Nitrotech", 100);
                productStockLevels.put("100% Gold Standard Whey Protein", 200);
                productStockLevels.put("On Micronizen Creatine", 300);
                productStockLevels.put("Nitrotech Whey Gold", 120);
                productStockLevels.put("Warrior Protein Ber", 150);
                productStockLevels.put("ISO Xp", 250);
                productStockLevels.put("Dymatize Iso", 90);
                productStockLevels.put("Seriousmass", 80);
                productStockLevels.put("Mass Tech Extreme 2000", 700);
                productStockLevels.put("Mass Gainer", 40);
                productStockLevels.put("Hyper Mass Gainer", 600);
                productStockLevels.put("Xtend BCAA", 60);
                productStockLevels.put("Amino Energy", 230);
                productStockLevels.put("BPI Best BCAA", 35);
                productStockLevels.put("BCAA Energy", 20);
                productStockLevels.put("Lipo 6 Black Ultra Concentrate", 190);
                productStockLevels.put("Cuts", 290);
                productStockLevels.put("Evll Carnitine", 30);
                productStockLevels.put("HydeoXYCut Hardcore Elite", 210);
                productStockLevels.put("Gold Creatine", 180);
                productStockLevels.put("Applied Nutrition", 160);
                productStockLevels.put("Plantinum Creatine", 110);
        
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
    private void CurrentStockButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        if (selectedProduct != null) {
           int currentStock = getCurrentStock(selectedProduct); 

           viewProductInfoTextArea.setText("Product: " + selectedProduct + "\nCurrent Stock: " + currentStock);
        }
    }
    
    private int getCurrentStock(String productName) {
        
        return productStockLevels.getOrDefault(productName, 0);
    
//    return 100;
   
    
    }


    @FXML
    private void UpdateStockLevelOnMouseClick(ActionEvent event) {
        
        String selectedProduct = productNameComboBox.getValue();
        if (selectedProduct != null) {
            
            String newStockLevelStr = enterStockForSelectedProduct.getText();
            if (!newStockLevelStr.isEmpty()) {
                try {
                    int newStockLevel = Integer.parseInt(newStockLevelStr);
                
                updateStockLevel(selectedProduct, newStockLevel);
                viewProductInfoTextArea.setText("Product: " + selectedProduct + "\nUpdated Stock Level: " + newStockLevel);
            } catch (NumberFormatException e) {
                viewProductInfoTextArea.setText("Invalid stock level entered. Please enter a number.");
            }
        } else {
            viewProductInfoTextArea.setText("Please enter a new stock level.");
        }
            
            
            
           //int newStockLevel = 20; 
           ///updateStockLevel(selectedProduct, newStockLevel); 
           //viewProductInfoTextArea.setText("Product: " + selectedProduct + "\nUpdated Stock Level: " + newStockLevel);
    }
}

private void updateStockLevel(String productName, int newStockLevel) {
    System.out.println("Updating stock level for " + productName + " to " + newStockLevel);
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        viewProductInfoTextArea.clear();
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
    }
    
}
