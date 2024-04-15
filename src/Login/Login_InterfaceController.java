
package Login;

import ProductDevelopmentCoordinator.ProductDevelopmentCoordinatorDashboardController;
import SupplyChainCoordinator.DashboardSupplyChainCoordinatorController;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.lang.model.util.Elements;
import jdk.nashorn.internal.ir.BreakNode;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class Login_InterfaceController implements Initializable {
    
    private Label label;
    @FXML
    private ComboBox<String> userNameComboBox;
    @FXML
    private TextField userIdTextField;
    @FXML
    private PasswordField enterPasswordField;
    @FXML
    private Label resetPassLabel;
    
    Alert anAlert = new Alert(Alert.AlertType.ERROR);
    
    
    private ArrayList <UserName> UserList;
    @FXML
    private Rectangle userTypeComboBox;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        UserList= new ArrayList<>();
        
        userNameComboBox.getItems().addAll(
                "Supply Chain Coordinator", 
                "Product Development Coordinator", 
                "Accountant",
                "Digital Marketing Executive",
                "CEO",
                "Warehouse Associate", 
                "Buyer", 
                "Customer Support Specialist");
        
    }
    @FXML
    private void loginButtonOnMouseClick(ActionEvent event) throws IOException, ClassNotFoundException {
        
        
        if(userNameComboBox.getValue().equals("Supply Chain Coordinator")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Supply Chain Coordinator.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("Dashboard Supply Chain Coordinator.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Product Development Coordinator")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Product Development Coordinator.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("ProductDevelopmentCoordinatorDashboard.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            //} catch (IOException | ClassNotFoundException e) {
            } catch (IOException e) {    
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Accountant")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Accountant.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("Accountant.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Digital Marketing Executive")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Digital Marketing Executive.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("Digital_Marketing_Executive.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("CEO")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("CEO.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("CEO Dashboard.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Warehouse Associate")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Warehouse Associate.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("CWAHome.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Buyer")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Buyer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("BuyerDashboard.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
        if(userNameComboBox.getValue().equals("Customer Support Specialist")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Customer Support Specialist.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    try {
                        p = (User) ois.readObject();
                        if (String.valueOf(p.getID()).equals(userIdTextField.getText()) && p.getPassword().equals(enterPasswordField.getText())) {
                            Parent A = FXMLLoader.load(getClass().getResource("CustomerSpecialistDashboard.fxml"));
                            Scene sceneA = new Scene(A);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(sceneA);                      
                            stage.show();
                        }else {
                           Alert();
                        }
                    
                    
                
                    } catch (EOFException e) {
                       break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        if(userNameComboBox.getValue() == null) {
//            anAlert.setContentText("Select a user type first");
//            anAlert.showAndWait();
//    
//        }
//        else if(userIdTextField.getText().isEmpty()) {
//            anAlert.setContentText("Enter a user ID and a password to login");
//            anAlert.showAndWait();
//            
//        }
//        
//        else if(enterPasswordField.getText().isEmpty()) {
//            anAlert.setContentText("Enter a user ID and a password to login");
//            anAlert.showAndWait();
//            
//        }    
//        else {
//            if(userNameComboBox.getValue().equals("Product Development Coordinator")) {
//                
//                Parent root = null;
//        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductDevelopmentCoordinatorDashBoard.fxml"));
//root = (Parent) myLoader.load();
//Scene myScene = new Scene(root);
//
//ProductDevelopmentCoordinatorDashboardController x = myLoader.getController();
////x.setValue(value);
//
//Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//myStage.setScene(myScene);
//myStage.show(); 
//
//
//        }
//        else {
//            anAlert.setAlertType(Alert.AlertType.ERROR);
//            anAlert.setContentText("Oops! The combination of userId and password is incorrect or something else went wrong. Try again!");
//            anAlert.show();
//            
//        }   
//
//        if(userNameComboBox.getValue().equals("Supply Chain Coordinator")) {
//                
//                Parent root = null;
//        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Dashboard Supply Chain Coordinator.fxml"));
//root = (Parent) myLoader.load();
//Scene myScene = new Scene(root);
//
//DashboardSupplyChainCoordinatorController x = myLoader.getController();
////x.setValue(value);
//
//Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//myStage.setScene(myScene);
//myStage.show();
//        
//
//        }
//        else {
//            anAlert.setContentText("Oops! The combination of userId and password is incorrect or something else went wrong. Try again!");
//            anAlert.show();
//                
//            }
        }
  
}

    @FXML
    private void registerButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("RegisterUserScene.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

RegisterUserSceneController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    private void Alert() {
        Alert a2 = new Alert(Alert.AlertType.ERROR);
        a2.setTitle("Warning ");
        a2.setHeaderText("LogIn Failed");
        a2.setContentText("Wrong ID/Password. Please Try Again");
        a2.showAndWait();
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} 

    
