/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Digital_Marketing_Excutive;

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
 * @author USER
 */
public class SelectBrandAmbassadorController implements Initializable {

    @FXML
    private ComboBox<String> productComboBox;
    @FXML
    private ComboBox<String> ambassadorComboBox;
    @FXML
    private TextArea showTextArea; 
    
    private ArrayList <Ambassador> ambassadorList=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        productComboBox.getItems().addAll(                
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
                ambassadorComboBox.getItems().addAll(
                        "DR. RAYHAN SHAHIDULLAH",
                        "SHEHZIN ISLAM",
                        "SHAKER UDDIN SHAWON"
                                   
        );

    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
                        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Digital_Marketing_Excutive.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

Digital_Marketing_ExcutiveController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void selectButtonOnClick(ActionEvent event) { 
                showTextArea.clear();
        if(productComboBox.getValue() ==  null ||  ambassadorComboBox.getValue()==null){
            showTextArea.clear();
            showTextArea.setText("Please Sellect a Product");
        } 
        if (checkDuplicate(productComboBox.getValue())){
            Ambassador temp = null;
            for (Ambassador a: ambassadorList )
                if (a.getProductName().equals(productComboBox.getValue())){
                    temp = a;
                    break;  
                }
        
            
        }
        else{
            Ambassador tempOBJ = new Ambassador(productComboBox.getValue(),(ambassadorComboBox.getValue()));
            ambassadorList.add(tempOBJ);
        
        }  
    }

    @FXML
    private void doneButtonOnClick(ActionEvent event) { 
                showTextArea.clear();
        for (Ambassador a: ambassadorList){
            showTextArea.appendText(a.toString()+"\n");
        }
        productComboBox.setDisable(true);
        ambassadorComboBox.setDisable(true);
    }

    @FXML
    private void saveButtonOnClick(ActionEvent event) {
        
    }
        private boolean checkDuplicate(String productName){
        if(ambassadorList.isEmpty()){
            return false;
        }
        for (Ambassador a : ambassadorList){
            if(a.getProductName().equals(productName)){ 
                return true;
            }
        }
        return false;
    }
    
}
