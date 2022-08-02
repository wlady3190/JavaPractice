/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, opcion;
        double precio, total, acumuladorTotal = 0, descuento;
        char decision;
        do {
            System.out.println("");
            System.out.println("TIENDA DE GAFAS DE SOL");
            System.out.println("1. Ingresar datos de compra");
            System.out.println("2. Pagar factura");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("Ingrese la cantidad de gafas: ");
                        cantidad = sc.nextInt();
                        System.out.println("Ingrese el precio: ");
                        precio = sc.nextDouble();
                        System.out.println("¿Desea ingresar otro pedido?");
                        decision = sc.next().charAt(0);
                        total = cantidad * precio;
                        acumuladorTotal += total;

                        decision = Character.toLowerCase(decision);

                    } while (decision == 's');
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("Pagar factura");
                    if (acumuladorTotal >= 85) {
                        descuento = acumuladorTotal / 1.1;
                        System.out.println("");
                        System.out.println("Su descuento es el 10 %");
                        System.out.println("Valor a pagar:" + acumuladorTotal);
                        System.out.println("Valor con descuento: " + descuento);
                    } else if (acumuladorTotal >= 100) {
                        descuento = acumuladorTotal / 1.15;
                        System.out.println("");
                        System.out.println("Su descuento es el 15 %");
                        System.out.println("Valor a pagar:" + acumuladorTotal);
                        System.out.println("Valor con descuento: " + descuento);
                    } else if (acumuladorTotal >= 115) {
                        descuento = acumuladorTotal / 1.2;
                        System.out.println("");
                        System.out.println("Su descuento es el 20 %");
                        System.out.println("Valor a pagar:" + acumuladorTotal);
                        System.out.println("Valor con descuento: " + descuento);
                    } else {
                        System.out.println("");
                        System.out.println("Su descuento es el 0 %");
                        System.out.println("Valor a pagar:" + acumuladorTotal);
                    }

                }
            }
        } while (opcion!= 3);

    }

}
