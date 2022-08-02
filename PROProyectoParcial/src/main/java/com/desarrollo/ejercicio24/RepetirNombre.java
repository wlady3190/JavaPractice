/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class RepetirNombre {
    public static void main(String[] args) {
        String nombre;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese un nombre");
        nombre = sc.next();
        
        for (int i = 0; i < 20; i++) {
            System.out.println(nombre);
        }
    }
    
}
