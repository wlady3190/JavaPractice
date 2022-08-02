/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parqueadero.proexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Excepciones3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        System.out.println("Menú de opciones");
        System.out.println("1. Ingresar datos");
        System.out.println("2. Salir");
        System.out.println("Seleccione una opción");
        op = sc.nextInt();
        if (op == 1) {
            try {
                ingresarDatos();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese datos correctos");
            }
        } else {
            System.out.println("Gracias por usar el sistema");
        }

    }

    public static void ingresarDatos() {
        String nombre;
        int edad;

        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese edad");
        edad = sc.nextInt();

        System.out.println(nombre + " en el año 2023 tendrá: " + edad + " años");
    }

}
