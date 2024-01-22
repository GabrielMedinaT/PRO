package ProyectoFerry.ProyectoFerry.src;
public class Pasajero{
    private String nombre;
    private int edad;

    // Constructor con un parámetro (inicializa la edad a -1)
    public Pasajero(String nombre) {
        this(nombre, -1);
    }

    // Constructor con dos parámetros
    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Accesor getNombre()
    public String getNombre() {
        return nombre;
    }

    // Accesor getEdad()
    public int getEdad() {
        return edad;
    }

    // Accesor printDetalles()
    public void printDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + (edad >= 0 ? edad : "Sin especificar"));
    }

    // Método esMasJovenQue()
    public boolean esMasJovenQue(Pasajero otroPasajero) {
        if (otroPasajero == null || this.edad < 0 || otroPasajero.getEdad() < 0) {
            return false;
        }
        return this.edad < otroPasajero.getEdad();
    }
}
