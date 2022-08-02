/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Dias {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para identificar el dia de la semana");
        num = sc.nextInt();
        
        switch(num){
            case 1->{
                System.out.println("Lunes");
                
            }
            case 2->{
                System.out.println("Martes");
            }
            case 3->{
                System.out.println("Miércoles");
            } 
            case 4->{
                System.out.println("Jueves");
            }
            case 5->{
                System.out.println("Viernes");
            }
            case 6->{
                System.out.println("Sábado");
            }
            case 7->{
                System.out.println("Domingo");
            }
            default->{
                System.out.println("Opción incorrecta");
            }
        }
        
    }
    
}
