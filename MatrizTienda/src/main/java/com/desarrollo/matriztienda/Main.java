/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.matriztienda;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        int dimension = 0, opcion, fila=0, columna=0;
        String arreglo[][] = null;
        double precios[][] = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**MENU DE OPERACIONES**");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Consultar posición: ");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            Operaciones operacion = new Operaciones(arreglo, fila, columna);

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la dimensión de la matriz n x n");
                    dimension = sc.nextInt();
                    arreglo = new String[dimension][dimension];
                    System.out.println("Ingrese los productos a la matriz 1");
                    for (int i = 0; i < dimension; i++) {
                        for (int j = 0; j < dimension; j++) {
                            arreglo[i][j] = sc.next();
                        }
                    }
                    precios = new double[dimension][dimension];
                    System.out.println("Ingrese los precios a la matriz 2");
                    for (int i = 0; i < dimension; i++) {
                        for (int j = 0; j < dimension; j++) {
                            precios[i][j] = sc.nextDouble();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la fila a consultar");
                    fila = sc.nextInt();
                    System.out.println("Ingrese la columa a consultar: ");
                    columna = sc.nextInt();                   
                    operacion.mostrarPosicion(arreglo, fila, columna);
                    break;
                case 3:
                    operacion.imprimirResultados(arreglo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
        } while (opcion != 4);

    }
}
