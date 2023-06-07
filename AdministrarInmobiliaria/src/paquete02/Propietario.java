package paquete02;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombres;
    private String apellidos;
    private String identificacion;
    
    public Propietario(String nombres, String apellidos, String identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Propietario: %s\nApellidos del"
                +" Propietario: %s\nIdentificacion del propietario: %s\n", nombres
                ,apellidos
                ,identificacion);
        return cadena;
    }
    

}
