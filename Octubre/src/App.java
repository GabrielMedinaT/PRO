package Octubre.src;
public class App {
    public static void main(String[] args) {
        int numero = 24;

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }


    int edad = 14;
    if (edad >= 18) {
        System.out.println("Eres mayor de edad");
    }else
    {
        System.out.println("Eres menor de edad");
    }
    int mes = 1;



    switch (mes) {
        case 1, 2, 12:
            System.out.println("Es invierno");
            break;
        case 3, 4, 5:
            System.out.println("Es primavera");
            break;
        case 6, 7, 8:
            System.out.println("Es verano");
            break;
        case 9, 10, 11:
            System.out.println("Es otoño");
            break;
        default:
            System.out.println("No es un mes valido");
            break;
    }



}

}
