/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parqueadero.proexcepciones;

import java.util.Scanner;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Wladimir Tierra
 */
public class Excepcion4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String mail;
        System.out.println("Ingrese un correo");
        mail = sc.next();
        try {
            comprobarMail(mail);
        } catch (LongitugMail e) {
            System.out.println("Correo ingresado incorrecto");
            e.printStackTrace();
        }

    }

    public static void comprobarMail(String mail) throws LongitugMail {
        int arroba = 0;
        boolean punto = false;
        //si hay @ aumenta a 1 y si hay punto cambia a true

        if (mail.length() <= 3) {
            throw new LongitugMail();
        }

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba++;
            } else if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            System.out.println("El correo ingresado es correcto");
        } else {
            System.out.println("Correo inválido");
        }

    }

}
