/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.excepcionPropia;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        try {
            dividir(num1, num2);
        } catch (DividirUno e) {
            System.out.println("Datos ingresados incorrectos");
            e.printStackTrace();

        }
        multiplicar(num1, num2);

    }

    public static void dividir(double num1, double num2) throws DividirUno {
        if (num2 == 1) {
            throw new DividirUno("Divisor no puede ser 1");
        } else {
            System.out.println("El resultado es: " + (num1 / num2));
        }
    }

    public static void multiplicar(double num1, double num2) {
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
    }

}
