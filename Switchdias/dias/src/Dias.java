package Switchdias.dias.src;
public class Dias {
    private int mes;
    private int anio;
    private int diasMes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDiasMes() {
        return diasMes;
    }

    public void calcularDiasMes() {
        switch(mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasMes = 29; // Año bisiesto
                } else {
                    diasMes = 28; // No es año bisiesto
                }
                break;
            default:
                diasMes = -1; // Valor por defecto si el mes no es válido
                break;
        }
    }


}
