package Fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;

    // Constructor sin parámetros
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor con dos parámetros
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        // Verificar que el denominador no sea cero
        this.denominador = (denominador != 0) ? denominador : 1;
    }

    // Accesores y mutadores
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        // Verificar que el denominador no sea cero
        this.denominador = (denominador != 0) ? denominador : 1;
    }

    // Métodos de operaciones con fracciones
    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Fraccion otra) {
        // Verificar que el denominador de la otra fracción no sea cero
        if (otra.numerador != 0) {
            int nuevoNumerador = this.numerador * otra.denominador;
            int nuevoDenominador = this.denominador * otra.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            // Devolver una fracción inválida si el denominador de la otra fracción es cero
            return new Fraccion(0, 0);
        }
    }

    // Métodos de comparación
    public boolean igualQue(Fraccion otra) {
        return this.numerador * otra.denominador == otra.numerador * this.denominador;
    }

    public boolean menorQue(Fraccion otra) {
        return this.numerador * otra.denominador < otra.numerador * this.denominador;
    }

    // Método para clonar
    public Fraccion clonar() {
        return new Fraccion(this.numerador, this.denominador);
    }

    // Método toString
    public String toString() {
        return this.numerador + " / " + this.denominador;
    }



    public static void main(String[] args) {
        // Ejemplo de uso
        Fraccion fraccion1 = new Fraccion(4, 1);
        Fraccion fraccion2 = new Fraccion(8, 2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        System.out.println("¿Son iguales? " + fraccion1.igualQue(fraccion2));
        System.out.println("¿Es menor? " + fraccion1.menorQue(fraccion2));

        Fraccion clon = fraccion1.clonar();
        System.out.println("Clon: " + clon);
    }
}

