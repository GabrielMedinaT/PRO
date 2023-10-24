package RelojDigital;

public class App {

    public static void main(String[] args) {
        VisorReloj reloj = new VisorReloj();
        VisorReloj reloj2 = new VisorReloj(00, 00, 13);
        reloj.ponerEnHora(23, 59, 58);
        reloj.printReloj();

        do {
            reloj.emitirTic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el sleep por alguna causa");
            }

            if (reloj.getHora().equals(reloj2.getHora())) {
                System.out.println("ALARMA");
            }
        } while (true && !reloj.getHora().equals(reloj2.getHora()) );

}

}
