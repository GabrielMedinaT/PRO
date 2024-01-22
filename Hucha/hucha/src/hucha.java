package Hucha.hucha.src;

public class hucha {
    private double saldo;

    public hucha() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aumentarSaldo(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public void disminuirSaldo(double cantidad) {
        this.saldo = this.saldo - cantidad;
    }

}
