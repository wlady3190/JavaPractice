/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.estructuradatos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wladimir Tierra
 */
public class MetodoShell {

    public static void main(String[] args) {
        int arreglo[], aux, elementos, salto, k;
        Scanner sc = new Scanner(System.in);

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos tiene el arreglo:? "));
        arreglo = new int[elementos];

        for (int i = 0; i < elementos; i++) {
            System.out.println("Ingrese un dato del array");
            arreglo[i] = sc.nextInt();
        }
        salto = arreglo.length / 2;

        while (salto > 0) {
            for (int i = salto; i < arreglo.length; i++) {
                int j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;
                    } else {
                        aux = arreglo[j]; 
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j = j - salto;
                    }
                }
            }
            salto = salto / 2;

        }

        System.out.println("ARREGLO ORDENADO");
        for (int i = 0; i < elementos; i++) {
            System.out.println(arreglo[i]);
        }

    }
}
