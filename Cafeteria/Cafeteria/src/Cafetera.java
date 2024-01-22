public class Cafetera {

    // Atributos
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Accesores y mutadores
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Métodos adicionales
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int capacidadTaza) {
        if (this.cantidadActual >= capacidadTaza) {
            this.cantidadActual -= capacidadTaza;
        } else {
            System.out.println("No hay suficiente café en la cafetera para llenar la taza.");
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad <= this.capacidadMaxima) {
            this.cantidadActual += cantidad;
        } else {
            System.out.println("La cantidad excede la capacidad máxima de la cafetera.");
        }
    }

    
}

