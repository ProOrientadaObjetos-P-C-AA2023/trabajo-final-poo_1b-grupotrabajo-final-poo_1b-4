package paquete04;
public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;

    public Ciudad(String nombreCiudad, String nombreProvincia) {
        this.nombreCiudad = nombreCiudad;
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
    @Override
    public String toString()    {
        String cadena = String.format("Nombre de la Ciudad: %\nNombre de la"+
                " Provincia: %s\n", 
                nombreCiudad,
                nombreProvincia);
        return cadena;
    }
    
}
