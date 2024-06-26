/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainCoordinator;

import java.io.IOException;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class NotificationController implements Initializable {

    @FXML
    private TextField enterMessageTextField;
    @FXML
    private ComboBox<String> selectNameComboBox;
    
    private ArrayList <UserName> UserList;
    @FXML
    private TextArea notificationTextArea;
    
    private ArrayList<String> notifications;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        notifications = new ArrayList<>();
        notifications.add("Product Development Coordinator: New Product Arrives");
        notifications.add("Accountant: Have Nice day");
        notifications.add("Digital Marketing Executive: New Advertisement Launched!!");
        notifications.add("CEO: Meet me at my office");
        notifications.add("Warehouse Associate: Just checked in");
        notifications.add("Customer Support Specialist: Greetings of the day");
        
        UserList= new ArrayList<>();
        
        selectNameComboBox.getItems().addAll(
                //"Supply Chain Coordinator", 
                "Product Development Coordinator", 
                "Accountant",
                "Digital Marketing Executive",
                "CEO",
                "Warehouse Associate",
                "Customer Support Specialist");
    }    

    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Dashboard Supply Chain Coordinator.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

DashboardSupplyChainCoordinatorController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void ViewNotificationButtonOnMouseClick(ActionEvent event) {
        
        String selectedName = selectNameComboBox.getValue();
        if (selectedName != null) {
            int index = selectNameComboBox.getItems().indexOf(selectedName);
            if (index >= 0 && index < notifications.size()) {
                String notification = notifications.get(index);
                notificationTextArea.setText(notification);
            } else {
                notificationTextArea.setText("No notification available for " + selectedName);
            }
        } else {
            notificationTextArea.setText("Please select a name to view notifications.");
        }
    }

    @FXML
    private void SendMessageButtonOnMouseClick(ActionEvent event) {
        
        String selectedName = selectNameComboBox.getValue();
        String message = enterMessageTextField.getText();

        if (selectedName != null && !message.isEmpty()) {
            notificationTextArea.appendText(". Message sent successfully to " + selectedName + ": " + message + "\n");
            enterMessageTextField.clear();
        } else {
            notificationTextArea.appendText("Please select a name and enter a message.\n");
        }
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        notificationTextArea.clear();
    }
    
}
