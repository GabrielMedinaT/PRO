package Arrays;

public class ContadorDias {

    // Atributo para almacenar los días de cada mes del año
    private final int[] diasMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Constructor vacío
    public ContadorDias() {
        // No es necesario realizar ninguna acción en el constructor
    }

    // Método para verificar si un año es bisiesto
    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Método para contar los días transcurridos desde el inicio del año hasta una
    // fecha dada
    public int contarDias(int dia, int mes, int año) {
        int diasTranscurridos = 0;

        // Sumar los días de los meses anteriores al mes dado
        for (int i = 1; i < mes; i++) {
            diasTranscurridos += diasMes[i];
        }

        // Sumar los días del mes actual
        diasTranscurridos += dia;

        // Si es un año bisiesto y estamos en un mes posterior a febrero, agregar un día
        // adicional
        if (esBisiesto(año) && mes > 2) {
            diasTranscurridos++;
        }

        return diasTranscurridos;
    }
}
