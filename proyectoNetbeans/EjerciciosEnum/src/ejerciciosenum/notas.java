/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosenum;

/**
 *
 * @author gabriel
 */
enum queNotas {
    Insuficiente,
    Suficiente,
    Bien,
    Notable,
    Sobresaliente,
    FueradeRango
}

public class notas {
    private queNotas notas;
    private int queSaco;
    private String novalido = "Nota no valida";

    public queNotas getNotas() {
        return notas;
    }

    public void cambiarNotas(int queSaco) {
        switch (queSaco) {
            case 1:
            case 2:
            case 3:
            case 4:
                notas = queNotas.Insuficiente;
                break;
            case 5:
                notas = queNotas.Suficiente;
                break;
            case 6:
                notas = queNotas.Bien;
                break;
            case 7:
            case 8:
                notas = queNotas.Notable;
                break;
            case 9:
            case 10:
                notas = queNotas.Sobresaliente;
                break;
            default:
                System.out.println("Nota no válida, debe ser entre 0 y 10 ");
                notas = queNotas.FueradeRango;
        }
    }
    // metodo tostring para que indique las notas

@Override
public String toString() {
    if (notas != null) {
        return "La nota es " + notas;
    } else {
        return "La nota no está definida";
    }
}

}
