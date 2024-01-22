/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosstring;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class MetodosString {

    /**
     * @param args the command line arguments
     */
    private String cadena;
    private String[] nombres = { "Gabriel", "Juan", "Pedro", "Maria", "Ana", "Luis", "Pablo", "Sara", "Lucia",
            "Sandra" };
    private boolean estaNombre;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    // contar numero de vocales de la cadena

public String contarVocales(String cadena) {
    int contador = 0;
    String vocales = "aeiouAEIOU";

    for (int i = 0; i < cadena.length(); i++) {
        char caracter = cadena.charAt(i);
        if (vocales.indexOf(caracter) != -1) {
            contador++;
        }
    }
    return "El numero de vocales es: " + contador;
}

    public String compararCadenas(String cadena) {
        Scanner pasa = new Scanner(System.in);
        System.out.println("Introduce una texto: ");
        String cadena2 = pasa.nextLine();
        if (cadena.length() > cadena2.length()) {
            return "La cadena 1 es mayor que la cadena 2";
        } else if (cadena.length() < cadena2.length()) {
            return "La cadena 2 es mayor que la cadena 1";
        } else {
            return "Las cadenas son iguales";
        }
    }

    public String palindromo(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        if (cadena.equalsIgnoreCase(cadenaInvertida)) {
            return "Es palindromo";
        } else {
            return "No es palindromo";
        }

    }
//EJERCICIOS DEL 25
    public boolean insertarNombre() {
        Scanner pasa = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String dimenombre = pasa.nextLine();
        dimenombre = dimenombre.substring(0, 1).toUpperCase() + dimenombre.substring(1).toLowerCase();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(dimenombre)) {
                System.out.println("Sí está " + dimenombre + " en la posición " + (i + 1));
                estaNombre = true;
                return estaNombre;
            }
        }

        System.out.println("No está " + dimenombre + " en la lista");
        estaNombre = false;
        return estaNombre;
    }

}
