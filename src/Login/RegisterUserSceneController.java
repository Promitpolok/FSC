/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Login;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class RegisterUserSceneController implements Initializable {

    @FXML
    private TextField newUserIdTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> selectUserTypeComboBox;
    
    private ArrayList <UserName> UserList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       UserList= new ArrayList<>();
        
        selectUserTypeComboBox.getItems().addAll(
                "Buyer",
                "Supply Chain Coordinator",
                "Product Development Coordinator",
                "Accountant",
                "Digital Marketing Executive",
                "CEO",
                "Warehouse Associate",
                "Customer Support Sppecialist"
                ); 
       
    }    

    @FXML
    private void registerButtonOnMouseClick(ActionEvent event) throws IOException {
        
        
        
        if(selectUserTypeComboBox.getValue().equals("Buyer")){
            buyerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();                                         
        }   
        else if(selectUserTypeComboBox.getValue().equals("Supply Chain Coordinator")){
            supplychaincoordinatorAndShow(); 
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("Product Development Coordinator")){
            productdevelopmentcoordinatorAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("Accountant")){
            accountantAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("Digital Marketing Executive")){
            digitalmarketingexecutiveAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("CEO")){
            ceoAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("Warehouse Associate")){
            warehouseassociateAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(selectUserTypeComboBox.getValue().equals("Customer Support Specialist")){
            customersupportspecialistAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else {
            Alert a2 = new Alert(Alert.AlertType.WARNING);
            a2.setTitle("Warning ");
            a2.setHeaderText("LogIn Failed");
//            a2.setContentText("Wrong ID/Password");
            a2.setContentText("Wrong ID/Password. Please Try Again");
            a2.showAndWait();
        }
 
        
        
        
        
        
        
        
    }
        
//        Parent root = null;
//        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Login_Interface.fxml"));
//root = (Parent) myLoader.load();
//Scene myScene = new Scene(root);
//
//Login_InterfaceController x = myLoader.getController();
////x.setValue(value);
//
//Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//myStage.setScene(myScene);
//myStage.show(); 
//    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Login_Interface.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

Login_InterfaceController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }
    

       private void buyerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()) {
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Buyer.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void supplychaincoordinatorAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Supply Chain Coordinator.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void productdevelopmentcoordinatorAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Product Development Coordinator.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void accountantAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Accountant.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void digitalmarketingexecutiveAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Digital Marketing Executive.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void ceoAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("CEO.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void warehouseassociateAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Warehouse Associate.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void customersupportspecialistAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || newUserIdTextField.getText().isEmpty() 
                || passwordField.getText().isEmpty()){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(newUserIdTextField.getText()),
                    passwordField.getText(),
                    
                    selectUserTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Customer Support Specialist.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(RegisterUserSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterUserSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
} 