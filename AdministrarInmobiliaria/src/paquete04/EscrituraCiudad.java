package paquete04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

public class EscrituraCiudad {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Ciudad registroCiudad;
    private ArrayList<Ciudad> listaCiudades;
    
    public EscrituraCiudad(String n){
        nombreArchivo = n;
        setListaCiudades();
        try{
            salida = new ObjectOutputStream(
            new FileOutputStream(nombreArchivo));
            if (getListaCiudades().size()>0) {
                for (int i = 0; i < getListaCiudades().size(); i++) {
                    setRegistroCiudad(getListaCiudades().get(i));
                    setSalidaCiudad();
                }

            }
        }catch(IOException ioException){
            System.out.println("ERROR AL ABRIR EL ARCHIVO.");
        }
    }
    public void setNombreArhivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroCiudad(Ciudad c ){
        registroCiudad = c;
    }
    public void setSalidaCiudad(){
        try{
            salida.writeObject(registroCiudad);
        }catch(IOException ex){
            System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO.");
        }
    }
    private void setListaCiudades() {
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaCiudades();
        listaCiudades = l.getCiudades();
    }
    private String getNombreArchivo(){
        return nombreArchivo;
    }
    private  ArrayList<Ciudad> getListaCiudades(){
        return listaCiudades;
    }
    public ObjectOutputStream getSalida(){
        return salida;
    }
    public void cerrarArchivo(){
        try{
            if (salida != null ) {
                salida.close();
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL CERRAR EL ARCHIVO.");
        }
    }
}
