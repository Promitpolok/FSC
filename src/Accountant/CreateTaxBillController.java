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
    
    //private ArrayList<TaxBill> taxBillList;

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
    try {
        float income = Float.parseFloat(incomeTaxtField.getText());
        float unitTax = Float.parseFloat(unitTaxTextField.getText());

        TaxBill newTaxBill = new TaxBill(statusTextField.getText(), income, unitTax);

        overViewTextArea.appendText(newTaxBill.toString() + "\n");

        incomeTaxtField.clear();
        unitTaxTextField.clear();
        statusTextField.clear();
    } catch (NumberFormatException e) {

    }
}   
    @FXML
    private void incomeTextFieldMouseOnClick(ActionEvent event) { 
       try {
        float income = Float.parseFloat(incomeTaxtField.getText());
        float unitTax = 0.0f;
 
        if (income >= 0 && income <= 1000000) {
            unitTax = 1.0f;
        }
        else if (income > 1000000 && income <= 5000000) {
            unitTax = 1.5f;
        } 
        else if (income > 5000000 && income <= 10000000) {
            unitTax = 2.0f;
        }
        else if (income > 10000000) {
            unitTax = 2.5f;
        }
        else {
            unitTaxTextField.clear();
            return; 
        }
        unitTaxTextField.setText(String.valueOf(unitTax));
    } catch (NumberFormatException e) {
        unitTaxTextField.clear();
    }
}

    @FXML
    private void saveButtonMouseOnClick(ActionEvent event) {
    }

        }

    
    

