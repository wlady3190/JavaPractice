/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio20;

/**
 *
 * @author Wladimir Tierra
 */
public class Multiplos7 {
    public static void main(String[] args) {
        int suma=0;
        System.out.println("");
        System.out.println("Suma de multiplos de 7");
        
        for (int i = 0; i < 100; i=i+7){
            suma+=i;
            System.out.println(i);
        }
        System.out.println("La suma de los multiplos de 7 es: " + suma);
    }
    
}
