package Arrays;

public class EstadisticaLuzSolar {

    private String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    private int[] horas = { 100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120 };

    public EstadisticaLuzSolar() {
        // Constructor vacío, ya que no necesitamos inicializar nada específico.
    }

    public double getMediaSol() {
        int totalHoras = 0;

        for (int i = 0; i < horas.length; i++) {
            totalHoras += horas[i];
        }

        return (double) totalHoras / horas.length;
    }

    public String mesMasSoleado() {
        int maxHoras = horas[0];
        int indiceMesMax = 0;

        for (int i = 1; i < horas.length; i++) {
            if (horas[i] > maxHoras) {
                maxHoras = horas[i];
                indiceMesMax = i;
            }
        }

        return nombresMeses[indiceMesMax];
    }

    public String mesMenosSoleado() {
        int minHoras = horas[0];
        int indiceMesMin = 0;

        for (int i = 1; i < horas.length; i++) {
            if (horas[i] < minHoras) {
                minHoras = horas[i];
                indiceMesMin = i;
            }
        }

        return nombresMeses[indiceMesMin];
    }
}
