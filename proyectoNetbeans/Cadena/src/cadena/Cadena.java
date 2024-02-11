/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadena;

/**
 *
 * @author gabriel
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadena {
    private String cadena;

    // Constructores
    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public Cadena(Cadena otraCadena) {
        this.cadena = otraCadena.getCadena();
    }

    // Accesor y Mutador
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String nuevaCadena) {
        this.cadena = nuevaCadena;
    }

    // Métodos solicitados
    public int sumarDigitos() {
        int suma = 0;
        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        return suma;
    }

    public int contarOcurrencias(String subcadena) {
        int count = 0;
        int index = cadena.toLowerCase().indexOf(subcadena.toLowerCase());
        while (index != -1) {
            count++;
            index = cadena.toLowerCase().indexOf(subcadena.toLowerCase(), index + 1);
        }
        return count;
    }

    public void eliminar(String subcadena) {
        cadena = cadena.replaceAll("(?i)" + subcadena, "");
    }

    public int contarVocales() {
        int count = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public boolean mayorQue(Cadena otraCadena) {
        return cadena.compareToIgnoreCase(otraCadena.getCadena()) > 0;
    }

    public boolean menorQue(Cadena otraCadena) {
        return cadena.compareToIgnoreCase(otraCadena.getCadena()) < 0;
    }

    public boolean igualQue(Cadena otraCadena) {
        return cadena.compareToIgnoreCase(otraCadena.getCadena()) == 0;
    }

    public String cifrar() {
        StringBuilder resultado = new StringBuilder();
        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)) {
                char nuevaLetra = (char) (((c - 'A' + 3) % 26) + 'A');
                resultado.append(nuevaLetra);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static String fechaToString(String fecha) {
        try {
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = formatoEntrada.parse(fecha);

            SimpleDateFormat formatoSalida = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");
            return formatoSalida.format(fechaDate);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al formatear la fecha";
        }
    }
}


