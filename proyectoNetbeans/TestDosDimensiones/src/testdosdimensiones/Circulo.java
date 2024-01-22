/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdosdimensiones;

/**
 *
 * @author gabriel
 */
public class Circulo {
    private static int contadorCirculos = 0;

    private int numero;
    private Punto centro;
    private int diametro;

    public Circulo(Punto centro, int diametro) {
        this.centro = centro;
        this.diametro = diametro;
        this.numero = ++contadorCirculos;
    }

    @Override
    public String toString() {
        return "Círculo Nº" + numero + " = " + centro + "  D=" + diametro;
    }
}