package ProyectoFerry.ProyectoFerry.src;
public class App {
    public static void main(String[] args) throws Exception {

        Pasajeros pasajero1 = new Pasajeros("Juan", (byte) 20);
        Pasajeros pasajero2 = new Pasajeros("Pedro", (byte) 30);
        Pasajeros pasajero3 = new Pasajeros("Maria", (byte) -1);
        Pasajeros pasajero4 = null;

        pasajero3.printDetalles();
        pasajero2.printDetalles();




        System.out.println(pasajero1.esMasJovenQue(pasajero4));


    }
}
