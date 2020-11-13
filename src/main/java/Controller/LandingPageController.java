/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Helpers.Dialogs;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kjlme
 */
public class LandingPageController implements Initializable {

    @FXML
    private Button btnAdmin;
    @FXML
    private Button btnRegistros;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnMedicos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAdmin(ActionEvent event) {
        try{
           Parent root = FXMLLoader.load(getClass().getResource("/View/Admin.fxml"));
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.setResizable(false);
           stage.setTitle("Administración");
           stage.show();
           
       }catch(IOException e){
           Dialogs.showErrorDialog("Error", null, "No ha sido posible abrir la ventana");
       }
    }

    @FXML
    private void handleRegistros(ActionEvent event) {
       try{
           Parent root = FXMLLoader.load(getClass().getResource("/View/Principal.fxml"));
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.setResizable(false);
           stage.setTitle("Registros Médicos");
           stage.show();
           
       }catch(IOException e){
           Dialogs.showErrorDialog("Error", null, "No ha sido posible abrir la ventana");
       }
    }

    @FXML
    private void handleSalir(ActionEvent event) {
        Stage stage = (Stage)btnSalir.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleMedicos(ActionEvent event) {
        
    }
    
}
