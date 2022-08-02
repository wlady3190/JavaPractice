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
public class Raton  extends DIspositivosEntrada{
    private int idContador; 
    private static int contadorRatones;



    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idContador = ++contadorRatones;
    }

    public int getIdContador() {
        return idContador;
    }

    public void setIdContador(int idContador) {
        this.idContador = idContador;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Raton.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return "\nRaton{" + "idContador=" + idContador + '}' + super.toString();
    }




    
    
}
