package CuentaBancaria;

import java.util.Scanner;

public class InterfazCuenta {
    CuentaBancaria miCuenta = new CuentaBancaria(123456789, 1000, "Pepe Pérez");

    public void menu() {
        int opcion;
        do {
            //2miCuenta.limpiarPantalla();
            System.out.println("Bienvenido a su cuenta bancaria señor/a " + miCuenta.getNombre());
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("*--------------------------------*");
            System.out.println("|    1. Ingresar dinero          |");
            System.out.println("|    2. Retirar dinero           |");
            System.out.println("|    3. Consultar saldo          |");
            System.out.println("|    4. Mostrar Información      |");
            System.out.println("|    5. Salir                    |");
            System.out.println("*--------------------------------*");
            opcion = controlarOpcion();
        } while (opcion != 5);
    }

    public int controlarOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                miCuenta.limpiarPantalla();
                System.out.println("Introduce la cantidad a ingresar");
                double cantidadIngresar = sc.nextDouble();
                miCuenta.ingresar(cantidadIngresar);
                break;
            case 2:
                miCuenta.limpiarPantalla();
                System.out.println("Introduce la cantidad a retirar");
                double cantidadRetirar = sc.nextDouble();
                miCuenta.retirar(cantidadRetirar);
                break;
            case 3:
                miCuenta.limpiarPantalla();
                System.out.println("Saldo actual: " + miCuenta.getSaldo());
                System.out.println("Pulse cualquier tecla para continuar......");
                sc.nextLine();
                sc.nextLine();
                break;
            case 4:
                miCuenta.limpiarPantalla();
                miCuenta.mostrarInformacion();
                System.out.println("Pulse cualquier tecla para continuar......");
                sc.nextLine();
                sc.nextLine();
                miCuenta.limpiarPantalla();
                break;
            case 5:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        return opcion;
    }

}
