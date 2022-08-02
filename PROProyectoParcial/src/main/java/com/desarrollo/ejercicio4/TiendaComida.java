/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class TiendaComida {

    public static void main(String[] args) {
        double precio, descuento;
        char membresia;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese su membresía (A, B, C)");
        membresia = sc.next().charAt(0);
        membresia = Character.toUpperCase(membresia);
        if (membresia =='A'||membresia =='B'||membresia =='C'){
               System.out.println("Ingrese el valor de su compra:");
        precio = sc.nextDouble();
        switch (membresia) {
            case 'A' -> {
                descuento = 0.1;
                TiendaComida.descuento(descuento, precio);

            }
            case 'B' -> {
                descuento = 0.08;
                TiendaComida.descuento(descuento, precio);
            }
            case 'C' -> {
                descuento = 0.06;
                TiendaComida.descuento(descuento, precio);
            }
            default ->{
                System.out.println("opción inválida");
            }
                
        }
        
        } else{
            System.out.println("No existe esa categoría");
        }
     

    }

    public static void descuento(double descuento, double precio) {
        double precioDescuento;
        precioDescuento = precio/(1+descuento);
        System.out.println("Su descuento es de " + descuento*100+"%");
        System.out.println("El valor de su compra es: " + precio);
        System.out.println("Su precio con descuento es: " + precioDescuento);

    }

}
