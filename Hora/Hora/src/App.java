public class App {
  public static void main(String[] args) {
        Hora horaActual = new Hora();
        System.out.println("Hora actual: " + horaActual.toString());

        // Avanzar un segundo


        // Cambiar la hora a 12:30:45
        horaActual.setHora(21);
        horaActual.setMinutos(59);
        horaActual.setSegundos(58);
        System.out.println("Hora cambiada: " + horaActual.toString());
         horaActual.avanzarSegundo();
         System.out.println("Después de avanzar un segundo: " + horaActual.toString());
         horaActual.avanzarSegundo();
        System.out.println("Después de avanzar un segundo: " + horaActual.toString());
    }
}
