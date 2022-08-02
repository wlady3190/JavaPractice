/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio30;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class PalabraLetra {
    public static void main(String[] args) {
        String palabra;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese una palabra");
        palabra = sc.next();
        
        for (int i = palabra.length()-1; i >= 0; i--) {
            System.out.println(palabra.charAt(i));
        }
        
    }
}
