package CuentaBancaria;

import java.util.Scanner;

public class InterfazCuenta {



    Scanner nombre = new Scanner(System.in);
    CuentaBancaria miCuenta = new CuentaBancaria("123456789", 1000, "Pepe Pérez");

    public void menu() {
        System.out.println("Introduce tu nombre: ");
        miCuenta.setNombre(nombre.nextLine());
        System.out.println("Introduce tu número de cuenta: ");
        miCuenta.setNumertoCuenta(nombre.nextLine());
        

        int opcion;
        do {
            // 2miCuenta.limpiarPantalla();
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
                ingresar();
                break;
            case 2:
                retirar();
                break;
            case 3:
                verSaldo();
                break;
            case 4:
                verInformacion();
                break;
            case 5:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
        return opcion;
    }

    Scanner sc = new Scanner(System.in);

    public void verSaldo() {
        miCuenta.limpiarPantalla();
        System.out.println("Saldo actual: " + miCuenta.getSaldo());
        System.out.println("Pulse cualquier tecla para continuar......");
        sc.nextLine();
    }

    public void ingresar() {
        miCuenta.limpiarPantalla();
        System.out.println("Introduce la cantidad a ingresar");
        System.out.println("Saldo actual: " + miCuenta.getSaldo());
        double cantidadIngresar = sc.nextDouble();
        miCuenta.ingresar(cantidadIngresar);
    }

    public void retirar() {
        miCuenta.limpiarPantalla();
        System.out.println("Introduce la cantidad a retirar");
        double cantidadRetirar = sc.nextDouble();
        miCuenta.retirar(cantidadRetirar);
    }

    public void verInformacion() {
        miCuenta.limpiarPantalla();
        miCuenta.mostrarInformacion();
        System.out.println("Pulse cualquier tecla para continuar......");
        sc.nextLine();
    }

}
