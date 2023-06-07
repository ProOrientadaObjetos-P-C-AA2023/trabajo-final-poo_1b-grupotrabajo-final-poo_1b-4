package paquete02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

public class EscrituraPropietario {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Propietario registroPropietario;
    private ArrayList<Propietario> ListaPropietario;

    public EscrituraPropietario(String n) {
        nombreArchivo = n;
        setListaPropietarios();
        try{
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (getListaPropietarios().size()>0) {
                for (int i = 0; i < getListaPropietarios().size(); i++) {
                    setRegistroPropietario(getListaPropietarios().get(i));
                    setSalidaPropietario();
                }
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL ABRIR EL ARCHIVO");
        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroPropietario(Propietario p){
        registroPropietario    = p;
    }
    public void setSalidaPropietario(){
        try{
            salida.writeObject(registroPropietario);
        }catch(IOException ex){
            System.out.println("ERROR AL ESCRIBIR EL ARCHIVO.");
        }
    }

    private void setListaPropietarios() {
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaPropietarios();
        ListaPropietario = l.getPropietarios();
    }
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public ArrayList<Propietario> getListaPropietarios(){
        return ListaPropietario;
    }
    public ObjectOutputStream getSalidaPropietario(){
        return salida;
    }
    public void cerrrarArchivo(){
        try{
            if (salida!=null) {
                salida.close();
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL CERRAR EL ARCHIVO");
        }
    }  
}
