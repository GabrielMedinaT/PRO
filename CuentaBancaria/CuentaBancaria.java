package CuentaBancaria;

public class CuentaBancaria {
    private int numertoCuenta;
    private double saldo;
    private String nombre;

    public CuentaBancaria(int numertoCuenta, double saldo, String nombre) {
        this.numertoCuenta = numertoCuenta;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    

    public int getNumertoCuenta() {
        return numertoCuenta;
    }

    public void setNumertoCuenta(int numertoCuenta) {
        this.numertoCuenta = numertoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo");
        } else {
            this.saldo = saldo;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 3) {
            System.out.println("El nombre debe tener al menos 3 caracteres");
        } else {
            this.nombre = nombre;
        }
    }


    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
        } else {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad < 0) {
            System.out.println("No se puede retirar más dinero del que hay en la cuenta");
        } else {
            saldo -= cantidad;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Número de cuenta: " + numertoCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


}
