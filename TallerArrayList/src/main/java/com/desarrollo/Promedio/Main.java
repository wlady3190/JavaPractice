/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.Promedio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        double num = 0, promedio, acumulador = 0;
        String decision;
        int opcion;
        Datos datos = null;
        ArrayList<Datos> datosLista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("Cálculo de promedio");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostra datos");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Tamaño de la lista");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**Ingreso de datos**");
                        System.out.println("Ingrese un valor");
                        num = sc.nextDouble();
                        datos = new Datos(num);
                        System.out.println("¿Desea ingresar otro valor (s/n)?");
                        decision = sc.next();
                        datosLista.add(datos);
                    } while (!decision.equalsIgnoreCase("n"));
                    break;
                case 2:
                    for (Datos lista : datosLista) {
                        System.out.println(lista);
                    }
                    break;
                case 3:
                    for (Datos lista : datosLista) {
                        acumulador = acumulador + lista.num;
                    }
                    promedio = acumulador / datosLista.size();
                    System.out.println("");
                    System.out.println("**CÁLCULO DEL PROMEDIO**");
                    System.out.println("El promedio es: " + promedio);

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("**CANTIDAD ELEMENTOS INGRESADOS**");
                    System.out.println("La cantidad de elementos es: " + datosLista.size());

                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
        } while (opcion != 5);

    }

}
