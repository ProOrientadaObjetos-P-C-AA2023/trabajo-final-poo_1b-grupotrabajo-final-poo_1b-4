package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa {
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrado;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora contrutora;

    public Casa(Propietario propietario, double precioMetroCuadrado, double numeroMetrosCuadrado, double costoFinal, Barrio barrio, Ciudad ciudad, int numeroCuartos, Constructora contrutora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
        this.costoFinal = precioMetroCuadrado * numeroMetrosCuadrado;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.numeroCuartos = numeroCuartos;
        this.contrutora = contrutora;
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

    public void setContrutora(Constructora contrutora) {
        this.contrutora = contrutora;
    }

    public Propietario getPropietario() {
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

    public Barrio getBarrio() {
        return barrio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public Constructora getContrutora() {
        return contrutora;
    }
    
    
    
}
