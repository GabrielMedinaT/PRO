import java.util.ArrayList;

/**
 * Almacena detalles del club de miembros
 * author K�lling y Barnes
 */
public class Club {
    private ArrayList<Miembro> miembros;

    public Club() {
        miembros = new ArrayList<>();
    }

    public void aniadir(Miembro miembro) {
        miembros.add(miembro);
    }

    public int numeroMiembros() {
        return miembros.size();
    }

    public int incorporadoEnMes(int mes) {
        if (mes < 1 || mes > 12) {
            System.out.println("Error: Mes fuera de rango.");
            return -1;
        }

        int count = 0;
        for (Miembro m : miembros) {
            if (m.getMes() == mes) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Miembro> borrar(int mes, int anio) {
        if (mes < 1 || mes > 12) {
            System.out.println("Error: Mes fuera de rango.");
            return new ArrayList<>();
        }

        ArrayList<Miembro> borrados = new ArrayList<>();
        java.util.Iterator<Miembro> iterator = miembros.iterator();

        while (iterator.hasNext()) {
            Miembro m = iterator.next();
            if (m.getMes() == mes && m.getAnio() == anio) {
                borrados.add(m);
                iterator.remove();
            }
        }
        return borrados;
    }

    public void listarClub() {
        for (Miembro m : miembros) {
            System.out.println(m.toString());
        }
    }
}
