/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Digital_Marketing_Excutive;

//import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
 * @author USER
 */
public class ViewAdsController implements Initializable {

    @FXML
    private TextArea ShowAdsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException { 
                        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Advertisement.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

AdvertisementController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }



    @FXML
    private void okButtonOnClick(ActionEvent event) { 

//public static ObservableList<AdsHelper> readCartList() {
//    ObservableList<AdsHelper> cartList = FXCollections.observableArrayList();
//    AdsHelper i;
//    ObjectInputStream ois = null;
//    try {
//        ois = new ObjectInputStream(new FileInputStream("Patient.bin"));
//        while (true) {
//            i = (AdsHelper) ois.readObject();
//            System.out.println("The item you read: " + i.toString());
//            cartList.add(i);
//        }
//    } catch (IOException | ClassNotFoundException e) {
//        System.out.println("File reading done");
//    }
//    System.out.println(cartList);
//    return cartList;
//}
    }

    @FXML
    private void showAdsButtonOnClick(ActionEvent event) {
//        for (AdsHelper a: cartList){
//            ShowAdsTextArea.appendText(a.toString()+"\n");
//        }
    }
    }

    


