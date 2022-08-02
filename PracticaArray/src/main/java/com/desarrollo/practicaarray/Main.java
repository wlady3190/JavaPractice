/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.practicaarray;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {
    public static void main(String[] args) {
        int arreglo[], elementos;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos elementos tiene el arreglo: ");
        elementos = sc.nextInt();
        arreglo = new int[elementos];
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < elementos; i++) {   
            arreglo[i] = sc.nextInt();          
        }      
        Calculo calculo = new Calculo(arreglo);        
        calculo.calculoArreglo(arreglo);
        System.out.println(calculo.toString());    
    }   
}
