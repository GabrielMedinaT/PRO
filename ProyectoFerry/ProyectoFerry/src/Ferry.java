package ProyectoFerry.ProyectoFerry.src;

public class Ferry {
    private Pasajero asiento1;
    private Pasajero asiento2;
    private Pasajero asiento3;
    private int numPasajeros;

    //*  Constructor sin parámetros
    public Ferry() {
        this.numPasajeros = 0;
        this.asiento1 = null;
        this.asiento2 = null;
        this.asiento3 = null;
    }

    //* Accesor getNumeroPasajeros()
    public int getNumeroPasajeros() {
        return numPasajeros;
    }

    //* Accesor printDetallesPasajeros()
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

    //* Mutador añadirPasajero()
    public boolean añadirPasajero(Pasajero nuevoPasajero) {
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

    //* Mutador añadirPasajeroPorNombre()
    public boolean añadirPasajeroPorNombre(String nombre) {
        if (numPasajeros < 3) {
            Pasajero nuevoPasajero = new Pasajero(nombre);
            return añadirPasajero(nuevoPasajero);
        } else {
            return false; // Ferry lleno
        }
    }

    //* Mutador borrarPasajero()
    public Pasajero borrarPasajero() {
        if (numPasajeros > 0) {
            Pasajero pasajeroBorrado = asiento1;
            asiento1 = asiento2;
            asiento2 = asiento3;
            asiento3 = null;
            numPasajeros--;
            return pasajeroBorrado;
        } else {
            return null; // No hay pasajeros en el ferry
        }
    }

    //* Método getPasajeroMasJoven()
    public Pasajero getPasajeroMasJoven() {
        if (numPasajeros == 0) {
            return null; // No hay pasajeros
        } else if (numPasajeros == 1) {
            return asiento1;
        } else if (numPasajeros == 2) {
            return masJovenDeDos(asiento1, asiento2);
        } else {
            Pasajero pasajeroMasJoven12 = masJovenDeDos(asiento1, asiento2);
            return masJovenDeDos(pasajeroMasJoven12, asiento3);
        }
    }

    // Método privado masJovenDeDos()
    private Pasajero masJovenDeDos(Pasajero uno, Pasajero dos) {
        if (uno == null && dos == null) {
            return null; // Ambos son null, no hay pasajero más joven
        } else if (uno == null) {
            return dos; // Uno es null, dos es el más joven
        } else if (dos == null) {
            return uno; // Dos es null, uno es el más joven
        } else if (uno.getEdad() < 0 && dos.getEdad() < 0) {
            return null; // Ambos tienen edad no especificada, no hay pasajero más joven
        } else if (uno.getEdad() < 0) {
            return dos; // Uno tiene edad no especificada, dos es el más joven
        } else if (dos.getEdad() < 0) {
            return uno; // Dos tiene edad no especificada, uno es el más joven
        } else {
            return uno.getEdad() < dos.getEdad() ? uno : dos;
        }
    }
}
