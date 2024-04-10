/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Buyer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BillController implements Initializable {

    @FXML
    private TableView<?> ShowCartItemsTable;
    @FXML
    private Label ShowTotalBill;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ConfirmBillOnClick(ActionEvent event) {
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) {
    }
    
}
