package ExamenSegundaEvaluacion;

public class D {

    public static void main(String[] args) {

        C d1 = new C("Thriller");
        C d2 = new C("Dark side of the moon");
        C d3 = new C("Led Zeppeling IV");

        A c1 = new A("Money");
        A c2 = new A("Billie Jean");
        A c3 = new A("Stairway to heaven");

        B a1 = new B("Michael Jackson", d1, c2);
        B a2 = new B("Pink Floyd", d2, c1);
        B a3 = new B("Led Zeppeling", d3, c3);
        
        d1.mostrar();
        c1.mostrar();
        c3.mostrar();
    }

}
