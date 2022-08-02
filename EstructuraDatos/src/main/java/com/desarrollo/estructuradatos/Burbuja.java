package com.desarrollo.estructuradatos;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Burbuja {

    public static void main(String[] args) {
        int arreglo[], elementos = 0, aux;
        Scanner entrada = new Scanner(System.in);
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos tiene el arreglo:? "));
        arreglo = new int[elementos];
        //Ingresa datos al arreglo
        for (int i = 0; i < elementos; i++) {
            System.out.println("Digite un dato al arreglo: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i < (elementos - 1); i++) {
            for (int j = 0; j < (elementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("ARREGLO ORDENADO");
        for (int i = 0; i < elementos; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
