/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ParImpar {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Determinar si tu numero es par o impar");
        System.out.println("Ingresa un número: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        
    }
    
}
