package contador.contador.src;
public class App {
    public static void main(String[] args) throws Exception {
        contador c = new contador();
        c.increment();
        System.out.println(c.getValue());
        c.increment();
        System.out.println(c.getValue());
        c.increment();
        System.out.println(c.getValue());
        c.decrement();
        System.out.println(c.getValue());
    }
}
