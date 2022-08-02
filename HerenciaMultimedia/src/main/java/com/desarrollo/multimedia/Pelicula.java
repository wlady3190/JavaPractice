/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.multimedia;

/**
 *
 * @author Wladimir Tierra
 */
public class Pelicula extends Multimedia{
    String actor;

    public Pelicula() {
    }

    public Pelicula(String tittle, String author, String format, double price, double duration, String actor) {
        super(tittle, author, format, price, duration);
        this.actor = actor;
        
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
    
    public void calcularDescuento(){
        double priceDiscount;
        priceDiscount = super.getPrice() / 1.08;
        System.out.println("El precio del disco con descuento es: " + String.format("%.2f", priceDiscount));
  
    }

    @Override
    public String toString() {
        return super.toString()+"Pelicula{" + "actor/actriz principal =" + actor + '}';
    }

}
