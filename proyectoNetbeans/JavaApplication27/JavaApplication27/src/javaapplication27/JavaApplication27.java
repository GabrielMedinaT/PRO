package javaapplication27;
public class JavaApplication27 {
    public static void main(String[] args) {
      Punto origen=new Punto(2,3);
      Rectangulo r1=new Rectangulo(origen,10,20);
      Rectangulo r2=(Rectangulo)r1.clone();
      System.out.print("r1 ");
      System.out.println(r1);
      System.out.print("r2 (r1 clonado): ");
      System.out.println(r2);
      System.out.print("r1 (modificamos origen):");
      r1.mover(1, 1);
      System.out.print("r1: ");
      System.out.println(r1);
      System.out.print("r2: ");
      System.out.println(r2);
      
      Triangulo t1 = new Triangulo (origen, 2, 40);
      Triangulo t2;
      t2 = (Triangulo) (t1.clone());
      System.out.println(t1);
      System.out.println(t2);
      t2.mover(20, 0);
      t1.mover(-10, 1);
      System.out.println(t2);
      System.out.println(t1);
    }
    
}
