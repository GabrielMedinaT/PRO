package examen13marzo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class Examen13Marzo {


    //generar programa que cree circulos en un sgv que no se solapen



    public static void main(String[] args) {
        int radio = 50;
        int numCirculos = 100;
      
        generateSGV(radio, numCirculos, "circulos.svg");

      
    }

    public static void generateSGV (int radio, int numCirculos, String nombrearchivo){
        try {
            FileWriter fileWriter = new FileWriter(nombrearchivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.println("<svg width=\"" + radio + "\" height=\"" + radio + "\" xmlns=\"http://www.w3.org/2000/svg\">");
            
            Random random = new Random();
            int circuloCount = 0;
            
            while (circuloCount < numCirculos) {
                int x = random.nextInt(radio);
                int y = random.nextInt(radio);
                int r = random.nextInt(radio);
            if (circulosSeSolapan(x, y, r, printWriter)) {
                printWriter.println("<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"none\" stroke=\"black\"/>");
                circuloCount++;
                
                
            }
        }
            printWriter.println("</svg>");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static boolean circulosSeSolapan(int x, int y, int r, PrintWriter printWriter) {

        if (printWriter.checkError()) {
            return false;
        }

        // Comprueba los límites de cada circulo.
        int minX = Math.min(x, r);
        int minY = Math.min(y, r);
        int maxX = Math.max(x, r);
        int maxY = Math.max(y, r);
        return false;
    }






    


    
}
