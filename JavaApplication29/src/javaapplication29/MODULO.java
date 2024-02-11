package javaapplication29;
public class MODULO implements Cloneable {
    public String NOMBRE;
    public MODULO(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
    @Override
    @SuppressWarnings("CloneDeclaresCloneNotSupported")
    public Object clone(){
        Object objeto=null;
        try{
            objeto=super.clone();
        }catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");}
        return objeto;
    }
    @Override
    public String toString(){
        return this.NOMBRE;
    }
}    
   


