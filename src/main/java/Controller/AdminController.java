/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kjlme
 */
public class AdminController implements Initializable {

    @FXML
    private Button btnAgregarMedico;
    @FXML
    private TextField txtNombreMedico;
    @FXML
    private TextField txtApellidoMedico;
    @FXML
    private TextField txtEspecialidadMedico;
    @FXML
    private ComboBox<?> cmbHorario;
    @FXML
    private ComboBox<?> cmbConsultorio;
    @FXML
    private Button btnAgregarConsultorio;
    @FXML
    private TextField txtNombreConsultorio;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private ComboBox<?> cmbDepartamento;
    @FXML
    private ComboBox<?> cmbMunicipio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAgregarMedico(ActionEvent event) {
    }

    @FXML
    private void handleAgregarConsultorio(ActionEvent event) {
    }
    
}
