/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.TreeMap;

public class Disco {
    public String disco;
    public TreeMap<Integer, Cantante> cancion;

    public Disco(String disco) {
        this.disco = disco;
        this.cancion = new TreeMap<>();
    }

 

    public void ver() {
        System.out.println("Canciones del disco " + this.disco + ":");
        System.out.println("*------------------------------*");
        System.out.println("* Artista \t Cancion");
        cancion.forEach((k, v) -> {
            System.out.println(v.cantante + " \t| " + v.c.cancion);
        });
    }
}
