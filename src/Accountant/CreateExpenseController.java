/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

import java.io.IOException;
import java.net.URL;
//import java.time.LocalDate;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
//import static javax.management.Query.value;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateExpenseController implements Initializable {

    @FXML
    private ComboBox<String> spendReasonComboBox;
    @FXML
    private TextField amountTextField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TableView<ExpenseReason> tableView;
    @FXML
    private TableColumn<ExpenseReason, String> spendReasonTableColumn;
    @FXML
    private TableColumn<ExpenseReason, String> amountTableColumn;
    @FXML
    private TableColumn<ExpenseReason, String> dateTableColumn; 
    
    private ArrayList <ExpenseReason> expensesReasonList=new ArrayList<>();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
               // expensesReasonList = new ArrayList<>();
                spendReasonComboBox.getItems().addAll(
                       "Electricity Bill",
                       "Water Bill",
                       "Gas Bill",
                       "Internet and Phone Services",
                       "Cleaning and Maintenance Services",
                       "Raw Materials",
                       "Manufacturing Costs",
                       "Packaging",
                       "Marketing and Advertising",
                       "Distribution and Logistics",
                       "Regulatory Compliance",
                       "Employee Salaries",
                       "Customer Support",
                       "Market Research",
                       "Product Liability Insurance"
                ); 
                
                spendReasonTableColumn.setCellValueFactory(new PropertyValueFactory<ExpenseReason, String>("spendReason"));
                amountTableColumn.setCellValueFactory(new PropertyValueFactory<ExpenseReason, String>("amount"));
                dateTableColumn.setCellValueFactory(new PropertyValueFactory<ExpenseReason, String>("date"));
                
                
                
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException { 
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Expenses.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ExpensesController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }

    @FXML
    private void addButtonMouseOnClick(ActionEvent event) { 
        
        Integer LocalDate = null;
        expensesReasonList.add(
                  new ExpenseReason(
                  spendReasonComboBox.getValue(),
                  Float.parseFloat(amountTextField.getText()),
        datePicker.getValue()
                                                          
                )
        
        );
                //spendReasonComboBox.clear();
                amountTextField.clear();
                //datePicker.clear();


    }

    @FXML
    private void showExpenseButtonMouseOnClick(ActionEvent event) { 
        for(ExpenseReason s: expensesReasonList){
            tableView.getItems().add(s);
            
        
        }
        
        
    }

    @FXML
    private void saveButtonMouseOnClick(ActionEvent event) { 
//         File f = null;
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//
//            f = new File("Task.bin");
//
//            if (f.exists()) {
//                fos = new FileOutputStream(f, true);
//                oos = new AppendableObjectOutputStream(fos);
//
//            } else {
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);
//            }
//
//            oos.writeObject(newTask);
//            oos.close();
//            return true;
//
//        } catch (IOException e) {
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
//                }

    }


    
}
