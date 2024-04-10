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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BuyerLiveChatController implements Initializable {

    @FXML
    private TextField TypeIDForLiveChat;
    @FXML
    private TextArea EnterLiveChatMessage;
    @FXML
    private Label ShowCustomerSpecialistMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ClickToSendToCustomerSpecialist(ActionEvent event) {
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) {
    }
    
}
