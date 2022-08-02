/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Aleatorio {

    public static void main(String[] args) {
        int num;
        double random;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        random = Math.floor((Math.random() * (10 - 1 + 1) + 1));
        
        do {
            System.out.println("");
            System.out.println("ADIVINA EL NÚMERO ENTRE 1 Y 10");
            System.out.println("Ingresa un número");
            num = sc.nextInt();
            if (num == random) {
                System.out.println("**Has adivinado el número**");
                correcto = false;

            } else {
                System.out.println("Intenta otra vez");
                correcto = true;
            }

        } while (correcto == true);

    }

}
