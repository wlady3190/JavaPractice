/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.recursividad;

/**
 *
 * @author Wladimir Tierra
 */
public class RecursividadNumero {

    public static void generarNumero(int num) {
        if (num <= 6) {
            System.out.println(num);

            num++;
            //llamando al metodo 
            generarNumero(num);
        }
    }

    public static int factorial(int num) {
        
        
        if (num == 0) {
            return 1;


        } else if (num<0){
            System.out.println("No existe factorial de números negativos");
                
        }
        return num*factorial(num-1);
        

    }

    //
}
