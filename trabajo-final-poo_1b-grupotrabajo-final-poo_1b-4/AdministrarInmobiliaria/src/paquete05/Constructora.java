package paquete05;
public class Constructora {
    private String nombre;
    private int idEmpresa;

    public Constructora(String nombre, int idEmpresa) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    
}
