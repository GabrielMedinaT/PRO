/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores03;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Interfaz {

    private int dimeMax;

    public void setDimeMAx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del vector: ");
        dimeMax = sc.nextInt();
    }
    
    public int getMax(){
        return dimeMax;
    }

}
