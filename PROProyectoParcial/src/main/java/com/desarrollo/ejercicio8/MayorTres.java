/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class MayorTres {

    public static void main(String[] args) {

        int num, max = 0, min = 0, arr[], elementos = 3;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        arr = new int[elementos];
        
        for (int i = 0; i < elementos; i++) {
            System.out.println("Intrese un elemento");
            num = sc.nextInt();
            arr[i] = num;
        }
 
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < elementos; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                min = arr[i];
            }
        }

        System.out.println("El máximo es: " + max + "\nEl mínimo es: " + min);

    }

}
