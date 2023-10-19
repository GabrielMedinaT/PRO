package Calculadora.Calculadora.src;
public class App {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        miCalculadora.introducirNumero(5);
        miCalculadora.introducirNumero(1025);
        miCalculadora.introducirNumero(3);

        System.out.println("Cantidad: " + miCalculadora.getCantidad());
        System.out.println("Suma: " + miCalculadora.getSuma());
        System.out.println("Máximo: " + miCalculadora.getMaximo());
        System.out.println("Mínimo: " + miCalculadora.getMinimo());
        System.out.println("Media: " + miCalculadora.getMedia());
    }
}

