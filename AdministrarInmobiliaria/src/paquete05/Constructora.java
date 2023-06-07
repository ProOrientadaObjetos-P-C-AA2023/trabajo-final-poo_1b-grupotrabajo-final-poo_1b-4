package paquete05;

import java.io.Serializable;

public class Constructora implements Serializable{
    private String nombre;
    private String idEmpresa;


    public Constructora(String nombre, String idEmpresa) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    @Override 
    public String toString(){
        String cadena = String.format("Nombre de la Constructoa: %s\nNombre de"
                + " ID de la constructora %s\n ",
                nombre,
                idEmpresa);
        return cadena;
    }
    
    
}
