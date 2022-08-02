/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio19;

/**
 *
 * @author Wladimir Tierra
 */
public class Impares {
    public static void main(String[] args) {
        int suma=0;
        System.out.println("");
        
        System.out.println("");
        for (int i = 1; i < 100; i=i+2) {
            suma +=i;
           
        }
        
        System.out.println("La suma de los números impares es: " + suma);
    }
    
}
