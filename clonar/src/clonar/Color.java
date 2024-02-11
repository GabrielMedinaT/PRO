package clonar;
public class Color implements Cloneable {
 public int r,g,b;
 public Color(int r, int g, int b) {
 this.r = r;
 this.g = g;
 this.b = b;
//EJEMPLO DE CLONACIÓN DE OBJETOS COMPUESTOS PROGRAMACIÓN
 }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
 public Object clone() throws CloneNotSupportedException{
 Object obj=null;
 try{
 obj=super.clone();
 }catch(CloneNotSupportedException ex){
 System.out.println(" no se puede duplicar");
 }
 return obj;
 }
}
