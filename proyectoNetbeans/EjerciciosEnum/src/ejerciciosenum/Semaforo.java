package ejerciciosenum;


enum Estado {
    VERDE,
    AMARILLO,
    ROJO
}


public class Semaforo {
    private Estado estado;

    
    public Semaforo() {
        this.estado = Estado.VERDE;
    }


    public Estado getEstado() {
        return estado;
    }

    
    public void cambiarEstado() {
        switch (estado) {
            case VERDE:
                estado = Estado.AMARILLO;
                break;
            case AMARILLO:
                estado = Estado.ROJO;
                break;
            case ROJO:
                estado = Estado.VERDE;
                break;
        }
    }

    
    public void printSemaforo() {
        System.out.println("Semáforo: " + estado);
    }

    
}
