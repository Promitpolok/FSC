/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

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
//import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateTaxBillController implements Initializable {

    @FXML
    private TextField incomeTaxtField;
    @FXML
    private TextField unitTaxTextField;
    @FXML
    private TextArea overViewTextArea;
    @FXML
    private TextField statusTextField; 
    
    private ArrayList<TaxBill> taxBillList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException { 
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Tax.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

TaxController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }

    @FXML
    private void addButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void viewDataButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void incomeTextFieldMouseOnClick(ActionEvent event) { 
        int a;
        a= Integer.parseInt(incomeTaxtField.getText());
       
        
       //b=Integer.parseInt(unitTaxTextField.getText());
       
       if (a<0){
           unitTaxTextField.setText("0");
       }
       if (a>1) {
           unitTaxTextField.setText(".5");             
       }
       //if(a) 

        }

    }
    

