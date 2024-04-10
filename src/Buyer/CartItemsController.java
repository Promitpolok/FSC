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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CartItemsController implements Initializable {

    @FXML
    private Label ShowBuyerName;
    @FXML
    private Label ShowBuyerID;
    @FXML
    private Label ShowOrderProcess;
    @FXML
    private TableView<?> CartItemsTable;
    @FXML
    private ComboBox<?> ItemsComboBox;
    @FXML
    private ComboBox<?> QuantityComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DeleteAllFromCartTable(ActionEvent event) {
    }

    @FXML
    private void GenerateBillOnclick(ActionEvent event) {
    }

    @FXML
    private void CouponRadioButton(ActionEvent event) {
    }

    @FXML
    private void MembershipRadioButton(ActionEvent event) {
    }

    @FXML
    private void AddToCartTableOnClick(ActionEvent event) {
    }
    
}
