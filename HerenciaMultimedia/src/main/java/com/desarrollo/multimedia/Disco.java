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
public class Disco extends Multimedia{
    private int capacity, quantity;
    public static int quantityCount;

    public Disco(String tittle, String author, String format, double price, double duration, int capacity) {
        super(tittle, author, format, price, duration);
        this.capacity = capacity;
        this.quantity = ++quantityCount;
        
    }
    public Disco() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getQuantityCount() {
        return quantityCount;
    }

//    public static void setQuantityCount(int quantityCount) {
//        Disco.quantityCount = quantityCount;
//    }
    
    public void contarDiscos(){
        if (getQuantity()>=2){
            
            quantityCount =0;
            System.out.println("ha ganado un disco gratis");
        }
    }

    @Override
    public String toString() {
        return "Disco{" + "capacity=" + capacity + ", quantity=" + quantity + '}'+super.toString();
    }



    
    
    
    
    
}
