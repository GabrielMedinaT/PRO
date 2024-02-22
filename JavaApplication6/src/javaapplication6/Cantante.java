package javaapplication6;

import java.util.TreeMap;

public class Cantante {
    public String cantante;
    public Disco d;
    public Cancion c;
    public static Integer k = 0;
    public TreeMap<Integer, Cancion> cancion;

    public Cantante(String cantante) {
        this.cantante = cantante;
        this.cancion = new TreeMap<>();
    }

    public Cantante(String cantante, Disco d, Cancion c) {
        this.cantante = cantante;
        this.d = d;
        this.c = c;
        this.cancion = new TreeMap<>();
        d.cancion.put(k, this);
        c.disco.put(k, this);
        k++;
    }

    public void agregarCancion(Disco d, Cancion c) {
        this.d = d;
        this.c = c;
        this.cancion = new TreeMap<>();
        d.cancion.put(k, this);
        c.disco.put(k, this);
        k++;
    }

    // ver cantante y sus canciones
   public void ver() {
    System.out.println("Canciones del cantante " + this.cantante + ":");
    System.out.println("*------------------------------*");
    System.out.println("* Disco \t Cancion");
    cancion.forEach((index, song) -> {
        System.out.println(song.d.cancion + "\t|" + song.cancion);
    });
}

}
