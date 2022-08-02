/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ingreso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class IngresoValores {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        String cadena = null;
        double num3 = 0.0, num4 = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero entero 1: ");
        try {
            num1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un valor entero");
            sc.nextLine();
        } 

        System.out.println("Ingrese un numero entero 2: ");

        try {
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un valor entero");
            sc.nextLine();
        } 
        System.out.println("Ingrese una palabra: ");
        try {
            cadena = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es una cadena de caractéres");
            sc.nextLine();
        } 
        System.out.println("Ingrese un numero decimal 1: ");

        try {
            num3 = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es valor decimal");
            sc.nextLine();
        }
        
        System.out.println("Ingrese un numero decimal 2: ");

        try {
            num4 = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es valor decimal");
            sc.nextLine();
        } 

        System.out.println("Número entero 1: " + num1
                + "\n Número entero 2: " + num2
                + "\n Cadena de texto: " + cadena
                + "\n Número decimal 1: " + num3
                + "\n Número decimal 2: " + num4);

    }

}
