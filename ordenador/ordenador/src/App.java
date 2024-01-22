import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Ordenador miOrdenador = new Ordenador(1024);
        System.out.println("cuanta memoria quiere instalar? (en Mb): " );
        Scanner sc = new Scanner(System.in);

        int memoria = sc.nextInt(); // Lee la memoria a instalar
        System.out.println(miOrdenador.instalarMemoria(memoria) ? "Ok instalados los " + memoria + " mb" : "No se puede instalar los   " + memoria + " mb"); // Intenta instalar 512

        miOrdenador.printInformacion(); // Muestra la informaciónn


        




    }
}


