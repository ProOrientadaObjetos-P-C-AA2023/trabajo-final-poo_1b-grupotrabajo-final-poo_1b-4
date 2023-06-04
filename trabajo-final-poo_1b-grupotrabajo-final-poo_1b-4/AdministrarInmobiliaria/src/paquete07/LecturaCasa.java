package paquete07;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.File;
import paquete06.Casa;

public class LecturaCasa {
     private ObjectInputStream entrada;
    private ArrayList<Casa> casa;
    private String  nombreCasa;
    private Casa registroCasa;
    
    public LecturaCasa(String n) {
        nombreCasa = n;
        File f = new File(nombreCasa);
        if (f.exists()) {
            try
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }
            catch (IOException ioException){
                System.out.println("ERROR AL ABRIR EL ARCHIVO." + ioException);
            }
        }
    }
    
    public void setNombreArchivo(String n){
        nombreCasa = n;
    }
    public void setCasa() {
        casa = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                   Casa registro = (Casa) entrada.readObject();
                   casa.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO: "+ ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL OBJETO: "+ ex );
                }catch(Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO: "+ ex );
                }
            }
        }
    }
    public void setRegistroBuscado(String cadena){
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while (true){
                try{
                    Casa registro = (Casa) entrada.readObject();
                    if (!registro.getConstrutora().equals(cadena)) {
                    } else {
                        registroCasa = registro;
                    }
                }catch (EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LEER EL ARCHIVO: "+ ex);
                }catch (ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL OBJETO: "+ ex);
                }catch (Exception ex){
                    System.out.println("NO HAY DATOS EN EL ARCHIVO: "+ ex);
                }
            }
        }
    }
    public ArrayList<Casa> getCasa(){
        return casa;
    }
    public String getNombreArchivo(){
        return nombreCasa;
        
    }
    @Override
    public String toString(){
        String cadena = "Lista de Casa\n";
        for (int i = 0; i < getCasa().size(); i++) {
            Casa p = getCasa().get(i);
            cadena = String.format("%s(%d) %s-%d-%s\n", cadena, i + 1, p.getPropietario(),p.getPrecioMetroCuadrado(),
                    p.getNumeroMetrosCuadrado(),p.getCostoFinal(),p.getBarrio(),
                    p.getCiudad(),p.getConstrutora());
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
            System.out.println("ERROR AL CERRAR EL ARCHIVO: ");    
            System.out.println(1);
        }
    }
}

