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

/**
 * FXML Controller class
 *
 * @author User
 */
public class BuyerDashboardController implements Initializable {

    @FXML
    private Label ShowName;
    @FXML
    private Label ShowMembershipType;
    @FXML
    private Label ShowID;
    @FXML
    private TextArea ShowCoupon;
    @FXML
    private TextArea ShowDiscount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MakeCartOnClick(ActionEvent event) {
    }

    @FXML
    private void MakeFeedbackOnClick(ActionEvent event) {
    }

    @FXML
    private void UpdateProfileOnClick(ActionEvent event) {
    }
    
}
