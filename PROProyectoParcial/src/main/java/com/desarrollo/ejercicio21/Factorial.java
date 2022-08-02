/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Factorial {

    public static void main(String[] args) {
        int num, fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo factorial");
        System.out.println("Ingrese un número entero");
        num = sc.nextInt();
         if (num < 0) {
            System.out.println("No existe factorial de números negativos");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        System.out.println("El factorial de " + num + " es: " + fact);
    }

}
