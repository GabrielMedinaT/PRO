package Arrays;
import java.util.Scanner;

public class App {
    // array de 30 enteros ya predefinidos


    public static void main(String[] args) {
        /*int[] notas = new int[10];
        int posicionNotas = 0;
        String[] Alumnos = new String[10];
        int posicionAlumnos = 0;
        Scanner respuestaSN = new Scanner(System.in);
        Scanner alumno = new Scanner(System.in);
        Scanner nota = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de notas");*/


        pruebaVectores prueba = new pruebaVectores();
        int[] vector = prueba.crearVector(12);
        double[] vectorDouble = { 8 , 9 , 7 , 10 , 9 , 8 , 7 };
        int[] vectorInvertido = prueba.invertirVector(vector);
        int [] rotar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Vector original: ");
        prueba.imprimirVector(vector);
        //System.out.println("\nVector invertido: ");
        //prueba.imprimirVector(vectorInvertido);
        //System.out.println("\nVector original invertido sin crear copia: ");
        //prueba.imprimirVector(vector);
        //System.out.println("\nVector invertido sin crear copia: ");
        //prueba.invertirVectorSinCopia(vector);
        //prueba.imprimirVector(vector);
        //prueba.calcularMedia(vectorDouble);
        //prueba.calculaMaximo(vectorDouble);
        //System.out.println("El maximo es: " + prueba.calculaMaximo(vectorDouble));
        //prueba.encuentraPares(vector);
        //*Ejercicio 5.9
        //prueba.rotarDerecha(rotar);

        //prueba.rotarIzquierda(rotar);
        //prueba.rotarDerecha(rotar);
        //prueba.rotarDerechaNveces(rotar, 3);
        //*Ejercicio 5.10
        //prueba.imprimirVector(prueba.generaArray(10));
        //*Ejercicio 5.11
        //prueba.calcularFrecuencias();






        /*for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del alumno");
            Alumnos[posicionAlumnos] = alumno.nextLine();
            posicionAlumnos++;
            System.out.println("Ingrese la nota del alumno");
            notas[posicionNotas] = nota.nextInt();
            posicionNotas++;
            System.out.println("Alumno ingresado correctamente");
            System.out.println("Desea añaadir otro alumno? (S/N)");
            String respuesta = respuestaSN.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }

        }
        System.out.println("Alumnos ingresados: ");

        for (int i = 0; i < posicionAlumnos; i++) {
            System.out.println(Alumnos[i] + " " + notas[i]);
        }
        alumno.close();
        nota.close();
        respuestaSN.close();*/

    }
}
