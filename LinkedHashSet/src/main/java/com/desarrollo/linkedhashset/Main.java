/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {
    public static void main(String[] args) {
        String nombre, apellido, decision;
        int edad, opcion;
        LinkedHashSet<Alumno> listaEstudiante = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**INGRESO DE ESTUDIANTES**");
                        System.out.println("Ingrese el nombre: ");
                        nombre = sc.next();
                        System.out.println("Ingrese el apellido");
                        apellido = sc.next();
                        System.out.println("Ingrese la edad");
                        edad = sc.nextInt();
                        Alumno alumno = new Alumno(nombre, apellido, edad);
                        listaEstudiante.add(alumno);
                        System.out.println("¿Desea ingresar otro estudiante?");
                        decision = sc.next();

                    } while (!decision.equalsIgnoreCase("no"));

                    break;
                case 2:
                    for (Alumno est : listaEstudiante) {
                        System.out.println(est.toString());
                    }
                    break;
            }

        } while (opcion != 3);

    }
    
}
