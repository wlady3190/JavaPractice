/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.aleatorio;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Aleatorio {

    public static void main(String[] args) {
        int num = 0, count = 0;
        double aleatorio;

        Scanner sc = new Scanner(System.in);

        aleatorio = Math.floor((Math.random() * 100 - 1 + 1)) + 1;

        do {
            count++;
            try {
                System.out.println("");
                System.out.println("**Adivinando el número**");
                System.out.println("Ingresa un número entre 1 y 100");
                num = sc.nextInt();

                if (num == aleatorio) {
                    System.out.println("**FELICIDADES ADIVINASTE**\nIntento: " + count);

                } else if (num > aleatorio) {
                    System.out.println("El número ingresado es MAYOR al número aleatorio.\nIntento: " + count);
                } else if (num < aleatorio) {
                    System.out.println("El número ingresado es MENOR al aleatorio \nIntento: " + count);
                }
            } catch (InputMismatchException e) {

                System.out.println("Ingrese un Dato numérico válido entre 1 y 100.\nIntento: " + count);
                sc.nextLine();

            }
        } while (num!=aleatorio);
    }

}
