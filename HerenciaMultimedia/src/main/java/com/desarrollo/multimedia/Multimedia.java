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
public class Multimedia {
    private String tittle, author, format;
    private double price, duration;

    public Multimedia() {
    }

    public Multimedia(String tittle, String author, String format, double price, double duration) {
        this.tittle = tittle;
        this.author = author;
        this.format = format;
        this.price = price;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    

    @Override
    public String toString() {
        return "Multimedia{" + "tittle=" + tittle + ", author=" + author + ", format=" 
                + format + ", price=" + price + ", duration=" + duration + '}';
    }
    
    


    
    
}
