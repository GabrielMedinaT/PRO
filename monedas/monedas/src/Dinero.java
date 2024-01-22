public class Dinero {

    private int euros;
    private final int BILLETE_50 = 50;
    private final int BILLETE_20 = 20;
    private final int BILLETE_10 = 10;
    private final int BILLETE_5 = 5;
    private final int MONEDA_2 = 2;
    private final int MONEDA_1 = 1;
    private double resto;

    public Dinero(int euros) {
        this.euros = euros;
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }

    public void printDescomposicionMonedas() {
        System.out.println("Descomposición en billetes y monedas de " + euros + "€");

        int billetes10 = euros / BILLETE_10;
        int resto = euros % BILLETE_10;
        int billetes5 = resto / BILLETE_5;
        resto = resto % BILLETE_5;
        int monedas2 = resto / MONEDA_2;
        int monedas1 = resto % MONEDA_2;

        if (euros > 0) {



                if (billetes10 > 0) {
                    System.out.println("Billetes de 10€: " + billetes10);
                }
                if (billetes5 > 0) {
                    System.out.println("Billetes de 5€: " + billetes5);
                }
                if (monedas2 > 0) {
                    System.out.println("Monedas de 2€: " + monedas2);
                }
                if (monedas1 > 0) {
                }     System.out.println("Monedas de 1€: " + monedas1);

        } else {
            System.out.println("Cantidad introducida incorrecta (debe ser mayor que 0)");
        }

    }

   }


