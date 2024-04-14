/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CustomerSupportSpecialist;

import Buyer.BuyerDashboardController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdateMembershipFormController implements Initializable {

    @FXML
    private ComboBox<?> MembershipTypeComboBox;
    @FXML
    private ComboBox<?> ElementComboBox;
    @FXML
    private TextField LabelOnElementTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void UpdateFormOnClick(ActionEvent event) {
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) {
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
    
}
