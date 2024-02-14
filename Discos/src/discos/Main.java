/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discos;

/**
 *
 * @author gabrielmedinaelmcharrafille
 */
public class Main {
    public static void main (String[] args) throws CloneNotSupportedException{

        Discos D1 = new Discos("Triller");
        Canciones c1 = new Canciones("c1");
        Canciones c2 = new Canciones ("c2");
        Canciones c3 = c2.clone();
        c3.setNombre("c2 Remasterizada");
        D1.agregarCanciones(c1);
        D1.agregarCanciones(c2);
        Discos D2 = D1.clone();
        D2.eliminarCanciones(c2);
        D2.agregarCanciones(c3);

        System.out.println("Disco 1");
        for (Canciones cancion : D1.getCanciones()){
            System.out.println(cancion.getNombre());
        }
        System.out.println("Disco 2");

        for (Canciones cancion : D2.getCanciones()){
            System.out.println(cancion.getNombre());
        }

    }

}
