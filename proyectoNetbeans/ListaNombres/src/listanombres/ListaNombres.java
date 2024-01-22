/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listanombres;

import java.util.Arrays;
import java.util.Comparator;

class ListaNombres {
    private static final int MAX_NOMBRES = 10;
    private String[] lista;
    private int ultimo;

    public ListaNombres() {
        this.lista = new String[MAX_NOMBRES];
        this.ultimo = -1;
    }

    private boolean estaNombre(String nombre) {
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean insertarNombre(String nombre) {
        if (ultimo < MAX_NOMBRES - 1 && !estaNombre(nombre)) {
            ultimo++;
            //System.out.println(ultimo);
            lista[ultimo] = nombre;
            //System.out.println(lista[ultimo]);
            Arrays.sort(lista, 0, ultimo + 1, String.CASE_INSENSITIVE_ORDER);
            return true;
        }
        return false;
    }

    public String nombreMasLargo() {
        int numero= 0;
        String Aux []= new String [10];
        String maslargos = "";
        
        if (ultimo == -1) {
            return null;
        }

        String masLargo = lista[0];
        for (int i = 1; i <= ultimo; i++) {
            if (lista[i].length() > masLargo.length()) {
                masLargo = lista[i];
            }
        }
        for (int i= 1; i<= ultimo; i++){
            
            if (lista[i].length() == masLargo.length()){
                Aux[numero]=lista[i];
                maslargos+= " "+ Aux[numero]; 
                numero ++;
            }
            if (lista[i].equalsIgnoreCase(masLargo)) numero--;
        }
        String masLargo2 = maslargos + " " + masLargo ;
        if (numero!= 0)return masLargo2;
        else return masLargo;
    }


    public void borrarLetra(char letra) {
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i] != null && (lista[i].charAt(0) == letra || lista[i].charAt(0) == Character.toUpperCase(letra))) {
                lista[i] = null;
            }
        }
        // Usar Comparator de java.util.comparator
        Arrays.sort(lista, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));

        int nuevaUltima = ultimo;
        for (int i = ultimo; i >= 0; i--) {
            if (lista[i] == null) {
                nuevaUltima--;
            } else {
                break;
            }
        }
        ultimo = nuevaUltima;
    }

    public String[] empiezanPorLetra(char letra) {
        String[] result = new String[MAX_NOMBRES];
        int contador = 0;
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].charAt(0) == letra || lista[i].charAt(0) == Character.toUpperCase(letra)) {
                result[contador++] = lista[i];
            }
        }
        return Arrays.copyOf(result, contador);
    }

    public String empiezanPor(String cadena) {
        String[]result = new String [MAX_NOMBRES];
        String nombres = " ";
        int contador = 0;
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].startsWith(cadena) || lista[i].startsWith(cadena.toUpperCase())) {
                result[contador] = lista[i];
                nombres += result[contador] + " ";
                contador++;
                
            }
        }
        return nombres;
    }

    public boolean listaVacia() {
        return ultimo == -1;
    }

    public boolean listaLlena() {
        return ultimo == MAX_NOMBRES - 1;
    }

    @Override
    public String toString() {
        if (ultimo == -1) {
            return "Lista vacía";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= ultimo; i++) {
            result.append(lista[i]).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}


