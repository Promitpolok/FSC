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
public class InventoryManagementController implements Initializable {

    @FXML
    private ComboBox<String> selectProductComboBox;
    
    private ArrayList <CartItem> cartList;
    @FXML
    private TextArea productRecordsTextArea;

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
    private void ViewProductDetailsButtonOnMouseClick(ActionEvent event) {
        
       if (selectProductComboBox.getSelectionModel().getSelectedItem() != null) {
           String selectedProduct = selectProductComboBox.getSelectionModel().getSelectedItem();
           productRecordsTextArea.appendText("This product record is saved: " + selectedProduct + "\n");
           
       } else {
        productRecordsTextArea.appendText("Please select a product.\n");
       } 
    }

    @FXML
    private void saveProductRecordsButtonOnMouseClick(ActionEvent event) {
        
        
        if (selectProductComboBox.getSelectionModel().getSelectedItem() != null) {
        
            productRecordsTextArea.appendText("The product record is saved\n");
            
        } else {
        
            productRecordsTextArea.appendText("Please select a product\n");
        }
        
  
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        productRecordsTextArea.clear();
    }
    
}
