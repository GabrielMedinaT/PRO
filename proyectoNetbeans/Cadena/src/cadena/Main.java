/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancia de Cadena
        Cadena c = new Cadena("Aldaba23");

        // Obtener la cadena
        String cadenaOriginal = c.getCadena();
        System.out.println("Cadena Original: " + cadenaOriginal);

        // Sumar los dígitos en la cadena
        int sumaDigitos = c.sumarDigitos();
        System.out.println("Suma de dígitos: " + sumaDigitos);

        // Contar ocurrencias de una subcadena
        String subcadenaBuscada = "Alda";
        int ocurrencias = c.contarOcurrencias(subcadenaBuscada);
        System.out.println("Ocurrencias de '" + subcadenaBuscada + "': " + ocurrencias);

        // Eliminar una subcadena
        String subcadenaEliminar = "da";
        c.eliminar(subcadenaEliminar);
        System.out.println("Cadena después de eliminar '" + subcadenaEliminar + "': " + c.getCadena());

        // Contar vocales en la cadena
        int vocales = c.contarVocales();
        System.out.println("Número de vocales: " + vocales);

        // Comparar con otra cadena
        Cadena otraCadena = new Cadena("Elefante");
        System.out.println("¿La cadena es mayor que 'Elefante'? " + c.mayorQue(otraCadena));
        System.out.println("¿La cadena es menor que 'Elefante'? " + c.menorQue(otraCadena));
        System.out.println("¿La cadena es igual a 'Elefante'? " + c.igualQue(otraCadena));

        // Cifrar la cadena
        String cadenaCifrada = c.cifrar();
        System.out.println("Cadena cifrada: " + cadenaCifrada);

        // Convertir fecha a formato específico
        String fecha = "10/02/2024";
        String fechaFormateada = Cadena.fechaToString(fecha);
        System.out.println("Fecha formateada es : " + fechaFormateada);
    }
}

    

