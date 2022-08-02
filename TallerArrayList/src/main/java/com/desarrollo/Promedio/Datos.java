/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.Promedio;

/**
 *
 * @author Wladimir Tierra
 */
public class Datos {

    double num;

    public static int contador;

    public Datos(double num) {
        this.num = num;
        contador++;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }


    public static int getContador() {
        return contador;
    } 



    @Override
    public String toString() {
        return "Datos{" + "num=" + num + '}';
    }

}
