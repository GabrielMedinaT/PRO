public class Calentador {
    private int temperatura;
    private int minimo;
    private int maximo;
    private int incremento;


    public Calentador() {


    }

    // Constructor con parámetros
    public Calentador(int minimo, int maximo) {
        this.temperatura = 15;
        this.minimo = minimo;
        this.maximo = maximo;
        this.incremento = 5;
    }
    public int getIncremento() {
        return incremento;
    }
    // Método para incrementar la temperatura
    public void calentar() {
        if (temperatura + incremento <= maximo) {
            temperatura += incremento;
        } else {
            temperatura = maximo;
        }
    }

    // Método para decrementar la temperatura
    public void enfriar() {
        if (temperatura - incremento >= minimo) {
            temperatura -= incremento;
        } else {
            temperatura = minimo;
        }
    }

    // Método para obtener la temperatura
    public int getTemperatura() {
        return temperatura;
    }

    // Método para establecer el valor del incremento
    public void setIncremento(int nuevoIncremento) {
        if (nuevoIncremento >= 0) {
            this.incremento = nuevoIncremento;
        }
    }
}
