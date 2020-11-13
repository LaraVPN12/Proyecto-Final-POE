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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kjlme
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button btnEliminarCita;
    @FXML
    private TableView<?> tblCitas;
    @FXML
    private TableColumn<?, ?> columId;
    @FXML
    private TableColumn<?, ?> columPaciente;
    @FXML
    private TableColumn<?, ?> columDoctor;
    @FXML
    private TableColumn<?, ?> columConsultorio;
    @FXML
    private TableColumn<?, ?> columFecha;
    @FXML
    private TableColumn<?, ?> columHora;
    @FXML
    private TextField txtBusquedaPaciente;
    @FXML
    private Button btnBucarPaciente;
    @FXML
    private Label errorBusqueda;
    @FXML
    private Button btnNuevaCita;
    @FXML
    private Button btnAgregarCita;
    @FXML
    private TableView<?> tblBusqueda;
    @FXML
    private TableColumn<?, ?> columIdPaciente;
    @FXML
    private TableColumn<?, ?> columNombres;
    @FXML
    private TableColumn<?, ?> columApellidos;
    @FXML
    private TableColumn<?, ?> columFechaNacimiento;
    @FXML
    private TextField txtPacienteHistorial;
    @FXML
    private Button btnBuscarHistorial;
    @FXML
    private TableView<?> tblHistorial;
    @FXML
    private TableColumn<?, ?> columIdPacienteH;
    @FXML
    private TableColumn<?, ?> columNombresH;
    @FXML
    private TableColumn<?, ?> columApellidosH;
    @FXML
    private TableColumn<?, ?> columFechaCita;
    @FXML
    private TableColumn<?, ?> columDescripcion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleEliminarCita(ActionEvent event) {
    }

    @FXML
    private void handleBuscarPaciente(ActionEvent event) {
    }

    @FXML
    private void handleNuevaCita(ActionEvent event) {
    }

    @FXML
    private void handleAgregarCita(ActionEvent event) {
    }

    @FXML
    private void handleBuscarHistorial(ActionEvent event) {
    }
    
}
