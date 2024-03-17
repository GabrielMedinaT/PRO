package examen13marzo;


import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Circulos {
    public static void main(String[] args) {
        Set<Circunferencia> circunferencias = generarCircunferencias(100, 10, 20, 0, 500);
        String svgContent = generarSVG(circunferencias);
        //si existe el archivo añade un 1 al final del nombre

        

        guardarArchivo(svgContent, "/Users/gabriel/Documents/Codigo/PRO/Examen13Marzo/circunferencias.svg");
    }

    private static Set<Circunferencia> generarCircunferencias(int cantidad, int radioMin, int radioMax, int posicionMin, int posicionMax) {
        Set<Circunferencia> circunferencias = new HashSet<>();
        Random random = new Random();

        while (circunferencias.size() < cantidad) {
            int radio = random.nextInt(radioMax - radioMin + 1) + radioMin;
            int x = random.nextInt(posicionMax - radio * 2 - posicionMin + 1) + posicionMin + radio;
            int y = random.nextInt(posicionMax - radio * 2 - posicionMin + 1) + posicionMin + radio;

            Circunferencia circunferencia = new Circunferencia(x, y, radio);
            if (!seSolapa(circunferencia, circunferencias)) {
                circunferencias.add(circunferencia);
            }
        }

        return circunferencias;
    }

    private static boolean seSolapa(Circunferencia circunferencia, Set<Circunferencia> circunferencias) {
        for (Circunferencia c : circunferencias) {
            double distanciaCentros = Math.sqrt(Math.pow(circunferencia.getX() - c.getX(), 2) + Math.pow(circunferencia.getY() - c.getY(), 2));
            if (distanciaCentros < circunferencia.getRadio() + c.getRadio()) {
                return true;
            }
        }
        return false;
    }

    private static String generarSVG(Set<Circunferencia> circunferencias) {
        StringBuilder svgBuilder = new StringBuilder();
        svgBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"1500\" height=\"1500\">\n");
        for (Circunferencia circunferencia : circunferencias) {
            svgBuilder.append(circunferencia.toSVGString()).append("\n");
        }
        svgBuilder.append("</svg>");
        return svgBuilder.toString();
    }

    private static void guardarArchivo(String contenido, String ruta) {
        try (FileWriter writer = new FileWriter(ruta)) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Circunferencia {
    private int x;
    private int y;
    private int radio;

    public Circunferencia(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadio() {
        return radio;
    }

    public String toSVGString() {
        return String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\" fill=\"none\" stroke=\"black\"/>", x, y, radio);
    }
}