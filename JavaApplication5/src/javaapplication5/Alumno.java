/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author gabriel
 */
class Alumno {
    // Employee has three attributes
    // notas , name, expediente
    public int notas;
    public String name, certificacion;
    public Integer expediente;

    // default constructor
    Alumno() {
    }

    // parameterized constructor
    Alumno(int notas, String name, int expediente, String certificacion) {
        this.notas = notas;
        this.name = name;
        this.expediente = expediente;
        this.certificacion = certificacion;

    }

    @Override
    public String toString() {
        return "" + this.notas + " " + this.name + " "
                + this.expediente;
    }
}
