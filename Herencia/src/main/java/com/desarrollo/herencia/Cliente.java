/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.herencia;

/**
 *
 * @author Wladimir Tierra
 */
public class Cliente extends Persona{
    //atributos propios
    private int idCiente;
    private String vip;
    
    //atributo estático
    private static int contCliente;

    public Cliente(String name, char genre, int age, String address, String vip) {
        super(name, genre, age,  address);
        this.idCiente = ++contCliente;
        this.vip = vip;
    }

    public int getIdCiente() {
        return idCiente;
    }

    public void setIdCiente(int idCiente) {
        this.idCiente = idCiente;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public static int getContCliente() {
        return contCliente;
    }

    public static void setContCliente(int contCliente) {
        Cliente.contCliente = contCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCiente=" + idCiente + super.toString() + ", vip=" + vip + '}';
    }
    
    
    
    
    
    
    
}
