   package paquete07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete06.Casa;

public class LecturaCasa {
    private ObjectInputStream entrada;
    private ArrayList<Casa> casa;
    private String nombrecasa;

    public LecturaCasa(String n) {
        nombrecasa = n;
        File f = new File(nombrecasa);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("ERROR AL ABRIR EL ARCHIVO: " + ioException);
            }
        }
    }

    public void setNombreArchivo(String n) {
        nombrecasa = n;
    }

    public void setCasa() {
        casa = new ArrayList<>();
        File f = new File(getNombreArchivo());
        if (f.exists()) {
            while (entrada != null) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    casa.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.out.println("ERROR AL LEER EL ARCHIVO: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println("NO SE PUDO CREAR EL OBJETO: " + ex);
                } catch (Exception ex) {
                    System.out.println("NO HAY DATOS EN EL ARCHIVO: " + ex);
                }
            }
        }
    }

    public ArrayList<Casa> getCasa() {
        return casa;
    }

    public String getNombreArchivo() {
        return nombrecasa;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("ERROR AL CERRAR EL ARCHIVO");
            System.out.println(1);
        }
    }
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("LecturaCasa{");
    sb.append("nombreArchivo=").append(nombrecasa);
    sb.append(", casa=[");
    for (Casa c : casa) {
        sb.append(c.toString()).append(", ");
    }
    if (!casa.isEmpty()) {
        sb.delete(sb.length() - 2, sb.length()); // Elimina la última coma y espacio
    }
    sb.append("]");
    sb.append('}');
    return sb.toString();
}

}



