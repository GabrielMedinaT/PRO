package Switchdias.dias.src;
public class App {
    public static void main(String[] args) {
        Dias objetoDias = new Dias();
        objetoDias.setMes(2); // Cambia el valor de la variable mes según lo necesites
        objetoDias.setAnio(2024); // Cambia el valor del año según lo necesites

        objetoDias.calcularDiasMes();

        System.out.println("El mes " + objetoDias.getMes() + " tiene " + objetoDias.getDiasMes() + " días.");


    }
}
