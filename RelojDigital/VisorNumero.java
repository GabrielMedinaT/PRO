package RelojDigital;

public class VisorNumero
{
    private int limite;
    private int valor;

    /**
     * Constructor para objetos de la clase VisorNumero
     */
    public VisorNumero(int limiteMaximo)
    {
        limite = limiteMaximo;
        valor = 0;
    }

    /**
     * Devuelve el valor actual
     */
    public int getValor()
    {
        return valor;
    }



    public String getValorVisor()
    {
        if (valor < 10)
            return "0" + valor;
        else
            return  "" + valor ;
    }



    public void setValor(int nuevoValor)
    {
        if ((nuevoValor >= 0) && (nuevoValor < limite))
            valor = nuevoValor;
    }

    public void incrementar()
    {
        valor = (valor + 1) % limite;
    }
}
