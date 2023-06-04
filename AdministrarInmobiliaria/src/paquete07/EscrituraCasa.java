package paquete07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete06.Casa;

public class EscrituraCasa {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Casa registro;
    private ArrayList<Casa> listaCasa;

    public EscrituraCasa(String nombreArchivo) throws FileNotFoundException, IOException {
        this.nombreArchivo = nombreArchivo;
        salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        if (getListaCasa().size()>0) {
            for (int i = 0; i < getListaCasa().size(); i++) {
                setRegistro(getListaCasa().get(i));
                getSalida();
            }
        }
    }
    
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void setRegistro(Casa p){
        registro = p;
    }
    
    public void setSalida() throws IOException{
        salida.writeObject(registro);
    }
    
    public void setListaCasa(){
        LecturaCasa 1 = new LecturaCasa(getNombreArchivo());
        1.setCasas();
        listaCasa = 1.ObtenerCasa();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public ArrayList<Casa> getListaCasa() {
        return listaCasa;
    }
    
    public void cerrarArchivo(){
        try{
        if (salida != null) {
            salida.close();
        }
        }
        catch(IOException ioException){
            System.err.println("Error al cerrar el archivo");
        }
    }
}
