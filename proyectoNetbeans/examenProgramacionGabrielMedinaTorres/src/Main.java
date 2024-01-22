/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Gabriel", 2, "45/11/1999");
        Persona persona2 = new Persona("Maria", "12/12/1999");
        Persona persona3 = new Persona ("Antonio", "12/12/2020");
        Persona persona4 = new Persona ("Ana" , "20/12/1999");
   
        ListaPersonas listaPersonas = new ListaPersonas();
        listaPersonas.addPersona(persona1);
        listaPersonas.addPersona(persona2);
        listaPersonas.addPersona(persona3);
        listaPersonas.addPersona(persona4);
        
        listaPersonas.mostrarLista();
        
        listaPersonas.borrarPersona();
        
       
        
        listaPersonas.mostrarLista();
        
        listaPersonas.borrarPersona();
        listaPersonas.mostrarLista();
        
        listaPersonas.addPersona(persona4);
        
        listaPersonas.mostrarLista();
        
       


    }

}
