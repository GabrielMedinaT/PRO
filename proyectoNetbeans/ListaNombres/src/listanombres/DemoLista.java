/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listanombres;

import java.util.Arrays;

/**
 *
 * @author gabriel
 */
public class DemoLista {
    private ListaNombres lista;

    public DemoLista() {
        lista = new ListaNombres();
        lista.insertarNombre("Juan");
        lista.insertarNombre("Alberta");
        lista.insertarNombre("Luis");
        lista.insertarNombre("Maria");
        lista.insertarNombre("Alberto");
        lista.insertarNombre("Elena");
        lista.insertarNombre("Marta");
    }

    public void testInsercion() {
        lista.insertarNombre("Adriana");
        lista.insertarNombre("Carlos");
        lista.insertarNombre("Gabriel");
        lista.insertarNombre("Beatriz");
    }

    public void testBorrado() {
        lista.borrarLetra('A');
    }

    public void testEmpiezan() {
        char letra = 'A';
        String[] empiezanPorAL = lista.empiezanPorLetra(letra);
        System.out.println("Nombres que empiezan por " + letra + " : " + Arrays.toString(empiezanPorAL));
        System.out.println("Cantidad de nombres que empiezan por 'AL': " + lista.empiezanPor("Al"));
    }

    public void testEscribir() {

        if (lista.nombreMasLargo() == null) {
            System.out.println("No hay nombres en la lista");
        } else if ( lista.nombreMasLargo().indexOf(" ") == -1 ){
            System.out.println("Nombre más largo: " + lista.nombreMasLargo());
        } else {
            System.out.println("Nombres más largos: " + lista.nombreMasLargo());
        }

        //System.out.println("Nombre más largo: " + lista.nombreMasLargo());
        System.out.println("Lista completa: " + lista.toString());
    }

    public static void main(String[] args) {
        DemoLista demo = new DemoLista();
        demo.testInsercion();
        demo.testBorrado();
        demo.testEmpiezan();
        demo.testEscribir();
    }
}
