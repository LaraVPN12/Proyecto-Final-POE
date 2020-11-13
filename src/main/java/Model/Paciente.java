
package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Paciente {
    private final SimpleIntegerProperty id_paciente;
    private final SimpleStringProperty primer_nombre;
    private final SimpleStringProperty segundo_nombre;
    private final SimpleStringProperty primer_apellido;
    private final SimpleStringProperty segundo_apellido;
    private final SimpleStringProperty fecha;
    private final SimpleStringProperty sexo;
    private final SimpleStringProperty numero_emergencia;
    
    public IntegerProperty id_pacienteProperty(){return id_paciente;}
    public StringProperty primer_nombreProperty(){return primer_nombre;}
    public StringProperty segundo_nombreProperty(){return segundo_nombre;}
    public StringProperty primer_apellidoProperty(){return primer_apellido;}
    public StringProperty segundo_apellidoProperty(){return segundo_apellido;}
    public StringProperty fechaProperty(){return fecha;}
    public StringProperty sexoProperty(){return sexo;}
    public StringProperty numero_emergenciaProperty(){return numero_emergencia;}
    
    public Paciente(){
        this(0, "", "", "", "", "", "", "");
    }
    public Paciente(int id_paciente, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido,
            String fecha, String sexo, String numero){
        this.id_paciente = new SimpleIntegerProperty(id_paciente);
        this.primer_nombre = new SimpleStringProperty(primer_nombre);
        this.segundo_nombre = new SimpleStringProperty(segundo_nombre);
        this.primer_apellido = new SimpleStringProperty(primer_apellido);
        this.segundo_apellido = new SimpleStringProperty(segundo_apellido);
        this.fecha = new SimpleStringProperty(fecha);
        this.sexo = new SimpleStringProperty(sexo);
        this.numero_emergencia = new SimpleStringProperty(numero);
        
    }
    public int getId_paciente(){
        return id_paciente.get();
    }
    public void setId_paciente(int id_paciente){
        this.id_paciente.set(id_paciente);
    }
    public String getPrimer_nombre(){
        return primer_nombre.get();
    }
    public void setPrimer_nombre(String primer_nombre){
        this.primer_nombre.set(primer_nombre);
    }
    public String getSegundo_nombre(){
        return segundo_nombre.get();
    }
    public void setSegundo_nombre(String segundo_nombre){
        this.segundo_nombre.set(segundo_nombre);
    }
    public String getPrimer_apellido(){
        return primer_apellido.get();
    }
    public void setPrimer_apellido(String primer_apellido){
        this.primer_apellido.set(primer_apellido);
    }
    public String getSegundo_apellido(){
        return segundo_apellido.get();
    }
    public void setSegundo_apellido(String segundo_apellido){
        this.segundo_apellido.set(segundo_apellido);
    }
    public String getFecha(){
        return fecha.get();
    }
    public void setFecha(String Fecha){
        this.fecha.set(Fecha);
    }
    public String getNumero_emergencia(){
        return numero_emergencia.get();
    }
    public void setNumero_emergencia(String numero_emergencia){
        this.numero_emergencia.set(numero_emergencia);
    }
    
}
