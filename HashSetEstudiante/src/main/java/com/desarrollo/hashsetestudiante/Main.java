/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.hashsetestudiante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        int opcion, opcionEst, numeroEstudiante, eliminar, contador = 5;
        String nombre, carrera, cicloAcademico, regresar;
        Scanner sc = new Scanner(System.in);
        Set<Estudiante> estudianteLista = new HashSet<>();
        Estudiante estudiante1 = new Estudiante("Wladimir", "Sistemas", "Segundo");

        Estudiante estudiante2 = new Estudiante("Pepe", "Redes", "Tercero");
        Estudiante estudiante3 = new Estudiante("Marco", "Programación", "Quinto");
        Estudiante estudiante4 = new Estudiante("Luis", "Estadística", "Segundo");
        Estudiante estudiante5 = new Estudiante("Carina", "Matemática", "Primero");

        estudianteLista.add(estudiante1);
        estudianteLista.add(estudiante2);
        estudianteLista.add(estudiante3);
        estudianteLista.add(estudiante4);
        estudianteLista.add(estudiante5);

        do {
            System.out.println("");
            System.out.println("**SISTEMA DE GESTIÓN ESTUDIANTIL**");
            System.out.println("1. Mostrar estudiantes");
            System.out.println("2. Eliminar estudiantes");
            System.out.println("3. Mostrar la lista actual de estudiante");
            System.out.println("4. Mostrar la cantidad de estudiantes");
            System.out.println("5. SALIR");
            System.out.println("SELECCIONE UNA OPCIÓN");
            System.out.println("");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("**LISTA DE ESTUDIANTES EN EL SISTEMA**");

                    for (Estudiante lista : estudianteLista) {
                        System.out.println(lista.toString());
                    }
                    break;
                case 2:

                    System.out.println("");
                    System.out.println("Ingrese el número de estudiante que desea eliminar: ");
                    eliminar = sc.nextInt();
                    if (eliminar == 1) {
                        estudianteLista.remove(estudiante1);
                    } else if (eliminar == 2) {
                        estudianteLista.remove(estudiante2);
                    } else if (eliminar == 3) {
                        estudianteLista.remove(estudiante3);
                    } else if (eliminar == 4) {
                        estudianteLista.remove(estudiante4);
                    } else if (eliminar == 5) {
                        estudianteLista.remove(estudiante5);
                    }
                    contador = contador - 1;

                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Mostrar lista actualizada");
                    for (Estudiante listaActual : estudianteLista) {
                        System.out.println(listaActual.toString());
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Mostrar cantidad de estudiantes");
                    System.out.println("LOs estudiantes actuales son: " + contador);

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 5);

    }

}
