/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CEO;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author shafayatfahim
 */
public class ComposeController implements Initializable {

    @FXML
    private TextArea newMessageTextArea;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accountButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void customerSSButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void digitalMEButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void productDCButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void supplyCCButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void chiefWEButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void buyerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Messages.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

MessagesController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();

        
    }

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
    }
    
}
