
package Diccionario;

/**
 * Clase que representa una palabra en el diccionario.
 * Cada palabra tiene una traducción al inglés y al castellano.
 * La palabra en castellano es la clave del diccionario.
 * La palabra en inglés es el valor del diccionario.
 */
public class Palabra {

    private String castellano;
    private String ingles;

    public Palabra(String castellano, String ingles) {
        this.castellano = castellano;
        this.ingles = ingles;
    }

    public String getCastellano() {
        return castellano;
    }

    public String getIngles() {
        return ingles;
    }

    @Override
    public String toString() {
        return castellano + " - " + ingles;
    }
}
