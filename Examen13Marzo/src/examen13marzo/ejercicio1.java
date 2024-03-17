package examen13marzo;

class A {
    int a;
    
    public A(int a) {
        this.a = a;
    }
    
    public void f() {
        System.out.println(a);
    }
}

class B extends A {
    public B(int a) {
        super(a);
    }
    
    @Override
    public void f() {
        System.out.println("a3");
    }
}

public class ejercicio1 {
    public static void main(String[] args) {
        A[] V = new A[3];
        V[0] = new A(1);
        V[1] = new A(2);
        V[2] = new B(3);
        
        for (A obj : V) {
            obj.f();
        }
    }
}