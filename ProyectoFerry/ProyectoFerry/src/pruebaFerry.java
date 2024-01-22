package ProyectoFerry.ProyectoFerry.src;
public class pruebaFerry {
    public static void main(String[] args) {
        //* Crear una instancia de la clase Ferry
        Ferry ferry = new Ferry();

        //* Testear el ferry
        testFerry(ferry);
    }

    public static void testFerry(Ferry ferry) {
        //* Crear un nuevo Pasajero, "Luisa" de 34 años, y añadirlo al ferry
        Pasajero luisa = new Pasajero("Luisa", 34);
        ferry.añadirPasajero(luisa);

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());
        luisa.printDetalles();

        //* Crear un nuevo Pasajero, "Enrique" de 19 años, y añadirlo al ferry
        Pasajero enrique = new Pasajero("Enrique", 19);
        ferry.añadirPasajero(enrique);

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());
        enrique.printDetalles();

        //* Crear un nuevo Pasajero, "Alberto" sin especificar edad, y añadirlo al ferry
        Pasajero alberto = new Pasajero("Alberto");
        ferry.añadirPasajero(alberto);

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());
        alberto.printDetalles();
        //* Crear un nuevo Pasajero, "Raquel" sin especificar edad, y añadirlo al ferry
        Pasajero raquel = new Pasajero("Raquel");
        ferry.añadirPasajero(raquel);

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());

        //* Borrar un pasajero
        Pasajero pasajeroBorrado = ferry.borrarPasajero();
        System.out.println("Pasajero borrado: " + pasajeroBorrado.getNombre());

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());

        //* Borrar dos pasajeros
        ferry.borrarPasajero();
        ferry.borrarPasajero();

        //* Visualizar el número de pasajeros del ferry
        System.out.println("Número de pasajeros en el ferry: " + ferry.getNumeroPasajeros());

        //* Borrar otro pasajero (no debería fallar)
        Pasajero pasajeroNull = ferry.borrarPasajero();
        if (pasajeroNull == null) {
            System.out.println("No hay pasajero para borrar.");
        }

        //* Añadir tres pasajeros
        ferry.añadirPasajeroPorNombre("Maria");
        Pasajero juan = new Pasajero("Juan", 30);
        Pasajero ana = new Pasajero("Ana", 25);
        ferry.añadirPasajero(juan);
        ferry.añadirPasajero(ana);

        //* Visualizar el nombre del pasajero más joven
        Pasajero pasajeroMasJoven = ferry.getPasajeroMasJoven();
        if (pasajeroMasJoven != null) {
            System.out.println("El pasajero más joven es: " + pasajeroMasJoven.getNombre());
        } else {
            System.out.println("No hay pasajeros en el ferry.");
        }
    }
}
