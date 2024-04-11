/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
 * @author Promit
 */
public class OverviewController implements Initializable {

    @FXML
    private TextArea overViewInfoTextArea;
    
    private Random random = new Random();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

//    private void CheckOutButtonOnMouseClick(ActionEvent event) {
//        
//        String dailyTask=generateDailyTask();
//        overViewInfoTextArea.setText(dailyTask);
//    }
    
    
    @FXML
    private void taskViewButtonOnMouseClick(ActionEvent event) {
        String dailyTask=generateDailyTask();
        overViewInfoTextArea.setText(dailyTask);
        
    }
    
    private String generateDailyTask() {
        
        String[] tasks = {
            //"Today's Task: Complete Project Proposal",
            "Today's Task: Product Taste Checking.",
            "Today's Task: Product Quantity Checking.",
            //"Today's Task: Conduct Market Research",
            //"Today's Task: Prepare Project Timeline",
            "Today's Task: Add New Product.",
            "Today's Task: Check Notifications.",
            "Today's Task: Collaboration.",
            
        };

        
        int index = random.nextInt(tasks.length);

        return tasks[index];
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        
        overViewInfoTextArea.clear();
    }

    
    
}
