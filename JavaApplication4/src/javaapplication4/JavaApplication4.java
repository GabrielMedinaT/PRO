
package javaapplication4;

import java.util.TreeMap;

/**
 *
 * @author Gabriel Medina
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeMap<Integer, String> RN = new TreeMap<>();
        
        RN.put(0, "Enero");
        RN.put(1, "Febrero");
        RN.put(2, "Marzo");
        RN.put(3, "Abril");
        RN.put(4, "Mayo");
        RN.put(5, "Junio");
        
        //
        RN.keySet().forEach(i -> {System.out.println(i + ":" + RN.get(i));});
        
        RN.remove(3);
        
        System.out.println("Despues de borrar");
        
        RN.keySet().forEach(i -> {System.out.println(i + ":" + RN.get(i));});
        
        System.out.println("Almacenar de nuevo");
        
        RN.put(3, "Abril");
        
        RN.put(3, "otro");
        RN.keySet().forEach(i -> {System.out.println(i + ":" + RN.get(i));});
        
        System.out.println("--------------------------------------------");
        
        
        RN.forEach((k,v)->{System.out.println(k + ":"+ v);});
        // TODO code application logic here
    }
    
}
