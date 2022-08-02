/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        String nombre, decision, opcion;
        int edad, eliminar, opcionMenu;
        double salario;
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;

        ArrayList<Empleado> empleadoLista = new ArrayList<>();

        do {
            System.out.println("");

            System.out.println("**SISTEMA DE INGRESO DE EMPLEADOS**");
            System.out.println("1. Ingresar empleados");
            System.out.println("2. Eliminar datos ingresados");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**INGRESO DE DATOS**");
                        System.out.println("Ingrese el nombre: ");
                        nombre = sc.next();
                        System.out.println("Ingrese la edad: ");
                        edad = sc.nextInt();
                        System.out.println("Ingrese el salario en USD: ");
                        salario = sc.nextInt();
                        empleado = new Empleado(nombre, edad, salario);
                        empleadoLista.add(empleado);
                        empleadoLista.ensureCapacity(20);
                        System.out.println("");
                        System.out.println("¿Desea ingresar otro empleado S/N?");
                        opcion = sc.next();
                        

                    } while (!opcion.contains(("n")));
                    for (Empleado empleados : empleadoLista) {
                                System.out.println(empleados);

                            }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("**ELIMINAR DATOS**");

                    System.out.println("Ingrese el número de objeto que desea eliminar");
                    eliminar = sc.nextInt();

                    empleadoLista.remove(eliminar - 1);

                    break;
                case 3:
                    for (Empleado empleados : empleadoLista) {
                        System.out.println(empleados);

                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");

            }
        } while (opcionMenu != 4);

    }

}
