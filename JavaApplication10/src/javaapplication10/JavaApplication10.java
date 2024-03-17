package javaapplication10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication10 {

    public static void main(String[] args) throws IOException {
        File arch = new File("/Users/gabriel/Desktop/ejemplo2.txt");
        
        try {
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de lectura: " + ex.getMessage());
        }
        
      
        
    }
}
