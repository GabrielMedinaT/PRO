package clonar;

import java.util.ArrayList;

public class Punto implements Cloneable{
 private final int x;
 private final int y;
 public Color rgb;
 ArrayList<String> lista;
 
 
 public Punto(int x, int y,Color c) {
 this.x = x;
this.y = y;
 rgb=c;
 lista=new ArrayList<>();
 lista.add("lunes");
 lista.add("Martes");
 lista.add("Juernes");
 }

    /**
     *
     * @return devuelve el objeto clonado 
     * @throws CloneNotSupportedException
     */
    @Override
 public Object clone() throws CloneNotSupportedException{
 Object obj=null;
 try{
 obj=super.clone();
 ((Punto)obj).rgb=(Color) this.rgb.clone();
 ((Punto)obj).lista=new ArrayList<>();
 for(String s:this.lista){
 ((Punto)obj).lista.add(s);
 }
 }catch(CloneNotSupportedException ex){
 System.out.println(" no se puede duplicar");
 }
 return obj;
 }

    /**
     *
     * @return Devuelve el texto
     */
    @Override
 public String toString(){
 String texto="origen: ("+x+", "+y+") color:("+rgb.r+","+rgb.g+","+rgb.b+")";
 for(String s:this.lista){
 texto+=" "+s;
 }
 return texto;
 }
}
