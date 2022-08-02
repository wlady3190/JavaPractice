
package com.desarrollo.estructuradatos;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {
    public static void main(String[] args) {
        int arreglo[], elementos = 0;
        Scanner entrada = new Scanner(System.in);
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos tiene el arreglo:? "));
        arreglo = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.println("Digite un dato al arreglo: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i < (arreglo.length - 1); i++) {
            int menor = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[menor];
                arreglo[menor] = aux;
            }
        }
        System.out.println("Arreglo " + Arrays.toString(arreglo));
        System.out.println("ARREGLO ORDENADO");
        for (int i = 0; i < elementos; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
