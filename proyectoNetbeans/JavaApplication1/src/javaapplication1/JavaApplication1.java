package javaapplication1;

public class JavaApplication1 {
    private int a = 555;
    private int o = 232342;
    private String nombre;

    public static void main(String[] args) {

        JavaApplication1 b = new JavaApplication1();
        JavaApplication1 c = new JavaApplication1();
        c.nombre = "hola";

        System.out.println(b.a + b.o);
        System.out.println(c.nombre);

    }

}
