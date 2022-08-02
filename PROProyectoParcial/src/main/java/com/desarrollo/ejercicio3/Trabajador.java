/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Trabajador {

    public static void main(String[] args) {
        int tiempo;
        double salario, valorH;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de salario");
        System.out.println("Ingrese el número de horas trabajadas / semana");
        tiempo = sc.nextInt();

        if (tiempo < 40) {
            valorH = 5;
            Trabajador.calcularSalario(valorH, tiempo);
        } else{
            valorH = 8;
            Trabajador.calcularSalario(valorH, tiempo);
        }

    }

    public static void calcularSalario(double valorH, int tiempo) {
        double salario;

        salario = valorH * tiempo;
        System.out.println("");
        System.out.println("El valor de la hora es: " + valorH);
        System.out.println("Su salario es: " + salario);

    }
}
