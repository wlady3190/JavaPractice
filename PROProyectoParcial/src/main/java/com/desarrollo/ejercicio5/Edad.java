/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Edad {

    public static void main(String[] args) {
        int edad;
        char decision;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("¿Eres o no mayor de edad?");
            System.out.println("Ingresa tu edad");
            edad = sc.nextInt();

            if (edad >= 18) {
                System.out.println("Eres mayor de edad");

            } else {
                System.out.println("Aún eres menor de edad");
            }
            System.out.println("");
            System.out.println("¿Deseas ingresar otra edad? (s/n)");
            decision = sc.next().charAt(0);

            decision = Character.toLowerCase(decision);
        } while (decision != 'n');

    }

}
