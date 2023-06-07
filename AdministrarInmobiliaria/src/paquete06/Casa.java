package paquete06;
import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa implements Serializable{
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrado;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora construtora;

    public Casa(Propietario propietario, double precioMetroCuadrado, double numeroMetrosCuadrado, Barrio barrio, Ciudad ciudad, int numeroCuartos, Constructora construtora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.numeroCuartos = numeroCuartos;
        this.construtora = construtora;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario n) {
        propietario = n;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double p) {
        precioMetroCuadrado = p;
    }

    public double getNumeroMetrosCuadrado() {
        return numeroMetrosCuadrado;
    }

    public void setNumeroMetrosCuadrado(double m) {
        numeroMetrosCuadrado = m;
    }
    public void setBarrio(Barrio b){
        barrio = b;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad c) {
        ciudad = c;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int nC) {
        numeroCuartos = nC;
    }
    public void setCostoFinal(){
        costoFinal = numeroMetrosCuadrado * precioMetroCuadrado;
    }
    public double getCostoFinal(){
        return costoFinal;
    }
    public void setConstructora (Constructora cnst){
        construtora = cnst;
    }
    public Constructora getConstructora(){
        return construtora;
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
                + "de la vivienda:\nPrecio del Metro Cuadrado: %s\n\nValores acerca "
                + "Metros Cuadrados: %2.f\nNumero de cuartos: %d\nCosto final a "
                + "depositar: %2.f\n", espacio
                , propietario.getNombres(),
                propietario.getApellidos(),
                propietario.getIdentificacion(),
                barrio.getNombre(),
                barrio.getReferencia(),
                ciudad.getNombreCiudad(),
                ciudad.getNombreProvincia(),
                construtora.getNombre(),
                construtora.getIdEmpresa(),
                precioMetroCuadrado,
                numeroMetrosCuadrado,
                numeroCuartos,
                costoFinal);
                
        return cadena;
    }
}
