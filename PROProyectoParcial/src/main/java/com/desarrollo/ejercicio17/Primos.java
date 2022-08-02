/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Primos {

    public static void main(String[] args) {
        int num, contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Números primos a partir de un número dado");
        num = sc.nextInt();
        for (int i = 2; i < 10; i++) {
            if(primo(i)){
                System.out.println(i);
            }

        }

    }

    public static boolean primo(int num) {
        for (int i = 0; i < 10; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;

    }

}
