/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

import SupplyChainCoordinator.StockLevelsController;
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
public class ProductController implements Initializable {

    @FXML
    private TextArea productInfoTextArea;
    @FXML
    private ComboBox<String> selectNewProductComboBox;
    
    private ArrayList <CartItem> cartList;
    
    private Map<String, Integer> stockLevels;
    private Map<String, String> productInfo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cartList = new ArrayList<>();
        selectNewProductComboBox.getItems().addAll(
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
        
        stockLevels=new HashMap<>();
        stockLevels.put("Nitrotech", 50);
        stockLevels.put("100% Gold Standard Whey Protein", 30);
        stockLevels.put("On Micronizen Creatine", 40);
        stockLevels.put("Nitrotech Whey Gold", 10);
        stockLevels.put("Warrior Protein Ber", 60);
        stockLevels.put("ISO Xp", 50);
        stockLevels.put("Dymatize Iso", 90);
        stockLevels.put("Seriousmass", 70);
        stockLevels.put("Mass Tech Extreme 2000", 80);
        stockLevels.put("Mass Gainer", 20);
        stockLevels.put("Hyper Mass Gainer", 100);
        stockLevels.put("Xtend BCAA", 40);
        stockLevels.put("Amino Energy", 120);
        stockLevels.put("BPI Best BCAA", 130);
        stockLevels.put("BCAA Energy", 140);
        stockLevels.put("Lipo 6 Black Ultra Concentrate", 160);
        stockLevels.put("Cuts", 150);
        stockLevels.put("Evll Carnitine", 100);
        stockLevels.put("HydeoXYCut Hardcore Elite",200);
        stockLevels.put("Gold Creatine", 150);
        stockLevels.put("Applied Nutrition", 160);
        stockLevels.put("Plantinum Creatine", 190);
        
        
        productInfo=new HashMap<>();
        

    }    
    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductDevelopmentCoordinatorDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductDevelopmentCoordinatorDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void AddNewProductButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Add New Product.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

AddNewProductController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

//    private void ViewProductButtonOnMouseClick(ActionEvent event) {
//        
//        String selectedProduct=selectNewProductComboBox.getValue();
//        if (selectedProduct!=null){
//            String productDescription=productInfo.getOrDefault(selectedProduct, "No information available.");
//            productInfoTextArea.setText("Product Information:\n\n" + selectedProduct + "\n" + productDescription);
//        }else{
//            productInfoTextArea.setText("Please select a product.");
//        }
//    }
    

    @FXML
    private void ViewStockLevelsButtonOnMouseClick(ActionEvent event) {
        
        String selectedProduct = selectNewProductComboBox.getValue();
        if (selectedProduct != null) {
            int stockLevel = stockLevels.getOrDefault(selectedProduct, 0);
            productInfoTextArea.setText("Stock level for " + selectedProduct + ": " + stockLevel);
        } else {
            productInfoTextArea.setText("Please select a product.");
        }
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        productInfoTextArea.clear();
    }
    
}
