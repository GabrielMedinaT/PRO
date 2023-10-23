

public class App {
  public static void main(String[] args) {
       Hora  horaActual = new Hora();
        System.out.println("Hora actual: " + horaActual.toString());

        // Avanzar un segundo


        // Cambiar la hora
        horaActual.setHora(23);
        horaActual.setMinutos(59);
        horaActual.setSegundos(58);
        System.out.println("Hora cambiada: " + horaActual.toString());
        horaActual.avanzarSegundo();
        System.out.println("Después de avanzar un segundo: " + horaActual.toString());
        horaActual.avanzarSegundo();
        System.out.println("Después de avanzar un segundo: " + horaActual.toString());
    }
}
