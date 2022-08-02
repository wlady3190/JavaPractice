/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.paquete1;

/**
 *
 * @author Wladimir Tierra
 */
public class Clase1 {

    public String atributoPublico = "Dato público";
    protected String atributoProtegido = "Dato protegido";
    String atributoDefault = "Dato default";
    private String atributoPrivado = "Dato privado";

    public Clase1(char caracter) {
        System.out.println("Constructor público: " + caracter);
    }

    protected Clase1(int entero) {
        System.out.println("Constructor protegido: " + entero);
    }

    Clase1(double decimal) {
        System.out.println("Constructor default: " + decimal);
    }

    private Clase1(String texto) {
        System.out.println("COnstructor privado: " + texto);
    }

    //métodos
    public void metodoPublico() {
        System.out.println("Metodo público");
    }

    public void metodoProtegido() {
        System.out.println("Metodo protegido");
    }

    void metodoDefault() {
        System.out.println("Metodo default");
    }

    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

}
