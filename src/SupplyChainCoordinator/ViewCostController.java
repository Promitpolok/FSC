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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class ViewCostController implements Initializable {

    @FXML
    private ComboBox<String> selectProductComboBox;
    
    private ArrayList <CartItem> cartList;
    @FXML
    private TextArea viewCostTextArea;
    
    private Map<String, Double> productCosts;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cartList = new ArrayList<>();
        selectProductComboBox.getItems().addAll(
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
        productCosts=new HashMap<>();
        productCosts.put("Nitrotech", 100.00);
        productCosts.put("100% Gold Standard Whey Protein", 200.00);
        productCosts.put("On Micronizen Creatine", 300.00);
        productCosts.put("Nitrotech Whey Gold", 120.00);
        productCosts.put("Warrior Protein Ber", 150.00);
        productCosts.put("ISO Xp", 250.00);
        productCosts.put("Dymatize Iso", 90.00);
        productCosts.put("Seriousmass", 80.00);
        productCosts.put("Mass Tech Extreme 2000", 700.00);
        productCosts.put("Mass Gainer", 40.00);
        productCosts.put("Hyper Mass Gainer", 600.00);
        productCosts.put("Xtend BCAA", 60.00);
        productCosts.put("Amino Energy", 230.00);
        productCosts.put("BPI Best BCAA", 35.00);
        productCosts.put("BCAA Energy", 20.00);
        productCosts.put("Lipo 6 Black Ultra Concentrate", 190.00);
        productCosts.put("Cuts", 290.00);
        productCosts.put("Evll Carnitine", 30.00);
        productCosts.put("HydeoXYCut Hardcore Elite", 210.00);
        productCosts.put("Gold Creatine", 180.00);
        productCosts.put("Applied Nutrition", 160.00);
        productCosts.put("Plantinum Creatine", 110.00);
        
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
    private void ViewCostButttonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = selectProductComboBox.getValue();
        if (selectedProduct != null && productCosts.containsKey(selectedProduct)) {
            double cost = productCosts.get(selectedProduct);
            viewCostTextArea.setText("The cost of " + selectedProduct + " is $." + cost);
        } else {
            viewCostTextArea.setText("Please select a product.");
        }
    }

    @FXML
    private void clearButttonOnMouseClick(ActionEvent event) {
        viewCostTextArea.clear();
    }
    
}
