/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parqueadero.proexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class Excepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado, a, b;

        try {
            System.out.println("Ingrese dos números");
            a = sc.nextInt();
            b = sc.nextInt();

            resultado = a / b;
            System.out.println("EL resultado de la división es: " + resultado);
        } catch (InputMismatchException ex) {
            System.out.println("Datos ingresados no válidos");
            
        } 
        catch(ArithmeticException e){
            System.out.println("Datos ingresados no válidos");
        }
        finally {
            System.out.println("Gracias por usar el sistema");
        }

    }

}
