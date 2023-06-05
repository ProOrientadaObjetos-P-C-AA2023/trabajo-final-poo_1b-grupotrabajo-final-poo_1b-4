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

    public Casa(double precioMetroCuadrado, double numeroMetrosCuadrado, int numeroCuartos) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
        this.costoFinal = precioMetroCuadrado * numeroMetrosCuadrado;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.numeroCuartos = numeroCuartos;
        this.construtora = construtora;
    }



    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public void setNumeroMetrosCuadrado(double numeroMetrosCuadrado) {
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public void setConstrutora(Constructora construtora) {
        this.construtora = construtora;
    }

    public Propietario getPropietario(Propietario propietario) {
        return propietario;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public double getNumeroMetrosCuadrado() {
        return numeroMetrosCuadrado;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public Barrio getBarrio(Barrio barrio) {
        return barrio;
    }

    public Ciudad getCiudad(Ciudad ciudad) {
        return ciudad;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public Constructora getConstrutora(Constructora constuctora) {
        return construtora;
    }

    public Object getConstrutora() {
        return construtora;
    }
    
    

}
