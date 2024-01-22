/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class Persona {
    private String nombre;
    private int estadoCivil;
    private String fechaNacimiento;

    public Persona(String nombre, int estadoCivil, String fechaNacimiento) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        estadoCivil = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoCivil() {
        if (estadoCivil == 1) {
            return "Soltero";
        } else if (estadoCivil == 2) {
            return "Casado";
        } else if (estadoCivil == 3) {
            return "Divorciado";
        } else if (estadoCivil == 4) {
            return "Viudo";
        } else {
            return "Soltero";
        }
    }

    public void setFecha(int dia, int mes, int anio) {

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) {
            if (dia > 31) {
                fechaNacimiento = "El dia no puede ser mayor que 31";
                return;
            }
        } else if (mes == 2) {
            if (dia > 29) {
                fechaNacimiento = "El dia no puede ser mayor que 29";
                return;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                fechaNacimiento = "El dia no puede ser mayor que 30";
                return;
            }
        } else {
            
            fechaNacimiento = dia + "/" + mes + "/" + anio;
            return;
        }


    }

    // metodo toString para mostrar los datos de la persona
    @Override
    public String toString() {
        return "--------------------------------------------- \nNombre:     \t\t" + getNombre() + "\nEstado Civil:\t\t"
                + getEstadoCivil() + "\nFecha de Nacimiento: \t" + fechaNacimiento
                + "\n---------------------------------------------";
    }

}
