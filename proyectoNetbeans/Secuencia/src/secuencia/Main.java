/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secuencia;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Secuencia secuencia1 = new Secuencia(3);
        Secuencia secuencia2 = new Secuencia(3);

        System.out.println("Secuencia 1: " + secuencia1);
        System.out.println("Secuencia 2: " + secuencia2);

        Secuencia fusion = secuencia1.fusionarCon(secuencia2);
        System.out.println("Fusión: " + fusion);

        Secuencia interseccion = secuencia1.interseccionCon(secuencia2);

        System.out.println("Intersección: " + interseccion);
        System.out.println("");
        
    }
   
        
    }
