public class Ordenador {
    private int maxMemoria;
    private int memoriaInstalada;

    // Constructor sin parámetros
    public Ordenador() {
        this.maxMemoria = 1024;
        this.memoriaInstalada = 0;
    }

    // Constructor con parámetro
    public Ordenador(int maxMemoria) {
        if (maxMemoria > 0) {
            this.maxMemoria = maxMemoria;
        } else {
            this.maxMemoria = 1024;
        }
        this.memoriaInstalada = 0;
    }

    // Accesores
    public int getMaxMemoria() {
        return maxMemoria;
    }

    public int getMemoriaDisponible() {
        return maxMemoria - memoriaInstalada;
    }

    // Mutador para vaciar la memoria
    public void vaciarMemoria() {
        memoriaInstalada = 0;
    }

    // Mutador para instalar 256 Mb
    public boolean instalar256Mb() {
        if (getMemoriaDisponible() >= 256) {
            memoriaInstalada += 256;
            return true;
        } else {
            return false;
        }
    }

    // Mutador para instalar una cantidad de memoria dada
    public boolean instalarMemoria(int cantidad) {
        if (cantidad <= getMemoriaDisponible() && cantidad >= 0) {
            memoriaInstalada += cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Método para imprimir información
    public void printInformacion() {
        System.out.println("Este ordenador puede tener hasta " + maxMemoria + " Mb de memoria.");
        System.out.println("Todavía es posible instalar " + getMemoriaDisponible() + " Mb");
    }
}
