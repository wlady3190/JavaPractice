/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Votacion {

    public static void main(String[] args) {
        char opcion;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Selecciona un candidato (A, B, C)");
        opcion = sc.next().charAt(0);
        opcion = Character.toLowerCase(opcion);

        switch (opcion) {
            case 'a' -> {
                System.out.println("Usted ha votado por el candidato A");
            }
            case 'b' -> {
                System.out.println("Usted ha votado por el candidato B");
            }
            case 'c' -> {
                System.out.println("Usted ha votado por el candidato C");
            }
            default -> {
                System.out.println("Opción inválida");
            }
        }

    }

}
