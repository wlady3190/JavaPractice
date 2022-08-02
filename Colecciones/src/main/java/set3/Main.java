/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        String nombre, categoria, opcionMenu;
        int opcion, codigo;
        Scanner sc = new Scanner(System.in);
        Set<Producto> productoLista = new HashSet<>();
        do {
            System.out.println("");
            System.out.println("**INGRESO E IMPRESIÓN DE RESULTADOS**");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. ver lista de producto");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("INGRESO DE PRODUCTOS AL SISTEMA");
                        System.out.println("Ingrese el nombre del producto: ");
                        nombre = sc.next();
                        System.out.println("Ingrese la categoría: ");
                        categoria = sc.next();
                        System.out.println("Ingrese el codigo: ");
                        codigo = sc.nextInt();
                        Producto producto = new Producto(nombre, categoria, codigo);
                        productoLista.add(producto);
                        System.out.println("¿Desea ingresar otro producto(S/N)?");
                        opcionMenu = sc.next();
                    } while (!opcionMenu.equalsIgnoreCase("N"));
                    break;
                case 2:
                    for (Producto productos : productoLista) {
                        System.out.println(productos.toString());
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar el software");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 3);

    }

}
