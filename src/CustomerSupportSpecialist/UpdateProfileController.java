/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CustomerSupportSpecialist;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdateProfileController implements Initializable {

    @FXML
    private Label NameLabel;
    @FXML
    private Label IDLabel;
    @FXML
    private Label AddressLabel;
    @FXML
    private Label DateJoinedLabel;
    @FXML
    private Label SalaryLabel;
    @FXML
    private TextField NewAddressTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        NameLabel.setText("Sayed");
        IDLabel.setText("2211");
        DateJoinedLabel.setText("9 dec 22");
        SalaryLabel.setText("25000");
    }   


    @FXML
    private void ChangeAddressOnClick(ActionEvent event) {
       
        AddressLabel.setText( NewAddressTextField.getText());
        
    }


    @FXML
    private void GoBackOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CustomerSpecialistDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

CustomerSpecialistDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }
    
}
