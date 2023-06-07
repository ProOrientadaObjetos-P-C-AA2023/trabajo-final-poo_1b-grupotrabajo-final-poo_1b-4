package paquete01;
import java.util.Scanner;
import paquete02.EscrituraPropietario;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete03.EscrituraBarrio;
import paquete04.Ciudad;
import paquete04.EscrituraCiudad;
import paquete05.Constructora;
import paquete05.EscrituraConstructora;
import paquete06.Casa;
import paquete06.Departamento;
import paquete06.EscrituraCasa;
import paquete06.EscrituraDepartamento;

public class Ejecutor {
    public static void main(String[] args) {
        boolean bandera = true;
        int opcion;
        int opcionElegida;
        do {
            opcion = interfaz();
            if (opcion == 1) {
                opcionElegida = menuDeIngresoDeDatos();
                switch (opcionElegida) {
                    case 1:
                        ingresarPropietario();
                        break;
                    case 2:
                        ingresarBarrio();
                        break;
                    case 3:
                        ingresarCiudad();
                        break;
                    case 4:
                        ingresarConstructora();
                        break;
                    case 5:
                        ingresarCasa();
                        break;
                    case 6:
                        ingresarDepartamento();
                        break;
                    case 0:
                        break;
                }
            } else {
                if (opcion == 2) {
                    opcionElegida = menuDeListaDeArchivos();
                    crearListaDeDatos(opcionElegida);
                } else {
                    if (opcion == 3) {

                        bandera = false;
                    }

                }

            }

        } while (bandera);
    }

