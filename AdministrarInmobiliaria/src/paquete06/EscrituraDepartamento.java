package paquete06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

public final class EscrituraDepartamento {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Departamento registroDepartamento;
    private ArrayList<Departamento> listaDepartamentos;
    
    public EscrituraDepartamento (String nombreArc){
        nombreArchivo = nombreArc;
        setListaDepartamento();
        try{
            salida = new ObjectOutputStream(
                     new FileOutputStream(nombreArchivo));
            if (getListaDepartametnos().size() > 0) {
                for (int i = 0; i < getListaDepartametnos().size(); i++) {
                    setRegistroDepartamento(getListaDepartametnos().get(i));
                    setSalidaDepartamento();
                }
            }
        }catch(IOException ioException){
            System.out.println("ERRORAL ABRIR EL ARCHIVO.");
        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroDepartamento(Departamento d){
        registroDepartamento = d;
    }
    public void setSalidaDepartamento() {
        try{
            salida.writeObject(registroDepartamento);
        }catch(IOException ex){
            System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO.");            
        }
    }
    public void setListaDepartamento(){
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaDepartametnos();
        listaDepartamentos = l.getDepartamentos();
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Departamento> getListaDepartametnos(){
        return listaDepartamentos;
    }
    public ObjectOutputStream getSalida(){
        return salida;        
    }
    public void cerrarArchivo(){
        try{
            if (salida != null) {
                salida.close();
            }
        }catch(IOException ioException){
            System.out.println("ERRO AL CERRAR EL ARCHIVO.");
        }
    }
}
