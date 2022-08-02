/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.poovectores;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Main {

    public static void main(String[] args) {
        //Definir vector
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        Persona[] vector = new Persona[4];
        //almacenar información
        for (int i = 0; i < vector.length; i++) {
            System.out.println("");
            System.out.println("INFORMACIÓN PERSONA");
            System.out.println("Nombre: ");
            nombre = sc.next();
            System.out.println("Edad: ");
            edad = sc.nextInt();
            //Persona persona = new Persona(nombre, edad);
            //Almacenar objeto;
            //vector[i] = persona;
            
            vector [i] = new Persona(nombre, edad);
                    
        }        
        System.out.println("LISTA PERSONAS");
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        

    }

}
