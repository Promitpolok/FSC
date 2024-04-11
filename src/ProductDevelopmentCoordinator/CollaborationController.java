/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

import Login.UserName;
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
public class CollaborationController implements Initializable {

    @FXML
    private ComboBox<String> selectTeamMemberComboBox;
    @FXML
    private TextField projectTitleTextField;
    @FXML
    private TextField projectDescriptionTextField;
    private ComboBox<String> addTeamMemberComboBox;
    @FXML
    private TextField assignTaskTextField;
    
    private ArrayList <UserName> UserList;
    @FXML
    private TextArea infoTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        UserList= new ArrayList<>();
        
        selectTeamMemberComboBox.getItems().addAll(
                "Supply Chain Coordinator", 
                //"Product Development Coordinator", 
                "Accountant",
                "Digital Marketing Executive",
                "CEO",
                "Warehouse Associate",  
                "Customer Support Specialist"
        
        
        );
        
    }

    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductDevelopmentCoordinatorDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductDevelopmentCoordinatorDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }
    
    private void showInfo(){
        String memberName=selectTeamMemberComboBox.getValue();
        String projectTitle=projectTitleTextField.getText();
        String projectDescription=projectDescriptionTextField.getText();
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
    private void clearButtonOnMouseClick(ActionEvent event) {
        infoTextArea.clear();
    }

//    private void showSaveButtonOnMouseClick(ActionEvent event) {
//        showInfo();
    
//    }

    @FXML
    private void showButtonOnMouseClick(ActionEvent event) {
        showInfo();
    }

    @FXML
    private void sendButtonOnMouseClick(ActionEvent event) {
    }
    
}
