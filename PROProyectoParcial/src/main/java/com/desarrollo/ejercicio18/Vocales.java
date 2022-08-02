/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Vocales {

    public static void main(String[] args) {
        String palabra;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese una palabra");
        palabra = sc.next();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (palabra.charAt(i) == vocales[j]) {
                    contador++;
                }
            }

        }
        System.out.println("En la palabra: " + palabra + " hay " + contador + " vocales");

    }

}
