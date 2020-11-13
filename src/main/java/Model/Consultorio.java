
package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Consultorio {
    private final SimpleIntegerProperty id_consultorio;
    private final SimpleStringProperty departamento;
    private final SimpleStringProperty municipio;
    private final SimpleStringProperty telefono;
    private final SimpleStringProperty direccion;
    private final SimpleStringProperty nombre_consultorio;
    
    public IntegerProperty id_consultorioProperty(){return id_consultorio;}
    public StringProperty departamentoProperty(){return departamento;}
    public StringProperty municipioProperty(){return municipio;}
    public StringProperty telefonoProperty(){return telefono;}
    public StringProperty direccionProperty(){return direccion;}
    public StringProperty nombre_consultorioProperty(){return nombre_consultorio;}
    
    public Consultorio(){
        this(0, "", "", "", "", "");
    }
    public Consultorio(int id_consultorio, String departamento, String municipio, String telefono, String direccion, String nombre){
        this.id_consultorio = new SimpleIntegerProperty(id_consultorio);
        this.departamento = new SimpleStringProperty(departamento);
        this.municipio = new SimpleStringProperty(municipio);
        this.telefono = new SimpleStringProperty(telefono);
        this.direccion = new SimpleStringProperty(direccion);
        this.nombre_consultorio = new SimpleStringProperty(nombre);
    }
    public int getId_consultorio(){
        return id_consultorio.get();
    }
    public void setId_consultorio(int id_consultorio){
        this.id_consultorio.set(id_consultorio);
    }
    public String getDepartamento(){
        return departamento.get();
    }
    public void setDepartamento(String departamento){
        this.departamento.set(departamento);
    }
     public String getMunicipio(){
        return departamento.get();
    }
    public void setMunicipio(String municipio){
        this.municipio.set(municipio);
    }
     public String getTelefono(){
        return telefono.get();
    }
    public void setTelefono(String telefono){
        this.telefono.set(telefono);
    }
     public String getDireccion(){
        return direccion.get();
    }
    public void setDireccion(String direccion){
        this.direccion.set(direccion);
    }
     public String getNombre_consultorio(){
        return nombre_consultorio.get();
    }
    public void setNombre_consultorio(String nombre_consultorio){
        this.nombre_consultorio.set(nombre_consultorio);
    }
}
