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

    public Departamento(Propietario propietario, double precioMetroCuadrado, double numeroMetrosCuadrado, double valorAlicuotaMensual, double costoFinal, Barrio barrio, Ciudad ciudad, String nombre, String ubicacion, Constructora contrutora) {
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
    
    
}
