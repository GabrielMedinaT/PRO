package Loteria;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("comenzar");
        System.out.print("Indique número entre el 0 y el 99999: ");
        int numero = scanner.nextInt();
        int contador = 0;

        System.out.println(numero);


        do {
            contador++;
            int loteria = (int) (Math.random() * 100000);
            System.out.println(contador + " " + loteria);

            if (numero == loteria) {
                break;
            }
        } while (true);

        int coste = 30000;
        int euros = contador * 3;
        int dine = coste - euros;
        System.out.println("El numero escogido ha sido " + String.format("%05d", numero));

        System.out.println("El numero de intentos ha sido " + contador + " por lo que ha tenido que gastar " + euros + " Euros para ganar 30000€");

        if (dine < 0) {
            System.out.println("Ha tenido una perdida de " + (-dine) + " euros");
        } else {
            System.out.println("Ha tenido una ganancia de " + dine + " euros");
        }

        int dias = contador * 7;
        System.out.println("Los dias que ha tardado en que coincida su numero son " + dias);
        System.out.println("Los años que tardaría en que coincida su número con el de la loteria son " + Math.round(dias / 365));
    }
}


