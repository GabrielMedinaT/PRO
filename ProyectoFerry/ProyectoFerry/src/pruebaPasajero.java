package ProyectoFerry.ProyectoFerry.src;
public class pruebaPasajero {
    public static void main(String[] args) {
        // Crear pasajero1 con nombre pero sin determinar la edad
        Pasajeros pasajero1 = new Pasajeros("Juan");

        // Crear pasajero2 con nombre y edad determinados
        Pasajeros pasajero2 = new Pasajeros("Ana", 25);

        Pasajeros pasajero3= null;

        // Llamar a los métodos de la clase Pasajero sobre pasajero1
        System.out.println("Pasajero 1:");
        pasajero1.printDetalles();
        System.out.println("Es más joven que : "+ pasajero2.getNombre() + " \n" + pasajero1.esMasJovenQue(pasajero2));

        // Llamar a los métodos de la clase Pasajero sobre pasajero2
        System.out.println("\nPasajero 2:");
        System.out.println(pasajero2.getNombre());
        System.out.println("Es más joven que : " +pasajero1.getNombre() + " \n" + pasajero2.esMasJovenQue(pasajero1));
    }
}
