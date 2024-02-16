/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamoherramientas;

/**
 *
 * @author gabriel
 */
class Vecino {
    private String nombre;
    private Map<String, Herramienta> herramientasPrestadas;

    public Vecino(String nombre) {
        this.nombre = nombre;
        this.herramientasPrestadas = new HashMap<>();
    }

    public void prestarHerramienta(String nombreHerramienta, String fechaPrestamo, Vecino vecino) {
        Herramienta herramienta = new Herramienta(nombreHerramienta, fechaPrestamo, vecino.getNombre());
        herramientasPrestadas.put(nombreHerramienta, herramienta);
    }

    public void herramientasQueHasPrestado() {
        System.out.println("Herramientas prestadas por " + nombre + ":");
        for (Herramienta herramienta : herramientasPrestadas.values()) {
            System.out.println("Nombre: " + herramienta.getNombre() +
                    ", Fecha de préstamo: " + herramienta.getFechaPrestamo() +
                    ", Prestado a: " + herramienta.getQuienPresto());
        }
    }

    public void herramientasQueTeHanPrestado() {
        System.out.println("Herramientas prestadas a " + nombre + ":");
        for (Herramienta herramienta : herramientasPrestadas.values()) {
            System.out.println("Nombre: " + herramienta.getNombre() +
                    ", Fecha de préstamo: " + herramienta.getFechaPrestamo() +
                    ", Prestado por: " + herramienta.getQuienPresto());
        }
    }
}
