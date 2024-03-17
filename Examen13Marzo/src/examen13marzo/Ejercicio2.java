package examen13marzo;




import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        A a1 = new A("Objeto A1");
        B b1 = new B("Objeto B1");
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        c1.addC(c2);
        c1.addC(c3);
        b1.addC(c1);
        a1.addB(b1);
        a1.mostrar();
    }
}

class A {
    private String nombre;
    private Set<B> bSet;

    public A(String nombre) {
        this.nombre = nombre;
        bSet = new HashSet<>();
    }

    public void addB(B b) {
        bSet.add(b);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        bSet.forEach(B::mostrar);
    }
}

class B {
    private String nombre;
    private Set<C> cSet;

    public B(String nombre) {
        this.nombre = nombre;
        cSet = new HashSet<>();
    }

    public void addC(C c) {
        cSet.add(c);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        cSet.forEach(System.out::println);
    }
}

class C {
    private Set<C> cSet;

    public C() {
        cSet = new HashSet<>();
    }

    public void addC(C c) {
        cSet.add(c);
    }

    @Override
    public String toString() {
        return "Objeto C";
    }
}

