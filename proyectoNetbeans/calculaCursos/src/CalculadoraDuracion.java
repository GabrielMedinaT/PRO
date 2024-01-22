import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraDuracion {

    public static void main(String[] args) {
        try {
            float horasTotales = Float.parseFloat("5"); // Reemplaza con tu lógica para obtener el valor desde la interfaz gráfica
            String horaInicio = "09:00"; // Reemplaza con tu lógica para obtener el valor desde la interfaz gráfica
            String horaFin = "16:00"; // Reemplaza con tu lógica para obtener el valor desde la interfaz gráfica
            String fechaInicioStr = "2024-01-08"; // Reemplaza con tu lógica para obtener el valor desde la interfaz gráfica

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaInicio = dateFormat.parse(fechaInicioStr);

            String[] horaInicioParts = horaInicio.split(":");
            String[] horaFinParts = horaFin.split(":");
            Calendar horaInicioDate = Calendar.getInstance();
            horaInicioDate.set(Calendar.HOUR_OF_DAY, Integer.parseInt(horaInicioParts[0]));
            horaInicioDate.set(Calendar.MINUTE, Integer.parseInt(horaInicioParts[1]));

            Calendar horaFinDate = Calendar.getInstance();
            horaFinDate.set(Calendar.HOUR_OF_DAY, Integer.parseInt(horaFinParts[0]));
            horaFinDate.set(Calendar.MINUTE, Integer.parseInt(horaFinParts[1]));

            float duracionHorasDiarias = (float) ((horaFinDate.getTimeInMillis() - horaInicioDate.getTimeInMillis()) / (1000 * 60 * 60.0));

            List<String> festivos = obtenerDiasFestivos();

            Calendar fechaFin = calcularFechaFin(fechaInicio, duracionHorasDiarias, horasTotales, festivos);

            mostrarResultado(fechaInicio.getTime(), duracionHorasDiarias, fechaFin.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Calendar calcularFechaFin(Date fechaInicio, float duracionHorasDiarias, float horasTotales, List<String> festivos) {
        Calendar fechaFin = Calendar.getInstance();
        fechaFin.setTime(fechaInicio);
        float horasRestantes = horasTotales;
        int maxIterations = (365 * 24 * 60 * 60 * 1000) / (int) (duracionHorasDiarias * 60 * 60 * 1000);

        for (int i = 0; i < maxIterations && horasRestantes > 0; i++) {
            // Excluir sábados, domingos y festivos
            if (fechaFin.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                fechaFin.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY &&
                !festivos.contains(formatDate(fechaFin.getTime()))) {
                horasRestantes -= duracionHorasDiarias;
            }

            // Incrementar la fecha solo si aún hay horas por restar
            if (horasRestantes > 0) {
                fechaFin.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        return fechaFin;
    }

    private static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        return dateFormat.format(date);
    }

    private static void mostrarResultado(long fechaInicio, float duracionHorasDiarias, long fechaFin) {
        System.out.println("Fecha de inicio: " + formatDate(new Date(fechaInicio)));
        System.out.println("Horas diarias: " + duracionHorasDiarias);
        System.out.println("Fecha de finalización calculada: " + formatDate(new Date(fechaFin)));
    }

    private static List<String> obtenerDiasFestivos() {
        // Puedes implementar tu lógica para obtener los días festivos aquí
        // Por ejemplo, realizar una solicitud HTTP a una API
        // Devolver la lista de festivos en formato "yyyy-MM-dd"
        List<String> festivos = new ArrayList<>();
        festivos.add("2024-01-01");
        festivos.add("2024-12-25");
        return festivos;
    }
}
