/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parqueadero.banco;

import javax.management.RuntimeErrorException;

/**
 *
 * @author Wladimir Tierra
 */
public class Cuenta {

    double saldo;

    public Cuenta() {

    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws RuntimeException {
        if (cantidad > saldo) {
            throw new RuntimeException("La cantidad excede");
        }
        saldo = saldo - cantidad;

    }

    public void imprimirSaldo() {
        System.out.println("El saldo es: " + saldo);
    }

}
