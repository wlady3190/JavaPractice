/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.empresa;

/**
 *
 * @author Wladimir Tierra
 */
public class Cliente  extends Persona{
    private  int idCliente;
    private String vip;
    private static int contador;

    private Cliente() {
    }
    

    public Cliente(String vip, String nombre, String apellido, String direccion, long celular) {
        super(nombre, apellido, direccion, celular);
        this.idCliente = ++contador;
        this.vip = vip;       
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }



    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    @Override
    public String toString() {
        return "Cliente{" + " idCliente= " + idCliente + " "+super.toString() +  ", vip=" + vip + '}';
    }

    

    
    
    
    
    
    
    
}
