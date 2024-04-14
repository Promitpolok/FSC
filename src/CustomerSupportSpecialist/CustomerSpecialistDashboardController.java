/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CustomerSupportSpecialist;

import Buyer.BuyerDashboardController;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerSpecialistDashboardController implements Initializable {

    @FXML
    private Label showCustomerspecialistName;
    @FXML
    private Label showCustomerspecialistID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        showCustomerspecialistName.setText("");
        showCustomerspecialistID.setText("");
                
    }    

    @FXML
    private void ViewMembershipOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ViewMemberships.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ViewMembershipsController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToReportsOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("SubmittedBuyerReports .fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

SubmittedBuyerReportsController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToFeedbacksOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FeedBackFromBuyers.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

FeedBackFromBuyersController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToUpdateProfileOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("BuyerDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

BuyerDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToUpdateProductCatalogueOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("UpdateProductCatalogue.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

UpdateProductCatalogueController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToUpdateMembershipOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("UpdateMembershipForm.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

UpdateMembershipFormController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void GoToLiveChatOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CustomerSpecialistLiveChat.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

CustomerSpecialistLiveChatController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }
    
}