    // MENU
    public static int interfaz() {
        Scanner entry = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS            [1]");
        System.out.println("MOSTRAR LA LISTA DE DATOS   [2]");
        System.out.println("SALIDA                      [3]");
        int opcion = entry.nextInt();
        if (opcion < 1 || opcion > 3) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 0 || opcion > 2);
        }
        return opcion;
    }

    public static int menuDeIngresoDeDatos() {
        Scanner entry = new Scanner(System.in);
        System.out.println("INGRESAR UN NUEVO PROPIETARIO                   [1]");
        System.out.println("INGRESAR UN NUEVO BARRIO                        [2]");
        System.out.println("INGRESAR UNA NUEVA CIUDAD                       [3]");
        System.out.println("INGRESAR UNA NUEVA CONSTRUCTORA                 [4]");
        System.out.println("INGRESAR UNA NUEVA CASA                         [5]");
        System.out.println("INGRESAR UN NUEVO DEPARTAMENTO                  [6]");
        System.out.println("INGRESE 0 PARA REGRESAR AL MENU                 [0]");
        int opcion = entry.nextInt();

        if (opcion < 0 || opcion > 6) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 7);
        }
        return opcion;
    }

    public static int menuDeListaDeArchivos() {
        Scanner entry = new Scanner(System.in);
        System.out.println("VER LISTA DE PROPIETARIOS                   [1]");
        System.out.println("VER LISTA DE BARRIOS                        [2]");
        System.out.println("VER LISTA DE CIUDADES                       [3]");
        System.out.println("VER LISTA DE CONSTRUCTORAS                  [4]");
        System.out.println("VER LISTA DE CASAS                          [5]");
        System.out.println("VER LISTA DE LOS DEPARTAMENTOS              [6]");
        System.out.println("INGRESE 0 PARA VOLEVER ALL MENÚ PRINCIPAL   [0]");
        int opcion = entry.nextInt();

        if (opcion < 0 || opcion > 6) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 0 || opcion > 6);
        }
        return opcion;
    }
    //INGRESO DE DATOS
    public static void ingresarPropietario() {
        Scanner entry = new Scanner(System.in);
        Propietario prop;
        System.out.println("Ingrese los nombres del propietario");
        String nombrePropietario = entry.nextLine();
        System.out.println("Ingrese los apellidos del propietario");
        String apellidosPropietario = entry.nextLine();
        System.out.println("Ingrese la identificacion del propietario");
        String identificacion = entry.nextLine();
        prop = new Propietario(nombrePropietario,
                apellidosPropietario,
                identificacion);
        EscrituraPropietario a1 = new EscrituraPropietario("propietarios.dat");
        a1.setRegistroPropietario(prop);
        a1.setSalidaPropietario();
    }

    public static void ingresarBarrio() {
        Scanner entry = new Scanner(System.in);
        Barrio barr;
        System.out.println("Ingrese el nombre del Barrio");
        String nombreBarrio = entry.nextLine();
        System.out.println("Ingrese una Referencia para hallar el "
                + "barrio");
        String referencia = entry.nextLine();
        barr = new Barrio(nombreBarrio, referencia);
        System.out.println(barr);
        EscrituraBarrio a2 = new EscrituraBarrio("barrios.dat");
        a2.setRegistroBarrio(barr);
        a2.setSalidaBarrio();
    }

    public static void ingresarCiudad() {
        Scanner entry = new Scanner(System.in);
        Ciudad ciud;
        System.out.println("Ingrese el nombre de la ciudad");
        String nombreCiudad = entry.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        String nombreProvincia = entry.nextLine();

        ciud = new Ciudad(nombreCiudad, nombreProvincia);
        EscrituraCiudad a3 = new EscrituraCiudad("ciudades.dat");
        System.out.println(ciud);
        a3.setRegistroCiudad(ciud);
        a3.setSalidaCiudad();
    }

    public static void ingresarConstructora() {
        Scanner entry = new Scanner(System.in);
        Constructora construc;
        System.out.println("Ingrese el nombre de la constructora");
        String nombreConstructora = entry.nextLine();
        System.out.println("Ingrese el ID de la constructora");
        String idEmpresa = entry.nextLine();

        construc = new Constructora(nombreConstructora, idEmpresa);
        System.out.println(construc);
        EscrituraConstructora a4 = new EscrituraConstructora("constructoras.dat");
        a4.setRegistroConstructora(construc);
        a4.setSalidaConstructora();
    }

    public static void ingresarCasa() {
        Scanner entry = new Scanner(System.in);
        Propietario prop;
        Barrio barr;
        Ciudad ciud;
        Constructora construc;
        prop = buscadorPropietario();
        barr = buscadorBarrio();
        ciud = buscadorCiudad();
        construc = buscadorConstructora();
        System.out.println("Ingrese el valor del precio del metro "
                + "cuadrado");
        double precioMetro = entry.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados");
        double numeroMetros = entry.nextDouble();
        System.out.println("Ingrese el numero de cuartos");
        int numeroCuartos = entry.nextInt();
        Casa casa = new Casa(prop, precioMetro, numeroMetros, barr,
                ciud, numeroCuartos, construc);
        casa.setCostoFinal();
        EscrituraCasa a5 = new EscrituraCasa("casas.dat");
        a5.setRegistroCasa(casa);
        a5.setSalidaArchivo();

    }

    public static void ingresarDepartamento() {
        Scanner entry = new Scanner(System.in);
        Propietario prop;
        Barrio barr;
        Ciudad ciud;
        prop = buscadorPropietario();
        barr = buscadorBarrio();
        ciud = buscadorCiudad();
        Constructora construc;
        construc = buscadorConstructora();
        System.out.println("Ingrese el valor del precio del metro "
                + "cuadrado");
        double precioMetro = entry.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados");
        double numeroMetros = entry.nextDouble();
        System.out.println("Ingrese el valor de la alicuota");
        double alicuota = entry.nextDouble();
        entry.nextLine();
        System.out.println("Ingrese el nombre del edificio");
        String nombreEdificio = entry.nextLine();
        System.out.println("Ingrese la ubicacion del edificio");
        String ubiEdificio = entry.nextLine();
        Departamento departamento = new Departamento(prop, precioMetro,
                numeroMetros, alicuota, barr, ciud, nombreEdificio,
                ubiEdificio, construc);
        departamento.setCostoFinal();
        EscrituraDepartamento a6 = new EscrituraDepartamento("departamentos.dat");
        a6.setRegistroDepartamento(departamento);
        a6.setSalidaDepartamento();
    }
    //LISTA DE DATOS

    public static void crearListaDeDatos(int opcion) {
        switch (opcion) {
            case 1:
                LecturaArchivo ll = new LecturaArchivo("propietarios.dat");
                ll.setListaPropietarios();
                System.out.printf("%s", ll.MostrarEnPantallaPropietarios());
                ll.cerrarArchivo();
                break;

            case 2:
                LecturaArchivo l2 = new LecturaArchivo("barrios.dat");
                l2.setListaBarrios();
                System.out.printf("%s", l2.MostrarenPnatallaBarrios());
                l2.cerrarArchivo();
                break;

            case 3:
                LecturaArchivo l3 = new LecturaArchivo("ciudades.dat");
                l3.setListaCiudades();
                System.out.printf("%s", l3.MostrarenPantallaCiudades());
                l3.cerrarArchivo();
                break;
            case 4:
                LecturaArchivo l4 = new LecturaArchivo("constructoras.dat");
                l4.setListaConstructoras();
                System.out.printf("%s", l4.MostrarenPantallaConstructoras());
                l4.cerrarArchivo();
                break;

            case 5:
                LecturaArchivo l5 = new LecturaArchivo("casas.dat");
                l5.setListaCasas();
                System.out.printf("%s", l5.MostrarenPantallaCasas());
                l5.cerrarArchivo();
                break;

            case 6:
                LecturaArchivo l6 = new LecturaArchivo("departamentos.dat");
                l6.setListaDepartametnos();
                System.out.printf("%s", l6.MostrarEnPantallaDepartamentos());
                l6.cerrarArchivo();
                break;

        }
    }
    //BUSQUUEDA DE DATOS

    public static Propietario buscadorPropietario() {
        Scanner entry = new Scanner(System.in);
        boolean bandera = true;
        String identificacion;
        String nombres;
        String apellidos;
        String nombreArchivo = "propietarios.dat";

        do {
            System.out.println("Ingrese La Identifiacion Del Propietario"
                    + "(Cedula)");
            identificacion = entry.nextLine();
            Propietario propietarioBuscar;
            Buscar b = new Buscar(nombreArchivo);
            b.setIdentificacion(identificacion);
            b.setPropietarioBuscado();
            propietarioBuscar = b.getPropietarioBuscado();

            if (propietarioBuscar != null) {
                System.out.printf("Propietario encontrado\n%s\n",
                        propietarioBuscar);
                bandera = false;
                return propietarioBuscar;
            } else {
                System.out.println("Propietario no encontrado si desea ingresar un "
                        + "nuevo propietario ingrese si, caso contrario ingrese "
                        + "cualquier otra letra para continuar buscando");
                String salida = entry.nextLine();

                if (salida.equals("si") || salida.equals("Si")
                        || salida.equals("SI")) {

                    System.out.println("Ingrese nombres del propietario");
                    nombres = entry.nextLine();
                    System.out.println("Ingrese apellidos del propietario");
                    apellidos = entry.nextLine();
                    System.out.println("Ingrese identificacion del propietario");
                    identificacion = entry.nextLine();
                    Propietario prop = new Propietario(nombres, apellidos,
                            identificacion);
                    EscrituraPropietario a = new EscrituraPropietario(nombreArchivo);
                    a.setRegistroPropietario(prop);
                    a.setSalidaPropietario();
                    propietarioBuscar = prop;
                    return propietarioBuscar;
                }
            }
        } while (bandera);
        return null;
    }

    public static Barrio buscadorBarrio() {
        Scanner entry = new Scanner(System.in);
        boolean bandera = true;
        String nombreBarrio;
        String referencia;
        String nombreArchivo = "barrios.dat";

        do {
            System.out.println("Ingrese El Nombre Del Barrio Del Propietario");
            nombreBarrio = entry.nextLine();
            Barrio barrioBuscar;
            Buscar b = new Buscar(nombreArchivo);
            b.setIdentificacion(nombreBarrio);
            b.setBarrioBuscado();
            barrioBuscar = b.getBarrioBuscado();
            if (barrioBuscar != null) {
                System.out.printf("Barrio encontrado\n%s\n", barrioBuscar);
                bandera = false;
                return barrioBuscar;
            } else {
                System.out.println("Barrio no encontrado si desea ingresar un "
                        + "nuevo Barrio ingrese si, caso contrario ingrese "
                        + "cualquier otra letra para continuar buscando");
                String salida = entry.nextLine();

                if (salida.equals("si") || salida.equals("Si") || salida.equals("SI")) {
                    System.out.println("Ingrese nombre del barrio: ");
                    nombreBarrio = entry.nextLine();
                    System.out.println("Ingrese referencia: ");
                    referencia = entry.nextLine();
                    Barrio barr = new Barrio(nombreBarrio, referencia);
                    EscrituraBarrio archivo2 = new EscrituraBarrio(nombreArchivo);
                    archivo2.setRegistroBarrio(barr);
                    archivo2.setSalidaBarrio();
                    barrioBuscar = barr;
                    return barrioBuscar;
                }
            }

        } while (bandera);
        return null;
    }

    public static Ciudad buscadorCiudad() {
        Scanner entry = new Scanner(System.in);
        boolean bandera = true;
        String nombreCiudad;
        String nombreProvincia;
        String nombreArchivo = "ciudades.dat";

        do {
            System.out.println("Ingrese El Nombre De La Ciudad");
            nombreCiudad = entry.nextLine();
            Ciudad ciudadBuscar;
            Buscar b = new Buscar(nombreArchivo);
            b.setIdentificacion(nombreCiudad);
            b.setCiudadBuscado();
            ciudadBuscar = b.getCiudadBuscado();
            if (ciudadBuscar != null) {
                System.out.printf("Ciudad encontrada\n%s\n", ciudadBuscar);
                bandera = false;
                return ciudadBuscar;
            } else {
                System.out.println("Ciudad no encontrada si desea ingresar una "
                        + "nueva ciudad ingrese si, caso contrario ingrese "
                        + "cualquier otra letra para continuar buscando");
                String salida = entry.nextLine();

                if (salida.equals("si") || salida.equals("Si") || salida.equals("SI")) {
                    System.out.println("Ingrese nombre de la ciudad: ");
                    nombreCiudad = entry.nextLine();
                    System.out.println("Ingrese nombre de la provincia: ");
                    nombreProvincia = entry.nextLine();
                    Ciudad ciud = new Ciudad(nombreCiudad, nombreProvincia);
                    EscrituraCiudad archivo = new EscrituraCiudad(nombreArchivo);
                    archivo.setRegistroCiudad(ciud);
                    archivo.setSalidaCiudad();
                    ciudadBuscar = ciud;
                    return ciudadBuscar;
                }
            }
        } while (bandera);
        return null;
    }

    public static Constructora buscadorConstructora() {
        Scanner entry = new Scanner(System.in);
        boolean bandera = true;
        String nombreConstructora;
        String idConstructora;
        String nombreArchivo = "constructoras.dat";

        do {
            System.out.println("Ingrese El ID De La Constructora");
            idConstructora = entry.nextLine();
            Constructora constructoraBuscar;
            Buscar b = new Buscar(nombreArchivo);
            b.setIdentificacion(idConstructora);
            b.setConstructoraBuscado();
            constructoraBuscar = b.geteConstructora();
            if (constructoraBuscar != null) {
                System.out.printf("Constructora encontrada\n%s\n", constructoraBuscar);
                bandera = false;
                return constructoraBuscar;
            } else {
                System.out.println("Constructora no encontrada si desea ingresar una "
                        + "nueva constructora ingrese si, caso contrario ingrese "
                        + "cualquier otra letra para continuar buscando");
                String salida = entry.nextLine();

                if (salida.equals("si") || salida.equals("Si") || salida.equals("SI")) {
                    System.out.println("Ingrese nombre constructora: ");
                    nombreConstructora = entry.nextLine();
                    System.out.println("Ingrese id constructora: ");
                    idConstructora = entry.nextLine();
                    Constructora construc = new Constructora(nombreConstructora, idConstructora);
                    EscrituraConstructora archivo = new EscrituraConstructora(nombreArchivo);
                    archivo.setRegistroConstructora(construc);
                    archivo.setSalidaConstructora();
                    constructoraBuscar = construc;
                    return constructoraBuscar;
                }
            }

        } while (bandera);
        return null;
    }
}
