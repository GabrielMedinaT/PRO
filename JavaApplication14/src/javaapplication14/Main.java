import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        int numTriangles = 100;
        generateSVG(width, height, numTriangles, "triangles.svg");
    }

    public static void generateSVG(int width, int height, int numTriangles, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("<svg width=\"" + width + "\" height=\"" + height + "\" xmlns=\"http://www.w3.org/2000/svg\">");

            Random random = new Random();
            int triangleCount = 0;

            while (triangleCount < numTriangles) {
                int x1 = random.nextInt(width);
                int y1 = random.nextInt(height);
                int x2 = random.nextInt(width);
                int y2 = random.nextInt(height);
                int x3 = random.nextInt(width);
                int y3 = random.nextInt(height);

                if (!trianglesOverlap(x1, y1, x2, y2, x3, y3, printWriter)) {
                    printWriter.println("<polygon points=\"" + x1 + "," + y1 + " " +
                            x2 + "," + y2 + " " +
                            x3 + "," + y3 + "\" fill=\"none\" stroke=\"black\"/>");
                    triangleCount++;
                }
            }

            printWriter.println("</svg>");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean trianglesOverlap(int x1, int y1, int x2, int y2, int x3, int y3, PrintWriter printWriter) {
        // Comprueba si el triángulo definido por los puntos (x1, y1), (x2, y2), (x3, y3)
        // se superpone con cualquier triángulo ya impreso en el archivo SVG.

        // No hay triángulos superpuestos en el primer triángulo.
        if (printWriter.checkError()) {
            return false;
        }

        // Comprueba los límites de cada triángulo.
        int minX = Math.min(x1, Math.min(x2, x3));
        int minY = Math.min(y1, Math.min(y2, y3));
        int maxX = Math.max(x1, Math.max(x2, x3));
        int maxY = Math.max(y1, Math.max(y2, y3));

        // Comprueba cada triángulo ya impreso.
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                if (isPointInsideTriangle(x, y, x1, y1, x2, y2, x3, y3)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isPointInsideTriangle(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3) {
        // Comprueba si un punto (x, y) está dentro del triángulo definido por los puntos (x1, y1), (x2, y2), (x3, y3).
        // Fórmula obtenida de https://stackoverflow.com/a/2049593

        double area = 0.5 * (-y2 * x3 + y1 * (-x1 + x3) + x1 * (y2 - y3) + x2 * y3);
        double s = 1 / (2 * area) * (y1 * x3 - x1 * y3 + (y3 - y1) * x + (x1 - x3) * y);
        double t = 1 / (2 * area) * (x1 * y2 - y1 * x2 + (y1 - y2) * x + (x2 - x1) * y);

        return s > 0 && t > 0 && 1 - s - t > 0;
    }
}
