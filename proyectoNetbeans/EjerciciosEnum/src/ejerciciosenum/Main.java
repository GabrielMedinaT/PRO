
package ejerciciosenum;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        notas n = new notas();
        
        n.cambiarNotas(11);
        System.out.println(n);

        s.printSemaforo();

        // Cambia el estado del semáforo y lo imprime varias veces
        for (int i = 0; i < 4; i++) {
            s.cambiarEstado();
            s.printSemaforo();
        }
    }
    
}
