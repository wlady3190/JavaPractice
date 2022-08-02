/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.test;

import com.sistemas.ventas.*;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Tecnomega {

    public static void main(String[] args) {

        Orden orden = new Orden();
        String marcaComputador, marcaMonitor, entradaDispositivo, marcaDispositivo;

        double tamanioMonitor, precio;
        int opcion;
        char decision;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("TIENDA TECNOMEGA");
            System.out.println("1. Ingresar datos de computador");
            System.out.println("2. Mostrar detalle y valor a cancelar");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("");
                        System.out.println("Marca del computador");
                        marcaComputador = sc.next();
                        System.out.println("\nMarca del monitor: ");
                        marcaMonitor = sc.next();
                        System.out.println("Tamaño del monitor en pulgadas");
                        tamanioMonitor = sc.nextDouble();
                        Monitor monitor = new Monitor(marcaMonitor, tamanioMonitor);
                        System.out.println("");
                        System.out.println("TECLADO");
                        System.out.println("Tipo de teclado: USB/PS2/Bluetooth/WiFi ");
                        entradaDispositivo = sc.next();
                        System.out.println("Ingrese la marca del teclado");
                        marcaDispositivo = sc.next();

                        Teclado teclado = new Teclado(entradaDispositivo, marcaDispositivo);

                        System.out.println("\nMOUSE");
                        System.out.println("Tipo de mouse: USB/PS2/Bluetooth/WiFi ");
                        entradaDispositivo = sc.next();
                        System.out.println("Ingrese la marca del teclado");
                        marcaDispositivo = sc.next();
                        Raton raton = new Raton(entradaDispositivo, marcaDispositivo);

                        System.out.println("\n**PRECIO DEL COMPUTADOR**");
                        System.out.println("Ingrese el precio del computador");
                        precio = sc.nextDouble();

                        Computadora computadora = new Computadora(marcaComputador, monitor, teclado, raton, precio);
                        orden.agregarComputador(computadora);

                        System.out.println("¿Desea agregar otro computador al carrito? (s/n)");
                        decision = sc.next().charAt(0);
                        decision = Character.toLowerCase(decision);
                        orden.calculaTotal();
                        orden.descuentoOrden();

                    } while (decision != 'n');

                }

                case 2 -> {
                    orden.imprimir();
                    orden.mostrarOrden();
                }

            }
        } while (opcion != 3);

    }

}
