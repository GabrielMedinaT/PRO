package ProyectoFerry.ProyectoFerry.src;

public class Pasajeros {
    private String nombre;
    private byte edad;

    // * Metodo constructor

    // constructor vacio

    public Pasajeros(String nombre) {
        this.nombre = nombre;
        this.edad = 1;
    }

    public Pasajeros(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // * Metodos getters

    public String getNombre() {
        return this.nombre;
    }

    public byte getEdad() {
        return this.edad;
    }

    // *Print detalles

    public void printDetalles() {
        if (edad >= 0) {
            System.out.println("Nombre: " + this.nombre + " \nEdad: " + this.edad);
        } else {
            System.out.println("Nombre: " + this.nombre + " \nEdad: No especificada");
        }
    }

    // *Comprar edad

    public boolean esMasJovenQue(Pasajeros pasajero) {
        if (this.nombre == null) {
            return false;
        } else if (pasajero == null) {
            return false;
        } else if (this.edad < pasajero.getEdad()) {
            return true;
        } else {
            return false;
        }
    }

}
