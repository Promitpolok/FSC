/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Buyer;

import Login.Login_InterfaceController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

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
    @FXML
    private Label OrderErrorLabel;

    /**
     * Initializes the controller class.

     */
    /*@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ShowCoupon.setText("1) Coupon 10% OFF for 100TK bill !!!");
        ShowDiscount.setText("2) Eid Discount on everything 20% !!!! ( ONLY for Platinum membership)"); 
    }    */
    @Override
    public void initialize(String ShowName, int ShowID, String ShowMembershipType) {
        // Set buyer details
        ShowName.setText("Name: " + "ShowName");
        ShowID.setText("ID: " + "ShowID");
        ShowMembershipType.setText("Membership Type: " + "ShowMembershipType");

    
}

    @FXML
    private void MakeCartOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CartItems.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

CartItemsController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void MakeFeedbackOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("BuyerFeedback.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

BuyerFeedbackController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void UpdateProfileOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("BuyerProfile.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

BuyerProfileController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void CreateMembershipOnclick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("MembershipForm.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

MembershipFormController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToProductPageOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductCatalogue.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductCatalogueController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void SignOutOnClick(ActionEvent event) {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Login_Interface.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

Login_InterfaceController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }
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
