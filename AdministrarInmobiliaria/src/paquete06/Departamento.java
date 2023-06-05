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
    private String nombre;
    private String ubicacion;
    private Constructora contrutora;

    public Departamento(double precioMetroCuadrado, double numeroMetrosCuadrado, double valorAlicuotaMensual, String nombre, String ubicacion) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrado = numeroMetrosCuadrado;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.costoFinal = precioMetroCuadrado * numeroMetrosCuadrado;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.contrutora = contrutora;
    }

    public Departamento(String nombre, double precio, double numero, double valor, double costofinal, String barrio, String edificio, String ubicacionedificio, String contructora) {
        throw new UnsupportedOperationException("Not supported yet."); 
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

    public void setValorAlicuotaMensual(double valorAlicuotaMensual) {
        this.valorAlicuotaMensual = valorAlicuotaMensual;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setContrutora(Constructora contrutora) {
        this.contrutora = contrutora;
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

    public double getValorAlicuotaMensual() {
        return valorAlicuotaMensual;
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

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Constructora getContrutora(Constructora constructora) {
        return contrutora;
    }

    public void getConstrutora(Constructora constructora) {
    }
    
}
