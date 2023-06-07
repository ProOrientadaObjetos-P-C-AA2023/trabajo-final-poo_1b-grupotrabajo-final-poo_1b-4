package paquete05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete01.LecturaArchivo;

public class EscrituraConstructora {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Constructora registroConstructora;
    private ArrayList<Constructora> listaConstructora;
    
    public EscrituraConstructora(String n){
        nombreArchivo = n;
        setListaConstructora();
        try{
            salida = new ObjectOutputStream(
            new FileOutputStream(nombreArchivo));
            if (getListaConstructoras().size()>0) {
                for (int i = 0; i < getListaConstructoras().size(); i++) {
                    setRegistroConstructora(getListaConstructoras().get(i));
                    setSalidaConstructora();
                }
            }
        }catch(IOException ioException){
            System.out.println("ERROR AL ABRIR EL ARCHIVO.");
        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public void setRegistroConstructora(Constructora c){
        registroConstructora = c;
    }
    public void setSalidaConstructora(){
        try{
            salida.writeObject(registroConstructora);
        }catch(IOException ex){
            System.out.println("ERRROR AL ESCRIBIR EL ARCHIVO.");
        }
    }
    private void setListaConstructora() {
        LecturaArchivo l = new LecturaArchivo(getNombreArchivo());
        l.setListaConstructoras();
        listaConstructora = l.getConstructoras();
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Constructora> getListaConstructoras(){
        return listaConstructora;
    }
    public ObjectOutputStream getSalidaConstructora(){
        return salida;
    }
    public void cerrarArchivo(){
        try{
            if (salida != null) {
                salida.close();
            }
        }catch (IOException ioException){
            System.out.println("ERROR AL CERRAR EL ARCHIVO.");
        }
    }
}
