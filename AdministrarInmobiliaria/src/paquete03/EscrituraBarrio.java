/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

/**
 *
 * @author PREDATOR
 */
public class EscrituraBarrio {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Barrio registroBarrio;
    private ArrayList<Barrio> listaBarrios;
    
    public EscrituraBarrio(String n){
        nombreArchivo = n;
        setListaBarrios();
        try{
            salida = new ObjectOutputStream(
            new FileOutputStream(nombreArchivo));
            if (getListaBarrios().size()>0) {
                for (int i = 0; i < getListaBarrios().size(); i++) {
                    setRegistroBarrio(getListaBarrios().get(i));
                    setSalidaBarrio();
                }
            }
        }catch (IOException ioException){
            System.out.println("ERROR AL ABRIR EL ARCHIVO");
        }
        
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroBarrio(Barrio b){
        registroBarrio = b;
    }
    public void setSalidaBarrio(){
        try{
            salida.writeObject(registroBarrio);
        }catch(IOException ex){
            System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO.");
        }
    }
    private void setListaBarrios(){
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaBarrios();
        listaBarrios = l.getBarrios();
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Barrio> getListaBarrios() {
        return listaBarrios;
    }
    public ObjectOutputStream getSalidaBarrio(){
        return salida;
    }
    public void cerrarArchiv0(){
        try{
            if (salida != null) {
                salida.close();
            }
        }catch (IOException ioException){
            System.out.println("ERROR AL CERRAR EL ARCHIVO.");
        }
    } 
    
}
