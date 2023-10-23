public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    // Constructor sin parámetros
    public Hora() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Accesores y mutadores para hora, minutos y segundos
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // Método para avanzar un segundo
    public void avanzarSegundo() {
        if (segundos == 59) {
            segundos = 0;
            if (minutos == 59) {
                minutos = 0;
                if (hora == 23) {
                    hora = 0;
                } else {
                    hora++;
                }
            } else {
                minutos++;
            }
        } else {
            segundos++;
        }
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }


}
