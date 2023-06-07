package paquete08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete06.Departamento;

public final class EscrituraDepartamento {
    private String nombreArchivo;
    private final ObjectOutputStream salida;
    private Departamento registro;
    private ArrayList<Departamento> listaDepartamento;

    public EscrituraDepartamento(String nombreAr) throws FileNotFoundException, IOException{
        this.nombreArchivo = nombreAr;
        salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        listaDepartamento = new ArrayList<>();
        if (!getListaDepartamento().isEmpty()) {
            for (int i = 0; i < getListaDepartamento().size(); i++) {
                setRegistro(getListaDepartamento().get(i));
                setSalida();
            }
        }
    }
    
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void setRegistro(Departamento p){
        registro = p;
    }
    
    public void setSalida(){
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO");
        }
    }
    
    public void setLista(){
        LecturaDepartamento l = new LecturaDepartamento(getNombreArchivo(), null);
        l.setDepartamento();
        listaDepartamento = l.getDepartamento();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public ArrayList<Departamento> getListaDepartamento() {
        return listaDepartamento;
    }
    
    public void cerrarArchivo(){
        try {
            if (salida != null) {
                salida.close();
            }
        } catch(IOException ioException) {
            System.err.println("Error al cerrar el archivo");
        }
    }
}
