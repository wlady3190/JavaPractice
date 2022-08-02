/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.matriztienda;

/**
 *
 * @author Wladimir Tierra
 */
public class Operaciones {

    String arreglo[][]; 
    int fila, columna;

    public Operaciones(String[][] arreglo, int fila, int columna) {
        this.arreglo = arreglo;
        this.fila = fila;
        this.columna = columna;
    }

    public void mostrarPosicion(String arreglo[][], int fila, int columna) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i][j].equals(arreglo[fila][columna])) {
                    System.out.println(arreglo[fila][columna]);
                } 
            }
        }

    }

    public void imprimirResultados(String arreglo[][]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
