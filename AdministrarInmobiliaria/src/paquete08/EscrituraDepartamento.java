package paquete08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete06.Departamento;

public class EscrituraDepartamento {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Departamento registro;
    private ArrayList<Departamento> listaDepartamento;

    public EscrituraDepartamento(String nombreArchivo) throws FileNotFoundException, IOException {
        this.nombreArchivo = nombreArchivo;
        salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        if (getListaDepartamento().size()>0) {
            for (int i = 0; i < getListaDepartamento().size(); i++) {
                setRegistro(getListaDepartamento().get(i));
                getSalida();
            }
        }
    }
    
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void setRegistro(Departamento p){
        registro = p;
    }
    
    public void setSalida() throws IOException{
        salida.writeObject(registro);
    }
    
    public void setListaDepartamento(){
        LecturaDepartamento 1 = new LecturaDepartamento(getNombreArchivo());
        1.setDepartamentos();
        listaDepartamento = 1.ObtenerDepartamento();
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
