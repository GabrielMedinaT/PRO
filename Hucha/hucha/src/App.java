package Hucha.hucha.src;

public class App {
    public static void main(String[] args) throws Exception {
        hucha hucha1 = new hucha();
        System.out.println("Su saldo actual es de " + hucha1.getSaldo() + "€");
        hucha1.aumentarSaldo(50);
        System.out.println("Su saldo actual es de " + hucha1.getSaldo() + "€");
        hucha1.disminuirSaldo(25);
        System.out.println("Su saldo actual es de " + hucha1.getSaldo() + "€");
        hucha1.aumentarSaldo(500);
        System.out.println("Su saldo actual es de " + hucha1.getSaldo() + "€");


    }
}
