/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio31;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class LetraEnPalabra {

    public static void main(String[] args) {

        String palabra;
        char letra;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese una palabra");
        palabra = sc.nextLine();
        System.out.println("Ingrese una letra");
        letra = sc.next().charAt(0);

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == letra) {
                cont++;

            }
        }

        System.out.println("Palabra: " + palabra + "\nLetra: " + letra + "\nNúmero de veces que se repite la letra: " + cont);

    }

}
