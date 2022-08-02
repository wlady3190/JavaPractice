/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Vocal {
    public static void main(String[] args) {
        char letra;
     
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Es o no una vocal?");
        System.out.println("Ingrese una letra");
        letra = sc.next().charAt(0);
        if(letra =='a'||letra =='e'||letra=='i'||letra =='o'||letra =='u'){
            System.out.println("Es una vocal");   
        }else{
            System.out.println("No es una vocal");
        }
  
        
        
    }
    
}
