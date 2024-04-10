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

/**
 * FXML Controller class
 *
 * @author User
 */
public class BuyerProfileController implements Initializable {

    @FXML
    private Label ShowBuyerName;
    @FXML
    private Label ShowBuyerID;
    @FXML
    private Label ShowBuyerMembershipType;
    @FXML
    private Label ShowBuyerAddress;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ChangeMembershipTypeOnClick(ActionEvent event) {
    }

    @FXML
    private void ChangeAddressOnClick(ActionEvent event) {
    }
    
    @FXML
    private void SaveEverythingOnClick (ActionEvent event) {
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) {
    }
}
