/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Multiplicar {

    public static void main(String[] args) {
        int num, limite;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("TABLA DE MULTIPLICAR DE UN NÚMERO");
        System.out.println("¿Qué número desea ver la tabla de multiplicar?");
        num = sc.nextInt();
        System.out.println("¿Hasta que número desea ver?");
        limite = sc.nextInt();

        for (int i = 0; i <= limite; i++) {

            System.out.println(i + " x " + num + " = " + (i * num));

        }

    }

}
