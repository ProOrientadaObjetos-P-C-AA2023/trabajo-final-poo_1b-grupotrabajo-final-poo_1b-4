package paquete01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
import paquete07.EscrituraCasa;
import paquete07.LecturaCasa;
import paquete08.EscrituraDepartamento;
import paquete08.LecturaDepartamento;


public class Ejecutor {
    public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
    boolean bandera = true;
    while (bandera){
            System.out.printf("%s\n%s\n%s\n%s\n%s",
                    "OPCIONES",
                    "INGRESAR CASA        [1]",
                    "LISTAR CASA          [2]",
                    "INGRESE DEPARTAMENTO [3]",
                    "LISTAR DEPARTAMENTO  [4]");
            int opcion = entrada.nextInt();
            if (opcion ==1) {
                try {
                    agregarCasa();
                } catch (IOException ex) {
                    Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("CASA CREADA");
            }else{
                if (opcion ==2 ) {
                    verCasa();
                }else{
                    if (opcion == 3) {
                        try {
                            agregarDepartamento();
                        } catch (IOException ex) {
                            Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("DEPARTAMEDNTO CREADO");
                    }else{
                        if (opcion == 4) {
                            verDepartamento();                            
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("DESEA SALIR DEL PROCESO. INGRESE; /SÍ/ ");
            String salida = entrada.nextLine();
            if (salida.equals("SÍ")) {
                bandera = false;
            }
            
    }
}

    private static void agregarCasa() throws IOException, IOException {
        String nombreaArchivo = "datos/casa.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL PROPIETARIO:");
        String nombre = entrada.nextLine();
        System.out.println("INGRESE LOS APELLIDOS");
        String apellidos = entrada.nextLine();
        System.out.println("IDENTIFICACION DEL PROPIETARIO: ");
        int id = entrada.nextInt();
        System.out.println("INGRESE EL PRECIO DE LA CASA POR METROS CUADSRADOS:");
        double precio = entrada.nextDouble();
        System.out.println("INGRESE EL NUMERO DE METROS CUADRADOS: ");
        double cantM2 = entrada.nextDouble();
        System.out.println("INGRESE EL NOMBRE DEL BARRIO:");
        String barrioo = entrada.nextLine();
        System.out.println("INGRESE UNA REFERENCIA: ");
        String referencia = entrada.nextLine();
        System.out.println("INGRESE lA CIUDAD:");
        String ciudadd = entrada.nextLine();
        System.out.println("INGRESE PROVINCIA: ");
        String provincia =entrada.nextLine();
        System.out.println("INGRESE NUMERO DE CUARTOS: ");
        int numeroC = entrada.nextInt();
        System.out.println("INGRESE LA CONSTRUCTORA");
        String constructoraa = entrada.nextLine();
        System.out.println("ID DE LA EMPRESA: ");
        int ID = entrada.nextInt();
        Propietario propietario = new Propietario(nombre,apellidos,id );
        Barrio barrio = new Barrio(barrioo,referencia);
        Ciudad ciudad = new Ciudad(ciudadd,provincia);
        Constructora constructora = new Constructora(constructoraa,ID);
        Casa casa = new Casa(precio,cantM2,numeroC);
        casa.getPropietario(propietario);
        casa.getBarrio(barrio);
        casa.getCiudad(ciudad);
        casa.getConstrutora(constructora);
        EscrituraCasa archivo = new EscrituraCasa(nombreaArchivo);
        archivo.setRegistro(casa);
        archivo.setSalida();
        archivo.cerrarArchivo();
    }
    private static void verCasa() {
        String nombreArchivo = "data/casa,dat";
        LecturaCasa lectura = new LecturaCasa(nombreArchivo);
        lectura.setCasa();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    private static void agregarDepartamento() throws IOException{
        String nombreaArchivo = "datos/departamento.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL PROPIETARIO:");
        String nombre = entrada.nextLine();
        System.out.println("INGRESE LOS APELLIDOS");
        String apellidos = entrada.nextLine();
        System.out.println("IDENTIFICACION DEL PROPIETARIO: ");
        int id = entrada.nextInt();
        System.out.println("INGRESE EL PRECIO DE LA CASA POR METROS CUADSRADOS:");
        double precio = entrada.nextDouble();
        System.out.println("INGRESE EL NUMERO DE METROS CUADRADOS: ");
        double cantM2 = entrada.nextDouble();
        System.out.println("INGRESE EL VALOR ALICUOTA MENSUAL: ");
        double valorAli = entrada.nextDouble();
        System.out.println("INGRESE EL NOMBRE DEL BARRIO:");
        String barrioo = entrada.nextLine();
        System.out.println("INGRESE UNA REFERENCIA: ");
        String referencia = entrada.nextLine();
        System.out.println("INGRESE lA CIUDAD:");
        String ciudadd = entrada.nextLine();
        System.out.println("INGRESE PROVINCIA: ");
        String provincia =entrada.nextLine();
        System.out.println("INGRESE EL NOMBRE DEL EDIFICIO: ");
        String nombreEd = entrada.nextLine();
        System.out.println("UBICACION DEL DEPARTAMENTO: ");
        String ubi = entrada.nextLine();
        System.out.println("INGRESE LA CONSTRUCTORA");
        String constructoraa = entrada.nextLine();
        System.out.println("ID DE LA EMPRESA: ");
        int ID = entrada.nextInt();
        Propietario propietario = new Propietario(nombre,apellidos,id );
        Barrio barrio = new Barrio(barrioo,referencia);
        Ciudad ciudad = new Ciudad(ciudadd,provincia);
        Constructora constructora = new Constructora(constructoraa,ID);
        Departamento departamento = new Departamento(precio,cantM2,valorAli,nombreEd,ubi);
        departamento.getPropietario(propietario);
        departamento.getBarrio(barrio);
        departamento.getCiudad(ciudad);
        departamento.getConstrutora(constructora);
        EscrituraDepartamento archivo = new EscrituraDepartamento(nombreaArchivo);
        archivo.setRegistro(departamento);
        archivo.setSalida();
        archivo.cerrarArchivo();
    }

    private static void verDepartamento() {
        String nombreArchivo = "data/departamento.dat";
        LecturaDepartamento lectura = new LecturaDepartamento(nombreArchivo);
        lectura.setDepartamento();
        lectura.cerrarArchivo();
    }
}
