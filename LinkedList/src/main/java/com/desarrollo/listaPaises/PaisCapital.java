/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.listaPaises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class PaisCapital {

    public static void main(String[] args) {
        String pais, capital;
        int opcion;
        char decision;

        Scanner sc = new Scanner(System.in);
        LinkedList<String> listaPais = new LinkedList<>();

        LinkedList<String> listaCapital = new LinkedList<>();

        LinkedList<String> listaTotal = new LinkedList<>();

        do {

            System.out.println("");
            System.out.println("ALMACENAMIENTO DE PAISES Y CAPITALES");
            System.out.println("1. Ingresar países");
            System.out.println("2. Ingresar capitales");
            System.out.println("3. Imprimir lista");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("Ingreso de países");
                        pais = sc.next();

                        listaPais.add(pais);

                        System.out.println("¿Desea ingresar otro país  (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');

                    for (String paises : listaPais) {
                        System.out.println(paises);
                    }

                    break;
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("Ingreso de capitales");
                        capital = sc.next();
                        listaCapital.add(capital);
                        System.out.println("¿Desea ingresar otra capital  (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');
                    for (String capitales : listaCapital) {
                        System.out.println(capitales);
                    }

                    break;
                case 3:
                    System.out.println("");
                    System.out.println("LISTA INTERCALADA");
                    for (int i = 0; i < Math.max(listaCapital.size(), listaPais.size()); i++) {
                        if (i < listaPais.size()) {
                            listaTotal.add(listaPais.get(i));
                        }
                        if (i < listaCapital.size()) {
                            listaTotal.add(listaCapital.get(i));
                        }
                    }
                    for (String alternar : listaTotal) {
                        System.out.println(alternar);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
        } while (opcion != 4);

    }

}
