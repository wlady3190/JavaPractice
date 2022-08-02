/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class NumeroDescendente {

    public static void main(String[] args) {
        int num = 0;
        boolean correcto = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Números descendente");
        System.out.println("Ingrese un número entero");
        do {
            try {
                System.out.println("Ingrese un número entero");
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Ingrese un número entero positivo");
                correcto = false;
            }

        } while (correcto == false);

        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }

    }

}
