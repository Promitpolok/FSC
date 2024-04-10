/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class ProductTasteCheckingController implements Initializable {

    @FXML
    private ComboBox<String> ProductNameComboBox;
    //private RadioButton okRadioButton;
    //private RadioButton notOkRadioButton;
    @FXML
    private TextArea infoTextArea;
    
    //private ToggleGroup toggleGroup;
    
    private ArrayList <CartItem> cartList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //toggleGroup = new ToggleGroup();
        //okRadioButton.setToggleGroup(toggleGroup);
        //notOkRadioButton.setToggleGroup(toggleGroup);
        
        cartList = new ArrayList<>();
        ProductNameComboBox.getItems().addAll(
               "Nitrotech",
                "100% Gold Standard Whey Protein",
                "On Micronizen Creatine",
                "Nitrotech Whey Gold",
                "Warrior Protein Ber",
                "ISO Xp",
                "Dymatize Iso",
                "Seriousmass",
                "Mass Tech Extreme 2000",
                "Mass Gainer",
                "Hyper Mass Gainer",
                "Xtend BCAA",
                "Amino Energy",
                "BPI Best BCAA",
                "BCAA Energy",
                "Lipo 6 Black Ultra Concentrate",
                "Cuts",
                "Evll Carnitine",
                "HydeoXYCut Hardcore Elite",
                "Gold Creatine",
                "Applied Nutrition",
                "Plantinum Creatine"
                
                );
        
       
    }
    
    private void productComboBoxOnSelect(ActionEvent event){
        String selectedProduct=ProductNameComboBox.getValue();
        if(selectedProduct!=null){
            infoTextArea.setText("Product: " + selectedProduct);
        }
    }
    
    //private  void radioButtonOnSelect(ActionEvent event){
        //RadioButton selectedRadioButton=(RadioButton)toggleGroup.getSelectedToggle();
       // if(selectedRadioButton!=null){
          //  String feedback=selectedRadioButton.getText();
           // String productName=ProductNameComboBox.getValue();
           // if(productName!=null){
              //  if(feedback.equals("Ok")){
              //      infoTextArea.appendText("\nFeedback: " + productName + "is Ok");
                    
              //  } else{
                  //  infoTextArea.appendText("\nFeedback: " + productName + "is not Ok");
                    
             //   }
           // } else{
              //  infoTextArea.appendText("\nFeedback: "  + feedback + "(No product selected");
           // }
       // }
    //}

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        
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

    @FXML
    private void okButtonOnMouseClick(ActionEvent event) {
       String productName = ProductNameComboBox.getValue();
        if (productName != null) {
            infoTextArea.appendText("\nFeedback: The product " + productName + " is OK");
        } else {
            infoTextArea.appendText("\nFeedback: OK (No product selected)");
            
        }
    }

    @FXML
    private void notOkButtonOnMouseClick(ActionEvent event) {
        String productName = ProductNameComboBox.getValue();
        if (productName != null) {
            infoTextArea.appendText("\nFeedback: The product " + productName + " is Not OK");
        } else {
            infoTextArea.appendText("\nFeedback: Not OK (No product selected)");
        }
    }

    @FXML
    private void clearButtonOnMouseClick(ActionEvent event) {
        infoTextArea.clear();
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
        String infoText=infoTextArea.getText();
        if(!infoText.isEmpty()){
            try(BufferedWriter writer=new BufferedWriter(new FileWriter("product_info.text"))){
                writer.write(infoText);
                System.out.println(" Product information saved to product_info.txt ");
            } catch (IOException e){
                System.err.println("Error writing to file: " + e.getMessage());
                
            }
            }else{
                System.out.println("No product information to save.");
        }
    }
}
 
    //@FXML
   // private void productComboBoxOnSelect(ActionEvent event){
     //   String selectedProduct=ProductNameComboBox.getValue();
     //   if(selectedProduct!=null){
      //     infoTextArea.clear();
        
        
        //switch (selectedProduct){
            //case "Nitrotech":
               // infoTextArea.setText("Product: Nitrotech");
               // break;
           // case "100% Gold Standard Whey Protein":
                //infoTextArea.setText("Product: 100% Gold Standard Whey Protein");
               // break;
            //case "On Micronizen Creatine":
            //    infoTextArea.setText("Product: On Micronizen Creatine");
             //   break;
           // case "Nitrotech Whey Gold":
          //      infoTextArea.setText("Product: Nitrotech Whey Gold");
          //      break;
           // case "Warrior Protein Ber":
          //    //  infoTextArea.setText("Product: Warrior Protein Ber");
              //  break;
          //  case "ISO Xp":
          //      infoTextArea.setText("Product: ISO Xp");
          //      break;
         //   case "Dymatize Iso":
           //     infoTextArea.setText("Product: Dymatize Iso");
            //    break;
         //   case "Seriousmass":
         //       infoTextArea.setText("Product: Seriousmass");
         //       break;
         //  case "Mass Tech Extreme 2000":
          //      infoTextArea.setText("Product: Mass Tech Extreme 2000");
           //     break;
          //  case "Mass Gainer":
           //     infoTextArea.setText("Product: Mass Gainer");
           //     break;
           // case "Hyper Mass Gainer":
           //     infoTextArea.setText("Product: Hyper Mass Gainer");
           //     break;
           // case "Xtend BCAA":
           //     infoTextArea.setText("Product: Xtend BCAA");
           //     break;
           // case "Amino Energy":
           //     infoTextArea.setText("Product: Amino Energy");
           //     break;
          //  case "BPI Best BCAA":
          //      infoTextArea.setText("Product:BPI Best BCAA");
           //     break;
           // case "BCAA Energy":
           //     infoTextArea.setText("Product: BCAA Energy");
           //     break;
          //  case "Lipo 6 Black Ultra Concentrate":
           //     infoTextArea.setText("Product: Lipo 6 Black Ultra Concentrate");
           //     break;
           // case "Cuts":
           //     break;
          //  case "Evll Carnitine":
          //      infoTextArea.setText("Product: Cuts");
             //   break;
         //   case "HydeoXYCut Hardcore Elite":
         //       infoTextArea.setText("Product: HydeoXYCut Hardcore Elite");
         //       break;
          //  case "Gold Creatine":
            //    infoTextArea.setText("Product: Gold Creatine");
           //     break;
           // case "Applied Nutrition":
           //     infoTextArea.setText("Product: Applied Nutrition");
             //   break;
           // case "Plantinum Creatine":
          //      infoTextArea.setText("Plantinum Creatine");
          //      break;
               
          //  }    
                
       // }
   // }
    
   // @FXML
   // private void radioButtononSSelect(ActionEvent event){
    //    RadioButton selectedRadioButton=(RadioButton)toggleGroup.getSelectedToggle();
     //   if(selectedRadioButton!=null){
      //      String feedback= selectedRadioButton.getText();
      //      infoTextArea.appendText("\nFeedback: " +  feedback);
       // }
       
  //  }
//}
