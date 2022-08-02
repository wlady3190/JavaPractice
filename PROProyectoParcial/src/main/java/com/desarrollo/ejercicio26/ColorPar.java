/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ColorPar {
    public static void main(String[] args) {
        String color;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese su color favorito");
        color = sc.next();
        
        for (int i = 0; i <= color.length(); i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
