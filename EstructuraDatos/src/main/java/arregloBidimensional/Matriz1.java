/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloBidimensional;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Matriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], filas, columnas;
        System.out.println("Ingrese el número de filas: ");
        filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        columnas = sc.nextInt();

        matriz = new int[filas][columnas];
        //Ingreso de datos de la matriz
        System.out.println("Ingrese los datos a la matriz");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mostrar datos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
