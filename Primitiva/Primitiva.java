package Primitiva;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> loteriaUsuario = new ArrayList<>();
        ArrayList<Integer> numGanUsuario = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Indique el numero " + (i + 1) + " de su combinación: ");
            int loteria = scanner.nextInt();

            if (loteria > 0 && loteria < 50) {
                if (!numGanUsuario.contains(loteria)) {
                    numGanUsuario.add(loteria);
                } else {
                    System.out.println("El numero introducido está repetido. Vuelva a introducir el número " + (i + 1) + " de su combinación");
                    i--;
                }
            } else {
                System.out.println("El numero introducido está fuera de rango (desde el 1 al 49). Vuelva a introducir el número " + (i + 1) + " de su combinación");
                i--;
            }
        }

        int contador = 0;
        Random random = new Random();
        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> numGan = new ArrayList<>();

        do {
            contador++;
            System.out.println(contador + " " + "NO" + " " + numGan + " " + numGanUsuario);
            numGan.clear();
            loteria.clear();

            for (int i = 0; i < 6; i++) {
                int numero = random.nextInt(49) + 1;

                if (!numGan.contains(numero)) {
                    numGan.add(numero);
                } else {
                    i--;
                }
            }

            boolean primero = numGan.contains(numGanUsuario.get(0));
            boolean segundo = numGan.contains(numGanUsuario.get(1));
            boolean tercero = numGan.contains(numGanUsuario.get(2));
            boolean cuarto = numGan.contains(numGanUsuario.get(3));
            boolean quinto = numGan.contains(numGanUsuario.get(4));
            boolean sexto = numGan.contains(numGanUsuario.get(5));

            if (primero && segundo && tercero && cuarto && quinto && sexto) {
                break;
            }
        } while (true);

        System.out.println("Los numeros escogidos han sido " + numGanUsuario);
        System.out.println("La loteria ha sido " + numGan);
        System.out.println("El numero de intentos ha sido " + contador);
    }
}

