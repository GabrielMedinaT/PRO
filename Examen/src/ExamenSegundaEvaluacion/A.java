package ExamenSegundaEvaluacion;

import java.util.TreeMap;

public class A {

    public String cancion;
    public TreeMap<Integer, B> disco;

    public A(String cancion) {
        this.cancion = cancion;
        this.disco = new TreeMap<>();
    }

    public void mostrar() {
        System.out.println("El Disco de la canción  '"+this.cancion+"' :");
        disco.forEach((k, v) -> {System.out.println(k + " : " + v.cantante + " | " + v.d.disco);});
    }
}
