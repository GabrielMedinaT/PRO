 
public class VisorReloj
{
    private VisorNumero horas;
    private VisorNumero minutos;
    private VisorNumero segundos;
    private VisorNumero Ahoras;
    private VisorNumero Aminutos;
    private VisorNumero Asegundos;
    private String visorString;



    public VisorReloj()
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        segundos = new VisorNumero(60);
        Ahoras = new VisorNumero(25);
        Aminutos = new VisorNumero(60);
        Asegundos = new VisorNumero(60);

        actualizarReloj();
    }



    public VisorReloj(int hora, int minuto , int segundo)
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        segundos = new VisorNumero(60);
        ponerEnHora(hora, minuto, segundo);
    }


    public void emitirTic()
    {
        segundos.incrementar();
        if (segundos.getValor() == 0)
        {
            minutos.incrementar();
            if (minutos.getValor() == 0)
            {
                horas.incrementar();
            }
        }

        actualizarReloj();
        printReloj();
    }


    public void ponerEnHora(int hora, int minuto , int segundo)
    {
        horas.setValor(hora);
        minutos.setValor(minuto);
        segundos.setValor(segundo);
        actualizarReloj();
    }
    public void ponerAlarma(int hora, int minuto , int segundo)
    {
        Ahoras.setValor(hora);
        Aminutos.setValor(minuto);
        Asegundos.setValor(segundo);
        actualizarReloj();
    }


    public String getHora()
    {
        return visorString;
    }

    public int getHoras()
    {
        return horas.getValor();
    }

    public int getMinutos()
    {
        return minutos.getValor();
    }

    public int getSegundos()
    {
        return segundos.getValor();
    }

    public int getAhora()
    {
        return Ahoras.getValor();
    }

    public int getAminutos()
    {
        return Aminutos.getValor();
    }

    public int getAsegundos()
    {
        return Asegundos.getValor();
    }


    private void actualizarReloj() {



        visorString = horas.getValorVisor() + ":" +
                      minutos.getValorVisor() + ":" +
                      segundos.getValorVisor();

    }

    public void printReloj()
    {
        System.out.print('\u000C');
        System.out.println(visorString);
    }
}
