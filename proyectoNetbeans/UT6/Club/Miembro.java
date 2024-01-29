import java.util.ArrayList;

/**
 * Almacena detalles de un miembro del club
 * author K�lling y Barnes
 */
public class Miembro {
    private String nombre;
    private int mes;
    private int anio;

    public Miembro(String nombre, int mes, int anio) throws IllegalArgumentException {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes " + mes + " fuera del rango. Debe ser un valor entre 1 y 12");
        }
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String toString() {
        return "Nombre: " + nombre + " inscrito en el mes " + mes + " de " + anio;
    }
}
