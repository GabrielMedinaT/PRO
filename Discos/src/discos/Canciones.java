/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discos;

/**
 *
 * @author gabrielmedinaelmcharrafille
 */
class Canciones implements Cloneable {
    private String nombre;
    
    public Canciones(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
   
    
    @Override
    protected Canciones clone() throws CloneNotSupportedException {
        try{
            return (Canciones) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
       
}
