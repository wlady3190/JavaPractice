/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class LongitudString {

    public static void main(String[] args) {
        String cadena1, cadena2;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("COmpara cadenas");
        System.out.println("Ingresa una palabra");
        cadena1 = sc.next();
        System.out.println("Ingresa otra palabra");
        cadena2 = sc.next();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Cadenas de igual longitud");

        } else {
            System.out.println("Cadenas de diferente longitud");
        }
    }

}
