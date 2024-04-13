/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Digital_Marketing_Excutive;

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
 * @author USER
 */
public class CreateAdsController implements Initializable {

    @FXML
    private TextField productPriceTextField;
    @FXML
    private ComboBox<String> productNameComboBox;
    @FXML
    private TextArea viewAdsTextArea;
    
    private ArrayList<AdsHelper> cartList;
    @FXML
    private ComboBox<Integer> discountComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cartList= new ArrayList<>(); 
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
        discountComboBox.getItems().addAll(
                99,
                199,
                299,
                399,
                499,
                599,
                699,
                799,
                899,
                999,
                1099,
                1199,
                1299            
        );

    }    

    @FXML
    private void backBurronMouseOnClick(ActionEvent event) throws IOException { 
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Advertisement.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

AdvertisementController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }

    @FXML
    private void productNameMouseOnClick(ActionEvent event) { 
        switch (productNameComboBox.getValue()){
            case "Nitrotech":
                productPriceTextField.setText("5299");
                break;
            case "100% Gold Standard Whey Protein":
                productPriceTextField.setText("5999");
                break;  
            case "On Micronizen Creatine":
                productPriceTextField.setText("3199");
                break;                 
            case "Nitrotech Whey Gold":
                productPriceTextField.setText("5399");
                break;                 
            case "Warrior Protein Ber":
                productPriceTextField.setText("4599");
                break; 
            case "ISO Xp":
                productPriceTextField.setText("5399");
                break; 
            case "Dymatize Iso":
                productPriceTextField.setText("11999");
                break; 
            case "Seriousmass":
                productPriceTextField.setText("7799");
                break; 
            case "Mass Tech Extreme 2000":
                productPriceTextField.setText("7699");
                break; 
            case "Mass Gainer":
                productPriceTextField.setText("6799");
                break; 
            case "Hyper Mass Gainer":
                productPriceTextField.setText("6699");
                break;                 
            case "Xtend BCAA":
                productPriceTextField.setText("3199");
                break;                 
            case "Amino Energy":
                productPriceTextField.setText("3499");
                break;                 
            case "BPI Best BCAA":
                productPriceTextField.setText("2699");
                break;                 
            case "BCAA Energy":
                productPriceTextField.setText("2999");
                break;                 
             case "Lipo 6 Black Ultra Concentrate":
                productPriceTextField.setText("2899");
                break;                
            case "Cuts":
                productPriceTextField.setText("5499");
                break;                 
            case "Evll Carnitine":
                productPriceTextField.setText("2799");
                break; 
            case "HydeoXYCut Hardcore Elite":
                productPriceTextField.setText("2599");
                break; 
            case "Gold Creatine":
                productPriceTextField.setText("2699");
                break; 
            case "Applied Nutrition":
                productPriceTextField.setText("2999");
                break;                 
            case "Plantinum Creatine":
                productPriceTextField.setText("3499");
                break;                 
        } 
    }

    @FXML
    private void addButtonMouseOnClick(ActionEvent event) { 
        viewAdsTextArea.clear();
        if(productNameComboBox.getValue() ==  null ||  discountComboBox.getValue()==null){
            viewAdsTextArea.clear();
            viewAdsTextArea.setText("Please Sellect a Product");
        } 
        if (checkDuplicate(productNameComboBox.getValue())){
            AdsHelper temp = null;
            for (AdsHelper a: cartList )
                if (a.getProductName().equals(productNameComboBox.getValue())){
                    temp = a;
                    break;  
                }
            
        }
        else{
            AdsHelper tempOBJ = new AdsHelper(productNameComboBox.getValue(),Integer.parseInt(productPriceTextField.getText()),(discountComboBox.getValue()));
            cartList.add(tempOBJ);
        
        }    
    }

    @FXML
    private void doneButtonMouseOnClick(ActionEvent event) { 
        viewAdsTextArea.clear();
        for (AdsHelper a: cartList){
            viewAdsTextArea.appendText(a.toString()+"\n");
        }
        productPriceTextField.setDisable(true);
        productNameComboBox.setDisable(true);
        discountComboBox.setDisable(true);
        
    }

    @FXML
    private boolean saveButtonMouseOnClick(ActionEvent event) {
               File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("CetateAds.bin");

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
                    Logger.getLogger(AdsHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           // System.out.println("Error writing Object to binary file");
          //  return false;

        }
        return false;
    }


        
        
        
    
    private boolean checkDuplicate(String productName){
        if(cartList.isEmpty()){
            return false;
        }
        for (AdsHelper a : cartList){
            if(a.getProductName().equals(productName)){ 
                return true;
            }
        }
        return false;
    }
}
