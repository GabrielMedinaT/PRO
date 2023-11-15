package Diccionario;

public class Diccionario {

    public static final int MAX_PALABRAS = 100;

    private Palabra[] listaPalabras;
    private int pos;

    public Diccionario(int numPalabras) {
        if (numPalabras > MAX_PALABRAS) {
            listaPalabras = new Palabra[MAX_PALABRAS];
        } else {
            listaPalabras = new Palabra[numPalabras];
        }
        pos = 0;
    }

    public void insertarPalabra(Palabra palabra) {
        if (pos < listaPalabras.length) {
            listaPalabras[pos] = palabra;
            pos++;
            System.out.println("Palabra insertada correctamente.");
        } else {
            System.out.println("No hay espacio para insertar más palabras.");
        }
    }

    public Palabra obtenerPalabra(int posicion) {
        if (posicion >= 0 && posicion < pos) {
            return listaPalabras[posicion];
        } else {
            System.out.println("Posición no válida.");
            return null;
        }
    }

    public void escribirDiccionario() {
        System.out.println("Diccionario:");
        for (int i = 0; i < pos; i++) {
            System.out.println(listaPalabras[i]);
        }
    }
}
