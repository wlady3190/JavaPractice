/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.test;

import com.desarrollo.ventas.Orden;
import com.desarrollo.ventas.Producto;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Ventas {
    public static void main(String[] args) {
        String nombre;
        double precio;
        char resp;
        Scanner sc = new Scanner(System.in);
        
        //Instanciar clase
        Orden orden = new Orden();
        System.out.println("");
        System.out.println("**TECNOMEGA**");
        
        do{
            System.out.println("");
               System.out.println("INFORMACIÓN PRODUCTO");
               System.out.println("Nombre:  ");
               nombre = sc.next();
               System.out.println("Precio: ");
               precio = sc.nextDouble();
               
               //crear producto
               Producto producto = new Producto(nombre, precio);
               orden.agregarProductoColeccion(producto);
               orden.agregarProductoVector(producto);

            System.out.println("Desea ingresar otro producto (s/n)?");
            resp = sc.next().charAt(0);
        } while(resp =='s');
        
        orden.mostrarOrdenColeccion();
        orden.mostrarOrdenVector();
    }
    
}
