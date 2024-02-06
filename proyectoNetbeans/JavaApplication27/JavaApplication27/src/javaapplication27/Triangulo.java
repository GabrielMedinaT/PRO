
package javaapplication27;

public class Triangulo implements Cloneable{
    private int base ;
    private int altura ;
    private Punto origen;

    public Triangulo() {
	    origen = new Punto();
	    base=0;
	    altura=0;
    }
    public Triangulo(Punto p) {
	    this(p, 0, 0);
    }
    public Triangulo(int w, int h) {
	    this(new Punto(0, 0), w, h);
    }
    public Triangulo(Punto p, int w, int h) {
	    origen = p;
	    base = w;
	    altura = h;
    }
    public Object clone(){
        Triangulo obj=null;
        try{
            obj=(Triangulo)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        obj.origen=(Punto)obj.origen.clone();
        return obj;
    }
    public void mover(int dx, int dy) {
	    origen.trasladar(dx, dy);
    }
    public int area() {
	    return (base * altura)/2;
    }
    public String toString(){
        String texto=origen+" base: "+base+" altura: "+altura;
        return texto;
    }
}