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
public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;

    private static int contadorComp;

    private Computadora() {
        this.idComputadora = ++contadorComp;

    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    //No se podrá modificar el id del computador
//    public void setIdComputadora(int idComputadora) {
//        this.idComputadora = idComputadora;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComp() {
        return contadorComp;
    }

    public static void setContadorComp(int contadorComp) {
        Computadora.contadorComp = contadorComp;
    }
    

    @Override
    public String toString() {
        return "\nComputadora{" + "idComputadora=" + idComputadora + ", Nombre= " + nombre + ", monitor= " + monitor + ", teclado= " + teclado + ", raton=" + raton + '}';
    }

}
