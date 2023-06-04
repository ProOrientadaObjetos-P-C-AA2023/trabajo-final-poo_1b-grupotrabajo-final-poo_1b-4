package paquete01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import paquete06.Casa;
import paquete06.Departamento;
import paquete07.EscrituraCasa;
import paquete07.LecturaCasa;
import paquete08.EscrituraDepartamento;
import paquete08.LecturaDepartamento;


public class Ejecutor {
    Scanner entrada = new Scanner (System.in);
    boolean bandera = true;
    while (bandera){
            System.out.println("%s\n%s\n%s\n%s\n%s\n%s\n",
                    "OPCIONES",
                    "INGRESAR CASA        [1]",
                    "LISTAR CASA          [2]",
                    "INGRESE DEPARTAMENTO [3]",
                    "LISTAR DEPARTAMENTO  [4]");
            int opcion = entrada.nextInt();
            if (opcion ==1) {
                agregarCasa();
                System.out.println("CASA CREADA");
            }else{
                if (opcion ==2 ) {
                    verCasa();
                }else{
                    if (opcion == 3) {
                        agregarDepartamento();
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

    private static void agregarCasa() throws IOException, IOException {
        String nombreaArchivo = "data/Casa.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL PROPIETARIO:");
        String nombre = entrada.nextLine();
        System.out.println("INGRESE EL PRECIO DE LA CASA POR METROS CUADSRADOS:");
        double precio = entrada.nextDouble();
        System.out.println("COSTO FINAL:");
        double costofinal = entrada.nextDouble();
        System.out.println("INGRESE EL BARRIO:");
        String barrio = entrada.nextLine();
        System.out.println("INGRESE lA CIUDAD:");
        String ciudad = entrada.nextLine();
        System.out.println("INGRESE LA CONSTRUCTORA");
        String constructora = entrada.nextLine();
        Casa c = new Casa(nombre,precio,barrio,ciudad,costofinal,constructora);
        EscrituraCasa archivo = new EscrituraCasa(nombreaArchivo);
        archivo.setRegistro(c);
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

    private static boolean agregarDepartamento() throws IOException {
        boolean bandera = false;
        String nombreArchivo = "data/departamento.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL PROPIETARIO:");
        String nombre = entrada.nextLine();
        System.out.println("INGRESE EL PRECIO POR METRO CUDRADO:");
        double precio = entrada.nextDouble();
        System.out.println("NUMERO DE METROS CUADRADOS:");
        double numero = entrada.nextDouble();
        System.out.println("VALOR ALICUOTA FINAL");
        double valor = entrada.nextDouble();
        System.out.println("COSTO FINAL:");
        double costofinal = entrada.nextDouble();
        System.out.println("INGRESE EL BARRIO");
        String barrio = entrada.nextLine();
        System.out.println("INGRESE EL NOMBRE DEL EDIFICIO");
        String edificio = entrada.nextLine();
        System.out.println("INGRESE LA UNICACION DEL EDIFICIO:");
        String ubicacionedificio = entrada.nextLine();
        System.out.println("INGRESE LA CONTRUCTORA: ");
        String contructora = entrada.nextLine();
        String nombreArchivoDepartamento = "data/departamento.dat";
        LecturaDepartamento lectura = new LecturaDepartamento(nombreArchivoDepartamento);
        lectura.setDepartamento();
        ArrayList<Departamento> d = lectura.getDepartamento();
        if (d != null ) {
            EscrituraDepartamento archivo = new EscrituraDepartamento(nombreArchivo);
            Departamento d = new Departamento(nombre,precio,numero,valor,costofinal,barrio,edificio,ubicacionedificio,contructora);
            archivo.setRegistro(d);
            archivo.setSalida();
            archivo.cerrarArchivo();
            bandera = true;
        }
        return bandera;
        
    }

    private void verDepartamento() {
        String nombreArchivo = "data/departamento.dat";
        LecturaDepartamento lectura = new LecturaDepartamento(nombreArchivo);
        lectura.setDepartamento();
        lectura.cerrarArchivo();
    }
}
