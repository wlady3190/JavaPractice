/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class PersonasFila {

    public static void main(String[] args) {
        int edad = 0, contEdad1 = 0, contEdad2 = 0, contEdad3 = 0, contEdad4 = 0;
        double precio1, precio2, precio3, acumEdad1 = 0, acumEdad2 = 0, acumEdad3 = 0, acumEdad4 = 0;
        Scanner sc = new Scanner(System.in);
        char decision;
        boolean correcto = true;
        do {
            do {
                try {

                    System.out.println("");
                    System.out.println("**SISTEMA DE COMPRA DE ENTRADAS**");
                    System.out.println("Ingrese la edad:");
                    edad = sc.nextInt();
                    correcto = true;
                    verificarEdad(edad);

                } catch (Edades e) {
                    System.out.println("Edad fuera de rango");
                    correcto = false;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese una edad válida");
                }
            } while (correcto == false);
            if (edad < 5) {
                contEdad1++;
                System.out.println("*INGRESO GRATIS*");

            } else if (edad >= 5 && edad <= 10) {
                precio1 = 2;
                acumEdad2 += precio1;
                contEdad2++;
                System.out.println("¡Dato ingresado!");
                System.out.println("Costo de la entrada: USD " + precio1);

            } else if (edad > 10 && edad <= 17) {
                precio2 = 2.8;
                acumEdad3 += precio2;
                contEdad3++;
                System.out.println("¡Dato ingresado!");
                System.out.println("Costo de la entrada: USD " + precio2);
            } else if (edad > 17) {
                precio3 = 3.8;
                acumEdad4 += precio3;
                contEdad4++;
                System.out.println("¡Dato ingresado!");
                System.out.println("Costo de la entrada: USD " + precio3);
            }
            System.out.println("\n¿Desea comprar otra entrada? (s/n)");
            decision = sc.next().charAt(0);
            decision = Character.toLowerCase(decision);
        } while (decision != 'n');

        System.out.println("");
        System.out.println("Total recaudado por edad: ");
        System.out.println("Entre 5 y 10 años: USD " + acumEdad2);
        System.out.println("Entre 11 y 17 años: USD " + acumEdad3);
        System.out.println("Mayores de 17 años: USD " + acumEdad4);
        System.out.println("El número total de personas en fila es: " + (contEdad1 + contEdad2 + contEdad3 + contEdad4));
        System.out.println("Niños que no pagaron entrada: " + contEdad1);

    }

    public static void verificarEdad(int edad) throws Edades {
        if (edad < 1 || edad > 60) {
            throw new Edades("**LA EDAD PERMITIDA ES DESDE 1 A 60 AÑOS**");
        }

    }

}
