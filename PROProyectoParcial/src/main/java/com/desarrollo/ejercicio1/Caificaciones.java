/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Caificaciones {

    public static void main(String[] args) {
        double calif, promedio, acumulador = 0;
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese la calificación " + cont);
            calif = sc.nextDouble();
            if (calif >= 1 && calif <= 10) {
                acumulador += calif;
                ++cont;

            } else {
                System.out.println("Ingrese una calificación entre 1 y 10");
            }
        } while (cont <= 3);

        promedio = acumulador / (cont-1);
        System.out.println("El promedio es " + promedio);

        if (promedio >= 7) {
            System.out.println("Usted aprobó la materia");

        } else {
            System.out.println("Usted reprobó la materia");
        }

    }

}
