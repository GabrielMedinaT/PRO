
public class App {
public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();
        System.out.println("Capacidad Máxima: " + miCafetera.getCapacidadMaxima() + " c.c");
        System.out.println("Cantidad Actual: " + miCafetera.getCantidadActual() + " c.c");

        miCafetera.llenarCafetera();
        System.out.println("Después de llenar la cafetera:");
        System.out.println("Cantidad Actual: " + miCafetera.getCantidadActual() + " c.c");

        miCafetera.servirTaza(200);
        System.out.println("Después de servir una taza de 200 c.c:");
        System.out.println("Cantidad Actual: " + miCafetera.getCantidadActual() + " c.c");

        miCafetera.agregarCafe(300);
        System.out.println("Después de agregar 300 c.c de café:");
        System.out.println("Cantidad Actual: " + miCafetera.getCantidadActual() + " c.c");

        miCafetera.vaciarCafetera();
        System.out.println("Después de vaciar la cafetera:");
        System.out.println("Cantidad Actual: " + miCafetera.getCantidadActual() + " c.c");
    }
}
