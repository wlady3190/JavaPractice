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
public class Matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int matriz[][], contador =0;
        double promedio, suma=0;
        matriz = new int[4][3];   
        System.out.println("Ingrese los datos a la matriz");       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("OPERACIONES");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
                contador++;
            }
        }
        promedio = suma/contador;       
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);    
    }  
}
