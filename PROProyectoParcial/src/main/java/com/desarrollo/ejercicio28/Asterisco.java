/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio28;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Asterisco {

    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese un número");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("x");

            }
            System.out.println(" ");
        }

    }

}
