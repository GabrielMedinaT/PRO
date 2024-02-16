class Herramienta {
    private String nombre;
    private String fechaPrestamo;
    private String quienPresto;

    public Herramienta(String nombre, String fechaPrestamo, String quienPresto) {
        this.nombre = nombre;
        this.fechaPrestamo = fechaPrestamo;
        this.quienPresto = quienPresto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getQuienPresto() {
        return quienPresto;
    }
}
