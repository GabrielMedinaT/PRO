package ExamenSegundaEvaluacion;

import java.util.TreeMap;

public class C {
    
    public String disco;
    public TreeMap<Integer, B> cancion;

    public C(String disco) {
        this.disco = disco;
        this.cancion = new TreeMap<>();
    }
    
    public void mostrar(){
        System.out.println("Las Canciones del disco '"+this.disco+"' :");
        cancion.forEach((k,v) -> {System.out.println(k + " : " + v.cantante + " | " + v.c.cancion);});
    }
    
}
