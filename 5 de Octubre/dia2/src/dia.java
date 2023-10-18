public class dia {
    private String dia;

    public void setDia(int queDia) {
        switch (queDia) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("No es un dia de la semana");
                break;

        }

    }
    public String getDia() {
        return dia;
    }
}
