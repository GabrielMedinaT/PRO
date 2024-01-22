package ProyectoFerry.ProyectoFerry.src;
public class App {
    public static void main(String[] args) throws Exception {

        Pasajero pasajero1 = new Pasajero("Juan", (byte) 20);
        Pasajero pasajero2 = new Pasajero("Pedro", (byte) 30);
        Pasajero pasajero3 = new Pasajero("Maria", (byte) -1);
        Pasajero pasajero4 = null;

        pasajero3.printDetalles();
        pasajero2.printDetalles();




        System.out.println(pasajero1.esMasJovenQue(pasajero4));


    }
}
