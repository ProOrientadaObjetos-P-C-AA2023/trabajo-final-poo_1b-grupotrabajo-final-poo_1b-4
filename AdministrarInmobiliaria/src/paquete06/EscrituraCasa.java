package paquete06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

public final class EscrituraCasa {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Casa registroCasa;
    private ArrayList<Casa> listaCasas;
    
    public EscrituraCasa(String nombreArc){
        nombreArchivo = nombreArc;
        setListaCasas();
        try{
            salida = new ObjectOutputStream(
                     new FileOutputStream(nombreArchivo));
            if (getListaCasas().size()>0) {
                for (int i = 0; i < getListaCasas().size(); i++) {
                    setRegistroCasa(getListaCasas().get(i));
                    setSalidaArchivo();
                }
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL ABRIR EL ARCHIVO.");
        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroCasa(Casa c){
        registroCasa = c;
    }
    public void setSalidaArchivo(){
        try{
            salida.writeObject(registroCasa);
        }catch(IOException ex){
            System.out.println("ERRO AL ESCRIBIR EL ARCHIVO.");
        }
    }
    private void setListaCasas() {
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaCasas();
        listaCasas = l.getListaCasas();
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Casa> getListaCasas(){
        return listaCasas;
    }
    public ObjectOutputStream getSalida(){
        return salida;
    }
    public void cerrarArchivo(){
        try{
            if (salida  != null) {
                salida.close();
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL CERRAR EL ARCHIVO.");
        }
    }
    
}
