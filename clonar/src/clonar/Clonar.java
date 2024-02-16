/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clonar;
public class Clonar {
 public static void main(String[] args) throws CloneNotSupportedException {
 Punto p1 = new Punto(0, 0, new Color(255, 255, 255));
 Punto p2;
 p2 = (Punto) p1.clone();
 p2.lista.add("Julio");
 System.out.println("p1 " + p1 + "\np2 " + p2);


 }
}

