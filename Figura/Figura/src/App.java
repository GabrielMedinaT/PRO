package Figura.Figura.src;
public class App {

    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.escribirFigura(6);
        System.out.println("------------------------------------------------------------------");
        figura.escribirFiguraDos(6);
        System.out.println("------------------------------------------------------------------");
        figura.escribirFiguraTres(6);
        System.out.println("------------------------------------------------------------------");
        figura.imprimirTablas(6);
    }
}

