/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerMatriz;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class SumaMatriz {

    public static void main(String[] args) {

        int matriz1[][], matriz2[][], matrizResultado[][] = null, filas, columnas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Número de fila de la matriz: ");
        filas = sc.nextInt();
        System.out.println("Número de columnas de la matriz: ");
        columnas = sc.nextInt();

        matriz1 = new int[filas][columnas];
        System.out.println("Ingrese los datos de la primera matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }
        matriz2 = new int[filas][columnas];
        System.out.println("Ingrese los datos de la segunda matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Suma de matrices");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
