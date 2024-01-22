package vectores03;

public class main {

    public static void main(String[] args) {
        
        Interfaz f = new Interfaz();
        f.setDimeMAx();
        //System.out.println(f.getMax());
        Vectores03 v = new Vectores03();
        v.setMax(f.getMax());
        v.rellenarVector();
        System.out.println("Vector sin ordenar: ");
        System.out.println(v.toString());
        System.out.println("Ahora ordenado: ");
        v.ordenarVector();
        System.out.println(v.toString());
        System.out.println("Ahora ordenado de forma descendente: ");
        v.ordenarVectorDesc();
        System.out.println(v.toString());

    }

}
