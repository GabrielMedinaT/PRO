/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabrielmedinaelmcharrafille
 */
class Discos implements Cloneable {
    private String nombre;
    private List<Canciones> cancion;

    public Discos(String nombre) {
        this.nombre = nombre;
        this.cancion = new ArrayList<>();

    }

    public List<Canciones> getCanciones() {
        return cancion;
    }

    public void agregarCanciones(Canciones cancion) {
        this.cancion.add(cancion);
    }

    // eliminar canciones
    public void eliminarCanciones(Canciones cancion) {
        this.cancion.remove(cancion);
    }

    @Override
    protected Discos clone() {
        try {
            Discos cloneDiscos = (Discos) super.clone();
            cloneDiscos.cancion = new ArrayList<>(this.cancion);
            return cloneDiscos;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
