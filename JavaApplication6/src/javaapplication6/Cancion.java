package javaapplication6;

import java.util.TreeMap;

public class Cancion {

    public String cancion;
    public TreeMap<Integer, Cantante> disco;
    public static Integer k = 0;
    
    public Cancion (String cancion){
        this.cancion= cancion;
        this.disco = new TreeMap<>();
        k++;
    }
    
    public void ver(){
        System.out.println("Discos de la canción " + this.cancion+ " :");
        disco.forEach((k,v)->{System.out.println(k + " : " +v.cantante + " | " + v.d.disco);});
        
    }

}