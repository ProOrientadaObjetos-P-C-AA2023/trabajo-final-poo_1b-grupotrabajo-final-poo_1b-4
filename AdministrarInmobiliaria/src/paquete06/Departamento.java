package paquete06;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento {
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrado;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacion;
    private Constructora contructora;

    public Departamento(Propietario propietario, double precioMetroCuadrado, double numeroMetrosCuadrado, double valorAlicuotaMensual, Barrio barrio, Ciudad ciudad, String nombre, String ubicacion, Constructora contrutora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.nombreEdificio = nombre;
        this.ubicacion = ubicacion;
        this.contructora = contrutora;
    }
    public void setPropietario(Propietario p) {
        propietario = p;
    }
    public void setPrecioMetroCuadrado(double PMC) {
        precioMetroCuadrado = PMC;
    }
    public void setNumeroMetrosCuadrado(double NMC) {
        numeroMetrosCuadrado = NMC;
    }
    public void setValorAlicuotaMensual(double VAM) {
        valorAlicuotaMensual = VAM;
    }
    public void setBarrio(Barrio b) {
        barrio = b;
    }
    public void setCiudad(Ciudad c) {
        ciudad = c;
    }
    public void setNombreEdificio(String n) {
        nombreEdificio = n;
    }
    public void setUbicacion(String U) {
        ubicacion = U;
    }
    public void setConstructora (Constructora c){
        contructora = c;
    }
    public void setCostoFinal(){
        costoFinal =(numeroMetrosCuadrado * precioMetroCuadrado)+(valorAlicuotaMensual*12);
    }
    public Propietario getPropietario(){
        return propietario;
    }
    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
    public double getNumeroMetrosCuadrado() {
        return numeroMetrosCuadrado;
    }
    public double getValorAlicuotaMensual() {
        return valorAlicuotaMensual;
    }
    public Barrio getBarrio() {
        return barrio;
    }
    public Ciudad getCiudad() {
        return ciudad;
    }
    public String getNombreEdisicio() {
        return nombreEdificio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public Constructora getConstructora(){
        return contructora;
    }
    public double getCostoFinal(){
        return costoFinal;
    }
    @Override
        public String toString(){
            String espacio = "---------------------------------------------------------";
            String cadena = String.format("%s\n-REGISTRO.\n\nDatos del Propietario:\n"
                    + "Nombre del Porpietario: %s\nApellidos del Propietario: %s\n"
                    + "Identificacion del Propietario:%s\n\nDatos del Barrio:\n"
                    + "Nombre del Barrio: %s\nReferecnai del Barrio:%s\n\nDatos de"
                    + " la ciudad:\nNombre de la ciudad: %s\nNombre de la provincia"
                    + " %s\n\nDatos de la Constructora:\nNombre de la constructora:"
                    + " %s\nNombre del ID de la Constructora: %s\n\nValores acerca "
                    + "de la vivienda:\nPrecio del Metro Cuadrado: %s\n\nNumero de  "
                    + "Metros Cuadrados: %2.f\nNombre del Edificio: %s\nUbicacion del"
                    + "departamento en ele edificio:%s\nValor de la Alicuota Mensual"
                    + "%.2f\n Costo final a deppsitar: %.2f\n", espacio
                    ,propietario.getNombres(),
                    propietario.getApellidos(),
                    propietario.getIdentificacion(),
                    barrio.getNombre(),
                    barrio.getReferencia(),
                    ciudad.getNombreCiudad(),
                    ciudad.getNombreProvincia(),
                    contructora.getNombre(),
                    contructora.getIdEmpresa(),
                    precioMetroCuadrado,
                    precioMetroCuadrado,
                    nombreEdificio,
                    ubicacion,
                    valorAlicuotaMensual,
                    costoFinal);
                
            return cadena;
        }   
    }
