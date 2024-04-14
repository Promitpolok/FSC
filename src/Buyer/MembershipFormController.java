/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Buyer;

import CustomerSupportSpecialist.Members;
import java.io.IOException;
import java.lang.reflect.Member;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MembershipFormController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField IDTextField;
    @FXML
    private TextField AddressTextField;
    @FXML
    private Label ShowMembershipFeesLabel;
    @FXML
    private ComboBox<String> MembershipTypeComboBox;
    
    ArrayList<Members> MembershipList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MembershipTypeComboBox.getItems().addAll("Silver","Platinum");
        MembershipList = new ArrayList<Members>();
        ShowMembershipFeesLabel.setText("Silver: 1000tk, Platinum: 1500tk");
        
    }    

    @FXML
    private void SubmitMembershipOnClick(ActionEvent event) {
         MembershipList.add(
            new Members(
                Integer.parseInt(IDTextField.getText()),
                NameTextField.getText(),
                MembershipTypeComboBox.getValue(),
                AddressTextField.getText()
            )
        );
        IDTextField.clear(); NameTextField.clear();
        AddressTextField.clear();
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) throws IOException {
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
