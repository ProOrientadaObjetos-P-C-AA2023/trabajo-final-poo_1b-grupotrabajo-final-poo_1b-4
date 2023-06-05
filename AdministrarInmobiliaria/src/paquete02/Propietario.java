package paquete02;
public class Propietario {
    private String nombres;
    private String apellidos;
    private int identificacion;

    public Propietario(String nombres, String apellidos, int identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }
    
    @Override
    public String toString() {
        return "Propietario: " + nombres + " " + apellidos + " (ID: " + identificacion + ")";
    }

}
