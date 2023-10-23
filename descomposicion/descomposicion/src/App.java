package descomposicion.descomposicion.src;
public class App {
      public static void main(String[] args) {
        // Crear objetos y probar los métodos
        Numero num1 = new Numero(); // Valor inicial será 999
        System.out.println("Valor de numero: " + num1.getValor());
        System.out.println( "El numero es " + ( num1.esPar() ? "es par" : "es impar"));
        System.out.println("Última cifra de numero: " + num1.getUltimaCifra());
        System.out.println("Suma de cifras de numero: " + num1.obtenerSumaCifras());

        num1.setValor(123); // Cambiar el valor a otro numero entero
        System.out.println("\nValor de numero después de cambiarlo: " + num1.getValor());
        System.out.println( "El numero es " + ( num1.esPar() ? "Es par" : "Es impar"));
        System.out.println("Última cifra de nummero: " + num1.getUltimaCifra());
        System.out.println("Suma de cifras de nummero: " + num1.obtenerSumaCifras());
    }
}
