/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.edades;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        int edadMin, edadMax, edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        try {
            System.out.println("1. Definir edad mínima");
            edadMin = sc.nextInt();
            System.out.println("2. Definir edad máxima");
            edadMax = sc.nextInt();
            System.out.println("Ingrese una edad");
            edad = sc.nextInt();
            verificarEdad(edad, edadMax, edadMin);
        } catch (ControlaEdad e) {
            System.out.println("Edad fuera de rango");
            e.printStackTrace();
        }

    }

    public static void verificarEdad(int edad, int edadMax, int edadMin) throws ControlaEdad {
        if (edad > edadMax) {
            throw new ControlaEdad("La edad ingresada supera la máxima");
        } else if (edad < edadMin) {
            throw new ControlaEdad("La edad ingresada no alcanza la mínima");
        } else {
            System.out.println("**CUMPLE**");
        }
    }

}
