package prestamoherramientas;




public class Main {
    public static void main(String[] args) {
        Vecino juan = new Vecino("Juan");
        Vecino pepe = new Vecino("Pepe");
        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");

        juan.prestarHerramienta("Martillo", "3 de febrero de 2018", pepe);
        juan.prestarHerramienta("Sierra", "1 de mayo de 2018", ana);
        luis.prestarHerramienta("Destornillador", "5 de agosto de 2017", juan);
        ana.prestarHerramienta("Llave inglesa", "7 de agosto de 2017", juan);
        pepe.prestarHerramienta("Tenazas", "7 de agosto de 2017", juan);

        juan.herramientasQueHasPrestado();
        System.out.println();
        juan.herramientasQueTeHanPrestado();
    }
}
