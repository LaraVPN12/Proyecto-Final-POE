
package Model;

import Model.Consultorio;
import Model.Medico;
import Model.Paciente;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cita {
    private final SimpleIntegerProperty id_cita;
    Paciente paciente;
    Medico medico;
    Consultorio consultorio;
    private final SimpleStringProperty fecha;
    private final SimpleStringProperty hora;
    private final SimpleBooleanProperty pendiente;
    
    public IntegerProperty id_citaProperty(){return id_cita;}
    public StringProperty fechaProperty(){return fecha;}
    public StringProperty horaProperty(){return hora;}
    public BooleanProperty pendienteProperty(){return pendiente;}
    
    public Cita(){
        this(0, null, null, null, "", "", true);
    }
    public Cita(int id_cita, Paciente paciente, Medico medico, Consultorio consultorio, String fecha, String hora, boolean pendiente){
        this.id_cita = new SimpleIntegerProperty(id_cita);
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.fecha = new SimpleStringProperty(fecha);
        this.hora = new SimpleStringProperty(hora);
        this.pendiente = new SimpleBooleanProperty(pendiente);
    }
    public int getId_cita(){
        return id_cita.get();
    }
    public void setId_cita(int id_cita){
        this.id_cita.set(id_cita);
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public String getFecha(){
        return fecha.get();
    }
    public void setFecha(String fecha){
        this.fecha.set(fecha);
    }
    public String getHora(){
        return hora.get();
    }
    public void setHora(String hora){
        this.hora.set(hora);
    }
    public Boolean getPendiente(){
        return pendiente.get();
    }
    public void setPendiente(Boolean pendiente){
        this.pendiente.set(pendiente);
    }
    
    
}
