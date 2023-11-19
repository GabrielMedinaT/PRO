package ProyectoFerry.ProyectoFerry.src;
public class Ferry {
    private Pasajeros asiento1;
    private Pasajeros asiento2;
    private Pasajeros asiento3;
    private int numPasajeros;

    // Constructor sin parámetros
    public Ferry() {
        this.numPasajeros = 0;
        this.asiento1 = null;
        this.asiento2 = null;
        this.asiento3 = null;
    }

    // Accesor getNumeroPasajeros()
    public int getNumeroPasajeros() {
        return numPasajeros;
    }

    // Accesor printDetallesPasajeros()
    public void printDetallesPasajeros() {
        if (numPasajeros == 0) {
            System.out.println("No hay pasajeros");
        } else {
            System.out.println("Los pasajeros son:");
            if (asiento1 != null) {
                asiento1.printDetalles();
            }
            if (asiento2 != null) {
                asiento2.printDetalles();
            }
            if (asiento3 != null) {
                asiento3.printDetalles();
            }
        }
    }

    // Mutador añadirPasajero()
    public boolean añadirPasajero(Pasajeros nuevoPasajero) {
        if (numPasajeros == 0) {
            asiento1 = nuevoPasajero;
        } else if (numPasajeros == 1) {
            asiento2 = nuevoPasajero;
        } else if (numPasajeros == 2) {
            asiento3 = nuevoPasajero;
        } else {
            return false; // Ferry lleno
        }
        numPasajeros++;
        return true;
    }

    // Mutador añadirPasajeroPorNombre()
    public boolean añadirPasajeroPorNombre(String nombre) {
        if (numPasajeros < 3) {
            Pasajeros nuevoPasajero = new Pasajeros(nombre);
            return añadirPasajero(nuevoPasajero);
        } else {
            return false; // Ferry lleno
        }
    }

    // Mutador borrarPasajero()
    public Pasajeros borrarPasajero() {
        if (numPasajeros > 0) {
            Pasajeros pasajeroBorrado = asiento1;
            asiento1 = asiento2;
            asiento2 = asiento3;
            asiento3 = null;
            numPasajeros--;
            return pasajeroBorrado;
        } else {
            return null; // No hay pasajeros en el ferry
        }
    }

    // Método getPasajeroMasJoven()
    public Pasajeros getPasajeroMasJoven() {
        if (numPasajeros == 0) {
            return null; // No hay pasajeros
        } else if (numPasajeros == 1) {
            return asiento1;
        } else if (numPasajeros == 2) {
            return masJovenDeDos(asiento1, asiento2);
        } else {
            Pasajeros pasajeroMasJoven12 = masJovenDeDos(asiento1, asiento2);
            return masJovenDeDos(pasajeroMasJoven12, asiento3);
        }
    }

    // Método privado masJovenDeDos()
    private Pasajeros masJovenDeDos(Pasajeros uno, Pasajeros dos) {
        if (uno.getEdad() < 0 || dos.getEdad() < 0) {
            return null; // No se consideran edades no especificadas
        }
        return uno.getEdad() < dos.getEdad() ? uno : dos;
    }
}
