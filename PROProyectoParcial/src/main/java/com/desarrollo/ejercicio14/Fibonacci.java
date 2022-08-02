/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num, arr[], aux=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Serie de Fibonacci");
        System.out.println("Cuántos elementos desea de la serie?");
        num = sc.nextInt();

        arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i =2; i < num; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        
        System.out.println(Arrays.toString(arr));

    }

}
