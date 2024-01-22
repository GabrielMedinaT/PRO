import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        // Ruta del archivo actual
        String rutaArchivoActual = "/Users/gabriel/Desktop/Otromas.txt/video2.mp4";

        if (rutaArchivoActual.length()-4 == rutaArchivoActual.lastIndexOf(".")) {
            System.out.println("El archivo no tiene extensión.");
            return;
        }

        // Nuevo nombre del archivo
        String nuevoNombre = "Otromas.txt";

        // Crear un objeto File con la ruta del archivo actual
        File archivoActual = new File(rutaArchivoActual);

        // Crear un objeto File con la ruta del nuevo archivo (usando el mismo directorio)
        File nuevoArchivo = new File(archivoActual.getParent(), nuevoNombre);

        // Intentar renombrar el archivo
        if (archivoActual.renameTo(nuevoArchivo)) {
            System.out.println("Archivo renombrado exitosamente.");
        } else {
            System.out.println("No se pudo renombrar el archivo.");
        }
    }
}
