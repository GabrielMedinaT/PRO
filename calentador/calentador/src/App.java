public class App {
    public static void main(String[] args) {
        Calentador calentador1 = new Calentador(15, 100);

        System.out.println("Temperatura actual: " + calentador1.getTemperatura());

        calentador1.calentar();
        System.out.println("Temperatura después de calentar: " + calentador1.getTemperatura());

        calentador1.enfriar();
        System.out.println("Temperatura después de enfriar: " + calentador1.getTemperatura());

        calentador1.enfriar();

        calentador1.setIncremento(50);
        System.out.println("Nuevo incremento: " + calentador1.getIncremento());

        calentador1.calentar();
        System.out.println("Temperatura después de calentar: " + calentador1.getTemperatura());

        calentador1.calentar();
        System.out.println("Temperatura después de calentar: " + calentador1.getTemperatura());
    }
}
