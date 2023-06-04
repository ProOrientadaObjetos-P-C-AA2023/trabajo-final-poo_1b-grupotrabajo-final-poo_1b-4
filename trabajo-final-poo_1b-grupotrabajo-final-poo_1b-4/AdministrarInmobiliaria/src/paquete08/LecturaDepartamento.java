
package paquete08;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete06.Departamento;

public class LecturaDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamento;
    private String nombredepartamento;
    public LecturaDepartamento(String n){
        nombredepartamento = n;
        File f = new File(nombredepartamento);
        if (f.exists()) {
            try{
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }
            catch (IOException ioException){
                System.out.println("ERROR AL ABRIR EL ARCHIVO: " +ioException);
            }
        }
    }
    public void setNombreArchivo(String n){
        nombredepartamento = n;
    }
    public void setDepartamento(){
        departamento = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Departamento registro = (Departamento) entrada.readObject();
                    departamento.add(registro);
                }catch (EOFException endOfFileException){
                    return;
                }catch (IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO: " +ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NOSE PUDO CREAR EL OBJETO: " + ex);
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO: "+ ex);
                }
            }
        }
    }
    public ArrayList<Departamento> getDepartamento(){
        return departamento;
    }
    public String getNombreArchivo(){
        return nombredepartamento;
    }
    @Override 
    public String toString(){
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < getDepartamento().size(); i++) {
            Departamento p = getDepartamento().get(i);
            cadena = String.format("%s(%d) %s-%d (%s|%s|%d)\n", cadena,
                    i + 1,
                    p.getPropietario(),
                    p.getPrecioMetroCuadrado(),
                    p.getNumeroMetrosCuadrado(),p.getValorAlicuotaMensual(),
                    p.getCostoFinal(),p.getBarrio(),
                    p.getCiudad(),
                    p.getNombre(),p.getUbicacion(),
                    p.getContrutora());
        }
        return cadena;
    }
    public void cerrarArchivo(){
        try{
            if (entrada != null) {
                entrada.close();
            }
        }
        catch(IOException ioException){
            System.out.println("ERROR AL CERAR EL ARCHIVO");
            System.out.println(1);
        }
    }
}
