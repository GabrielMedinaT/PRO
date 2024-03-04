
package javaapplication8;


public class JavaApplication8 {

    

    public static void main(String[] args) {

        double sumatoria=0;
        
        for (int i = 0; i < 100; i++) {
            //redondear a dos digitos
            double azar = Math.random();
            double azarR = Math.round(azar*10.0);
           //si azarR pasado a int es par
            if((int)azarR%2==0){
                sumatoria+=azarR;
                System.out.println("Es par: " + azarR/10.0);
            }else{
                System.out.println("No es par: " + azarR/10.0);
            }
        }
        System.out.println("Sumatoria: " + sumatoria/10);
    
    }
    
}
