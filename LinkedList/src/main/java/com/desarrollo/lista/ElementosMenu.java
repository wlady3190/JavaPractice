/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.lista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ElementosMenu {

    public static void main(String[] args) {
        String elemento, comparacion;
        int opcion, eliminar, posicion;
        char decision;

        LinkedList<String> lista = new LinkedList<>();
        Iterator<String> it = lista.iterator();
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingresar elementos a la lista");
            System.out.println("2. Insertar elementos al inicio ");
            System.out.println("3. Insertar elementos al final de la lista");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Eliminar elemento inicial de la lista");
            System.out.println("6. Eliminar elemento final de la lista");
            System.out.println("7. Eliminar por selección");
            System.out.println("8. Buscar elemento (si existe)");
            System.out.println("9. Insertar por posicion");
            System.out.println("10 Salir");
            System.out.println("Seleccione una opcion: ");
            System.out.println("----------------------------------------------");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**INGRESO DE DATOS**");
                        System.out.println("Ingrese un elemento a la lista");
                        elemento = sc.next();
                        lista.add(elemento);
                        System.out.println("¿Desea agregar otro elemento (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');

                    break;
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("**INGRESO DE DATOS**");
                        System.out.println("Indique el elemento a insertar al inicio de la lista");
                        elemento = sc.next();
                        lista.addFirst(elemento);
                        System.out.println("Desea ingresar otro elemento (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');
                    break;
                case 3:
                    do {
                        System.out.println("");
                        System.out.println("Indique el elemento a insertar al final de la lista");
                        elemento = sc.next();
                        lista.add(elemento);
                        System.out.println("Desea ingresar otro elemento (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                    } while (decision != 'n');
                    break;
                case 4:
                    for (String imprimir : lista) {
                        System.out.println(imprimir);
                    }

                    break;
                case 5:

                    if (it.hasNext()) {
                        do {
                            System.out.println("");
                            lista.removeFirst();
                            System.out.println("¡Usted ha eliminado el primer elemento de la lista!");
                            System.out.println("Desea eliminar otro elemento (s/n)?");
                            decision = sc.next().charAt(0);
                            decision = Character.toLowerCase(decision);
                        } while (decision != 'n');
                    } else {
                        System.out.println("No existen elementos en la lista");
                    }

                    break;
                case 6:
                    if (it.hasNext()) {
                        do {
                            System.out.println("");
                            lista.removeLast();
                            System.out.println("¡Usted ha eliminado el último elemento de la lista!");
                            System.out.println("Desea eliminar otro elemento (s/n)?");
                            decision = sc.next().charAt(0);
                            decision = Character.toLowerCase(decision);
                        } while (decision != 'n');
                    } else {
                        System.out.println("");
                        System.out.println("**Ingrese elementos en la lista**");
                    }

                    break;
                case 7:
                    if (it.hasNext()) {
                        do {
                            System.out.println("Eliminar elementos");
                            System.out.println("Escriba la posición del elemento que desea eliminar ");
                            eliminar = sc.nextInt();
                            lista.remove(eliminar);
                            System.out.println("Desea eliminar otro elemento (s/n)?");
                            decision = sc.next().charAt(0);
                            decision = Character.toLowerCase(decision);

                        } while (decision != 'n');
                    } else {
                        System.out.println("");
                        System.out.println("**Ingrese elementos en la lista**");
                    }
                    break;
                case 8:

                    System.out.println("Búsqueda de elementos");
                    System.out.println("Escriba el elemento que desea verificar");
                    comparacion = sc.next();

                    posicion = lista.indexOf(comparacion);

                    if (posicion >= 0) {
                        System.out.println("El elemento se encuentra en la posicion: " + posicion);
                    } else {
                        System.out.println("No existe el elemento en la lista");
                    }

                    break;
                case 9:
                    do {
                        System.out.println("Agregar elementos por posición");
                        System.out.println("Escriba el elemento a añadir");
                        elemento = sc.next();
                        System.out.println("Escriba la posición donde desea agregar el elemento");
                        posicion = sc.nextInt();
                        lista.add(posicion, elemento);
                        System.out.println("Desea agregar otro elemento (s/n)?");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);

                    } while (decision != 'n');

                    break;
                case 10:
                    System.out.println("Gracias por usar el sistema -WT-");
                    break;
                default:
                    System.out.println("Opción incorrecta ");

            }
        } while (opcion != 10);

    }
}
