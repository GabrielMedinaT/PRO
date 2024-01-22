import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        dia midia = new dia();
        System.out.println("Ingrese un numero del 1 al 7");

        Scanner diamio = new Scanner(System.in);

        midia.setDia(diamio.nextInt());
        System.out.println("El dia es " + midia.getDia());
    }
}
