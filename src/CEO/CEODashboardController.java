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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shafayatfahim
 */
public class CEODashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void messagesButtonOnMouseClick(ActionEvent event) throws IOException {
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
    private void salaryApproveButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("SalaryApprove.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

SalaryApproveController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();

    }

    @FXML
    private void taskButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void goalsButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void financialReportsButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void salesFigureButtonOnMouseClick(ActionEvent event) {
    }
    
}
