/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char signo;

        System.out.println("");
        System.out.println("**CALCULADORA**");
        System.out.println("Ingrese un operando (número)");
        num1 = sc.nextDouble();
        System.out.println("Ingrese un segundo operando");
        num2 = sc.nextDouble();
        System.out.println("Ingrese el signo de la operación que desea realizar(+ , - , * , /)");
        signo = sc.next().charAt(0);

        switch (signo) {
            case '+' -> {
                System.out.println("SUMA");
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);

            }
            case '-' -> {
                System.out.println("RESTA");
                resultado = num1 - num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);

            }
            case '*' -> {
                System.out.println("MULTIPLICACIÓN");
                resultado = num1 * num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);

            }
            case '/' -> {
                System.out.println("DIVISIÓN");
                resultado = num1 / num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);

            }

        }

    }

}
