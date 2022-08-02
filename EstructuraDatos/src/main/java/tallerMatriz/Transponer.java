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
public class Transponer {
    public static void main(String[] args) {
          int matriz[][], matrizT[][];
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese los elementos");
          matriz = new int[3][3];
          for (int i=0; i<3; i++){
              for (int j=0; j<3; j++){
                  
                  matriz[i][j] = sc.nextInt();
                  
              }
          }
 System.out.println("Mostrar datos de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+ " ");
            }
            System.out.println(" ");
        }
          
}
}
