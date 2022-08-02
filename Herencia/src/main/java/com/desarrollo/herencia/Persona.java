package com.desarrollo.herencia;

//Superclase - Clase padre: contiene comportamiento en común
public class Persona {
    //Atributos en común
    private String name;
    private char genre;
    private int age;
    private String address;   
    //Constructor vacío
    public Persona(){        
    }
    //Sobrecarga de constructores
    public Persona(String name){
        this();
        this.name = name;
        
    }
    
    //constructor 
    public Persona (String name, char genre, int age, String address ){       
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.address = address;         
    }
    //métodos get y set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //toString

    @Override
    public String toString() {
        return   ", Nombre =" + name + ", Género =" + genre + ", Edad =" + age + ", Dirección=" + address;
    }
    
    
    
    
    
    
}
