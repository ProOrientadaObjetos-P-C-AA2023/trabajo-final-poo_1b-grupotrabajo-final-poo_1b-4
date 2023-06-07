package paquete01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

public class LecturaArchivo {
    private ObjectInputStream entrada;
    private ArrayList<Casa> casas;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Barrio> barrios;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Constructora> constructoras;
    private String nombreArchivo;
    
    public LecturaArchivo(String n){
        nombreArchivo = n;
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            try{
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }catch(IOException ioException){
                System.out.println("ERROR AL ARBRIR EL ARCHIVO.");
            }

        }
    }
    public void setNombreArchivo(String n){
        nombreArchivo = n;
        
    }public void setListaCasas(){
        casas = new ArrayList<>();
        File f = new File(getNombreArchivo());
            if (f.exists()) {
                while (true){
                try{
                    Casa registro = (Casa) entrada.readObject();
                    casas.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL OBJETO:" +ex);
                }catch(Exception ex){
                    break;
                }
            }
        }
    }
    public void setListaDepartametnos(){
        departamentos = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.equals(f)) {
            while(true){
                try{
                    Departamento registro = (Departamento) entrada.readObject();
                    departamentos.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LLER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL ARCHIVO: " + ex);
                }catch(Exception ex){
                    break;
                }
            }
        }
    }
    public void setListaPropietarios() {
        propietarios = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietarios.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("ERROR AL LEER EL ARCHIVO: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("NO SE PUDO CREAR EL OBJETO:" + ex);
                } catch (Exception ex) {
                    break;
                }
            }
        }

    }

    public void setListaBarrios(){
        barrios = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Barrio registro= (Barrio)entrada.readObject();
                    barrios.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LEER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL OBJETO:" + ex);
                }catch(Exception ex){
                    break;
                }
            }
        }
    }
    public void setListaCiudades(){
        ciudades = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Ciudad registro = (Ciudad)entrada.readObject();
                    ciudades.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LEER EL ARCHIVO:" + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUDO CREAR EL OBJETO:" + ex);
                }catch(Exception ex){
                    break;
                }
            }
        }
    }
    public void setListaConstructoras(){
        constructoras = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while(true){
                try{
                    Constructora registro = (Constructora) entrada.readObject();
                    constructoras.add(registro);
                }catch(EOFException endOfFileException){
                    return;
                }catch(IOException ex){
                    System.out.println("ERROR AL LEER EL ARCHIVO: " + ex);
                }catch(ClassNotFoundException ex){
                    System.out.println("NO SE PUEDO CREAR EL OBJETO:" + ex);
                }catch(Exception ex){
                    break;
                }
            }
        }
    }
    public ArrayList<Casa> getListaCasas(){
        return casas;
    }
    public ArrayList<Departamento> getDepartamentos(){
        return departamentos;
    }
    public ArrayList<Propietario> getPropietarios(){
        return propietarios;
    }
    public ArrayList<Barrio> getBarrios(){
        return barrios;
    }
    public ArrayList<Ciudad>getCiudades(){
        return ciudades;
    }
    public ArrayList<Constructora>getConstructoras(){
        return constructoras;
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public void cerrarArchivo(){
        try{
            if (entrada != null) {
                entrada.close();
            }
        }catch(IOException ioException){
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
    public String MostrarEnPantallaPropietarios(){
        String cadena = "******************\n"
                + "Listado de Propietarios INgresados:\n";
        for (int i = 0; i < propietarios.size(); i++) {
                     
        cadena = String.format("%s(Propiteario Numero %d)\nNombres Del "
                    + "Propiteario: %s\nApellidos Del Propiteario: %s\n"
                    + "Identificacion Del Propiteario(Cedula): %s\n",
                    cadena,
                    i + 1,
                    propietarios.get(i).getNombres(),
                    propietarios.get(i).getApellidos(),
                    propietarios.get(i).getIdentificacion());        
            }
        return cadena;
    }
    public String MostrarenPnatallaBarrios(){
        String cadena = "******************\n"
                + "Listado De Barrios Ingresados:\n";
        for (int i = 0; i < barrios.size(); i++) {
            cadena = String.format("%s(Barrio Numero %d)\nNombre Del Barrio: "
                    + "%s\nReferencia Para Encontrar El Barrio: %s\n",
                    cadena,
                    i + 1,
                    barrios.get(i).getNombre(),
                    barrios.get(i).getReferencia());
        }
        return cadena;
    }
    public String MostrarenPantallaCiudades(){
        String cadena = "******************\n"
                + "Listado De Ciudades Ingresadas:\n";
        for (int i = 0; i < ciudades.size(); i++) {
                        cadena = String.format("%s(Ciudad Numero %d)\n Nombre De La Ciudad: "
                    + "%s\nNombre De La Provincia: %s\n",
                    cadena,
                    i + 1,
                    ciudades.get(i).getNombreCiudad(),
                    ciudades.get(i).getNombreProvincia());
        }
        return cadena;
    }
    public String MostrarenPantallaConstructoras(){
        String cadena = "******************\n"
                + "Listado De Constructoras Ingresadas:\n";
        for (int i = 0; i < constructoras.size(); i++) {
            cadena = String.format("%s(Constructora Numero %d)\nNombre De La "
                    + "Constructora: %s\n Id De La Constructora %s\n",
                    cadena,
                    i + 1,
                    constructoras.get(i).getNombre(),
                    constructoras.get(i).getIdEmpresa());
        }
        return cadena;
    }
    public String MostrarenPantallaCasas(){
        String cadena = "******************\n"
                + "Listado De Casas Ingresadas\n";
        for (int i = 0; i < casas.size(); i++) {
            Casa c = casas.get(i);
            cadena = String.format("%sCasa Numero %d\nInformacion Basica De"
                    + "La Casa:\nDatos Del Propietario Encontrado O Ingresado\n"
                    + "Nombres: %s\nApellidos: %s\nIdentificacion: %s\n"
                    + "Datos Del Barrio Encontrado O Ingresado\nNombre Del "
                    + "Barrio Del Propietario: %s\nReferencia Para Hallar El "
                    + "Barrio %s\nDatos De La Ciudad Encontrada O Ingresada\n"
                    + "Nombre De La Ciudad: %s\nNombre De La Provincia: %s\n"
                    + "Datos De La Constructora Ingresados O Encontrados\n"
                    + "Nombre De La Constructora: %s\nID De La constructora: "
                    + "%s\nCaracteristicas De La Casa\nPrecio Del Metro Cuadrado:"
                    + " %.2f\nNumero De Metros Cuadrados: %.2f\nNumero De "
                    + "Cuartos: %d\nCosto final: %.2f\n",
                    cadena,
                    (i + 1),
                    c.getPropietario().getNombres(),
                    c.getPropietario().getApellidos(),
                    c.getPropietario().getIdentificacion(),
                    c.getBarrio().getNombre(),
                    c.getBarrio().getReferencia(),
                    c.getCiudad().getNombreCiudad(),
                    c.getCiudad().getNombreProvincia(),
                    c.getConstructora().getNombre(),
                    c.getConstructora().getIdEmpresa(),
                    c.getPrecioMetroCuadrado(),
                    c.getNumeroMetrosCuadrado(),
                    c.getNumeroCuartos(),
                    c.getCostoFinal());
        }
        return cadena;
    }
    public String MostrarEnPantallaDepartamentos() {
        String cadena = "******************\n"
                + "Listado De Departamentos Ingresados\n";
        for (int i = 0; i < departamentos.size(); i++) {
            cadena = String.format("%s(Departamento Numero %d)\nInformacion "
                    + "Basica Del Departamento\nDatos Del Propietario Encontrado "
                    + "O Ingresado\nNombres: %s\nApellidos: %s\nIdentificacion: "
                    + "%s\nDatos Del Barrio Encontrado O Ingresado\nNombre Del "
                    + "Barrio Del Propietario: %s\nReferencia Para Hallar El "
                    + "Barrio %s\nDatos De La Ciudad Encontrada O Ingresada\n"
                    + "Nombre De La Ciudad: %s\nNombre De La Provincia: %s\n"
                    + "Datos De La Constructora Ingresados O Encontrados\n"
                    + "Nombre De La Constructora: %s\nID De La constructora: "
                    + "%s\nCaracteriticas De La Departamento\n"
                    + "Nombre Edificio: %s\nUbicación Edificio: %s\n"
                    + "Precio por metro cuadrado: %.2f Numero de metros cuadrados: %.2f\n"
                    + "Valor Alícuota Mensual: %.2f\nCosto final: %.2f\n",
                    cadena,
                    i + 1,
                    departamentos.get(i).getPropietario().getNombres(),
                    departamentos.get(i).getPropietario().getApellidos(),
                    departamentos.get(i).getPropietario().getIdentificacion(),
                    departamentos.get(i).getBarrio().getNombre(),
                    departamentos.get(i).getBarrio().getReferencia(),
                    departamentos.get(i).getCiudad().getNombreCiudad(),
                    departamentos.get(i).getCiudad().getNombreProvincia(),
                    departamentos.get(i).getConstructora().getNombre(),
                    departamentos.get(i).getConstructora().getIdEmpresa(),
                    departamentos.get(i).getNombreEdisicio(),
                    departamentos.get(i).getUbicacion(),
                    departamentos.get(i).getPrecioMetroCuadrado(),
                    departamentos.get(i).getNumeroMetrosCuadrado(),
                    departamentos.get(i).getValorAlicuotaMensual(),
                    departamentos.get(i).getCostoFinal());

        }
        return cadena;
    }
}

        


