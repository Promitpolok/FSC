/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CustomerSupportSpecialist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewMembershipsController implements Initializable {

    @FXML
    private TableView<String> MembershipTableView;
    @FXML
    private TableColumn<Members, String> NameTableColumn;
    @FXML
    private TableColumn<Members, String> IDTableColumn;
    @FXML
    private TableColumn<Members, String> AddressTableColumn;
    @FXML
    private TableColumn<Members, String> MembershipTypeTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoBackOnClick(ActionEvent event) {
        Parent root = null;
FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CustomerSpecialistDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

CustomerSpecialistDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
    }

    @FXML
    private void ShowMembershipOnClick(ActionEvent event) {
        for(Members s: MembershipList){
            MembershipTableView.getItems().add(s);
    }
    
}
