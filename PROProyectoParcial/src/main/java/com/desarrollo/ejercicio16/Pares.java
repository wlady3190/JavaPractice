/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Pares {

    public static void main(String[] args) {
        int num, arr[];
        Scanner sc = new Scanner(System.in);

        System.out.println("NUMEROS PARES");
        System.out.println("Ingrese a partir de qué número se imprimirán los pares");
        num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (num % 2 == 0) {
                System.out.println(num + 2 * i);

            } else {
                System.out.println((num + 1) + (2 * i));
            }

        }

    }

}
