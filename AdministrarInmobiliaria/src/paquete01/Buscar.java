package paquete01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Buscar {
    private String identificacion;
    private Propietario propietarioBuscado;
    private Ciudad ciudadBuscado;
    private Barrio barrioBuscado;
    private Constructora constructoraBuscado;
    private ObjectInputStream entrada;
    private String nombreArchivo;
    
    public Buscar (String n){
        nombreArchivo = n;
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            try{
                entrada = new ObjectInputStream(
                            new FileInputStream(n));
            }catch(IOException ioException){
                System.out.println("ERROR AL ABRIR EL ARCHIVO.");
            }
        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public void setIdentificacion(String n){
        identificacion = n;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public void setPropietarioBuscado(){
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Propietario registro = (Propietario) entrada.readObject();
                        if (registro.getIdentificacion().equals(identificacion)){
                        propietarioBuscado = registro;
                        break;
                    }                        
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL ARCHIVO." +ex);
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO:" + ex);
                }
            }
        }
    }
    public void setBarrioBuscado(){
        File f = new File (getNombreArchivo());
        if (f.exists()) {
            while (true){
                try{
                    Barrio registro = (Barrio)entrada.readObject();
                    if (registro.getNombre().equals(entrada)) {
                        barrioBuscado = registro;
                        break;
                    }
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL ARCHIVO." +ex);
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO:" + ex);
                }
            }
        }
    }
    public void setCiudadBuscado(){
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Ciudad registro = (Ciudad) entrada.readObject();
                    if (registro.getNombreCiudad().equals(entrada)) {
                     ciudadBuscado = registro; 
                     break;
                    }
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL ARCHIVO." +ex);
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO:" + ex);
                }
            }
        }
    }
    public void setConstructoraBuscado(){
        File f = new File (getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Constructora registro = (Constructora) entrada.readObject();
                    if (registro.getNombre().equals(entrada)) {
                        constructoraBuscado = registro;
                        break;
                    }
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL ARCHIVO." +ex);
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO:" + ex);
                }
            }
        }
    }
    public Propietario getPropietarioBuscado(){
        return propietarioBuscado;
    }
    public Barrio getBarrioBuscado(){
        return barrioBuscado;
    }
    public Ciudad getCiudadBuscado(){
        return ciudadBuscado;
    }
    public Constructora geteConstructora(){
        return constructoraBuscado;
    }
}
