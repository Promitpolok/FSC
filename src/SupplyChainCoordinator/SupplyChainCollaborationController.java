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
public class SupplyChainCollaborationController implements Initializable {

    @FXML
    private ComboBox<String> selectTeamMemberComboBox;
    @FXML
    private TextArea infoTextArea;
    
    private ArrayList <UserName> UserList;
    @FXML
    private TextField enterDescriptionTextField;
    @FXML
    private TextField enterProjectTitleTextField;
    @FXML
    private TextField assignTaskTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        UserList= new ArrayList<>();
        
        selectTeamMemberComboBox.getItems().addAll(
                //"Supply Chain Coordinator", 
                "Product Development Coordinator", 
                //"Accountant",
                //"Digital Marketing Executive",
                "CEO"
                //"Warehouse Associate",  
               // "Customer Support Specialist"
        
        
        );
        
    }    

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        
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
    
    private void showInfo(){
        String memberName=selectTeamMemberComboBox.getValue();
        String projectTitle=enterProjectTitleTextField.getText();
        String projectDescription=enterDescriptionTextField.getText();
        String assignedTask=assignTaskTextField.getText();
        
        if (memberName!=null && !projectTitle.isEmpty() && !projectDescription.isEmpty() && !assignedTask.isEmpty()){
            StringBuilder outputBuilder=new StringBuilder();
            outputBuilder.append("Member Name: ").append(memberName).append("\n");
            outputBuilder.append("Project Title: ").append(projectTitle).append("\n");
            outputBuilder.append("Project Description: ").append(projectDescription).append("\n");
            outputBuilder.append("Assign Task: ").append(assignedTask);
            infoTextArea.setText(outputBuilder.toString());
            
        }else{
            infoTextArea.setText("Please fill all the fields.");
            
        }
    }

    @FXML
    private void showButtonOnMouseClick(ActionEvent event) {
        
        showInfo();
    }

    @FXML
    private void sendButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        infoTextArea.clear();
    }
    
}
