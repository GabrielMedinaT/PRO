package descomposicion.descomposicion.src;
public class Numero {
    private int valor;

    // Constructor sin parámetros que inicializa el número con 999
    public Numero() {
        this.valor = 999;
    }

    // Mutador para cambiar el valor del número
    public void setValor(int nuevoValor) {
        if (nuevoValor >= 100 && nuevoValor <= 999)
            this.valor = nuevoValor;
            else System.out.println("El valor debe estar entre 100 y 999");

    }

    // Accesor para obtener el valor del número
    public int getValor() {
        return this.valor;
    }

    // Método para verificar si el número es par
    public boolean esPar() {
        return this.valor % 2 == 0;
    }

    // Método para obtener la última cifra del número
    public int getUltimaCifra() {
        return this.valor % 10;
    }

    // Método para obtener la suma de las cifras
    public int obtenerSumaCifras() {
        int cifra1 = this.valor / 100;

        int cifra2 = (this.valor / 10) % 10;

        int cifra3 = this.valor % 10;

        return cifra1 + cifra2 + cifra3;
    }


}


