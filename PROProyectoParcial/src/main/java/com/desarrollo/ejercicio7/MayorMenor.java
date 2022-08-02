/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class MayorMenor {

    public static void main(String[] args) {
        int num1, num2, mayor, menor;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el primero número");
        num1 = sc.nextInt();
        boolean correcto = false;
        do {
            System.out.println("Ingrese el segundo número");
            num2 = sc.nextInt();
            
            if (num1 == num2) {
                System.out.println("");
                System.out.println("Ingrese un número diferente");

            }

        } while (num1 == num2);
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        System.out.println("\nNúmero mayor: " + mayor + "\nNúmero menor: " + menor);

    }

}
