package javaapplication29;

public class JavaApplication29 {

    public static void main(String[] args) {
        MODULO m1 = new MODULO("PRO");
        MODULO m2 = new MODULO("SSF");
        PROFESOR p1 = new PROFESOR("Carlos", m1);
        PROFESOR p2 = p1.clone();
        p1.agregarModulo(m2);
        System.out.println(p2);
    }
}
