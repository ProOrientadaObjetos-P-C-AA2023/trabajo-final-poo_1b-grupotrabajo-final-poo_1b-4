package paquete03;
public class Barrio {
    private String nombre;
    private String referencia;

    public Barrio(String nombre, String referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del barrio %s\nReferecnia %s\n", 
                nombre,
                referencia);
        return cadena;
    }
    
    
}
