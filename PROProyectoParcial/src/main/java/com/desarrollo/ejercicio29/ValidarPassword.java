/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio29;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ValidarPassword {
    public static void main(String[] args) {
        String pass1, pass2;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Validación de contraseña");
        System.out.println("Ingrese una contraseña");
        pass1 = sc.next();
        System.out.println("Ingrese nuevamente la contraseña");
        pass2 = sc.next();
        
        if(pass1.equals(pass2)){
            System.out.println("Las contraseña coinciden");
        } else{
            System.out.println("Las contraseñas NO concuerdan");
        }
        
    }
    
}
