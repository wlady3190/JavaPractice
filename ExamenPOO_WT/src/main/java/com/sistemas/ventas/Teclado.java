/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.ventas;

/**
 *
 * @author Wladimir Tierra
 */
public class Teclado extends DIspositivosEntrada {

    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    public static void setContadorTeclado(int contadorTeclado) {
        Teclado.contadorTeclado = contadorTeclado;
    }

    @Override
    public String toString() {
        return "\nTeclado{" + "idTeclado=" + idTeclado + '}' + super.toString();
    }

}
