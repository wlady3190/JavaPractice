/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio25;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class EdadImprimir {
    public static void main(String[] args) {
        int edad=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("Ingrese su edad");
        try{
            edad = sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Su edad debe ser entera");
        }
        
        if(edad>0){
            for (int i = 0; i <= edad; i++) {
                System.out.println(i);
            }
        }else{
            System.out.println("Ingrese una edad positiva");
        }
    }
    
}
