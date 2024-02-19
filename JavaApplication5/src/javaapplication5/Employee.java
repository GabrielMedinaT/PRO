/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author gabriel
 */
class Employee {
    // Employee has three attributes
    // notas , name, expediente
    public int notas;
    public String name;
    public Integer expediente;

    // default constructor
    Employee() {
    }

    // parameterized constructor
    Employee(int notas, String name, int expediente) {
        this.notas = notas;
        this.name = name;
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "" + this.notas + " " + this.name + " "
                + this.expediente;
    }
}
