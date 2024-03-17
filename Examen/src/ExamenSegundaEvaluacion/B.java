package ExamenSegundaEvaluacion;

public class B {

    public String cantante;
    public C d;
    public A c;
    public static Integer k = 0;

    public B(String cantante, C d, A c) {
        this.cantante = cantante;
        this.d = d;
        this.c = c;
        d.cancion.put(k, this);
        c.disco.put(k, this);
        k++;
    }

}
