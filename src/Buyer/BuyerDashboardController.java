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
    private Label ShowCoupon;
    @FXML
    private Label ShowDiscount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ShowCoupon.setText("1) Coupon 10% OFF for 100TK bill !!!");
        ShowDiscount.setText("2) Eid Discount on everything 20% !!!! ( ONLY for Platinum membership)"); 
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

    @FXML
    private void CreateMembershipOnclick(ActionEvent event) {
    }

    @FXML
    private void GoToProductPageOnClick(ActionEvent event) {
    }

    @FXML
    private void SignOutOnClick(ActionEvent event) {
    }
    
}
