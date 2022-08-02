/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejecutable;

import com.desarrollo.factorial.Factorial;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Test {

    public static void main(String[] args) {
        int num, array[];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        array = new int[num];

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[j] = i++;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("");
        System.out.println("**CÁLCULO DEL FACTORIAL**\n");

        System.out.println(Factorial.calculoFactorial(array, num));

    }

}
