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
public class IngresoNombre {

    public static void main(String[] args) {
        String alumnos[][], semestre;
        int filas, columna;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos registros desea ingresar a la matriz");
        filas = sc.nextInt();

        alumnos = new String[filas][3];
        System.out.println("Ingrese los datos de los estudiantes: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                alumnos[i][j] = sc.next();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(alumnos[i][j] + " ");
            }System.out.println(" ");
        }        
        //Buscar estudiantes de un semestre
        System.out.println("Ingrese semestre a buscar: ");
        semestre = sc.next();
        semestre = semestre.toLowerCase();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                if (alumnos[i][2].toLowerCase().equals(semestre)) {
                    System.out.print(alumnos[i][j] + " ");

                }
            }
        }
    }
}
