/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CustomerSupportSpecialist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerSpecialistLiveChatController implements Initializable {

    @FXML
    private TextArea CustomerSpecialistMessageTextField;
    @FXML
    private Label ShowBuyerID;
    @FXML
    private Label ShowBuyerMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SendMessageOnClick(ActionEvent event) {
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) {
    }
    
}
