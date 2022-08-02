/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class PromedioPositivos {

    public static void main(String[] args) {
        int num = 0, acumulador = 0, cont = 0;
        char decision;
        double promedio;
        boolean correcto = true;

        Scanner sc = new Scanner(System.in);

        do {

            do {
                System.out.println("Ingrese un número");
                try {
                    num = sc.nextInt();
                    correcto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese números enteros positivos");
                    correcto = false;
                    sc.next();

                }
            } while (correcto == false);

            if (num >= 0) {
                acumulador += num;
                cont++;

            } else {
                System.out.println("Ingrese un número entero");
            }
            System.out.println("¿Desea ingresar otro número? (s/n)");
            decision = sc.next().charAt(0);

        } while (decision != 'n');
        System.out.println(acumulador);
        System.out.println(cont);
        promedio = (double) acumulador / cont;

        System.out.println("El promedio de los númneros es: " + promedio);

    }

}
