/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.practicaarray;

/**
 *
 * @author Wladimir Tierra
 */
public class Calculo {

    int arreglo[],longitud, contCero, contPar, contImpar;
    //Método constructor
    public Calculo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    //Método 
    public void calculoArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                contCero++;
            } else if (arreglo[i]%2==0){
                contPar++;
            } else{
                contImpar++;
            }
        }
    }
    @Override
    public String toString() {
        return "EL arreglo contiene: \n Números CERO: " + contCero + ", \n Números PARES: " + contPar + ", \n Números IMPARES: " + contImpar;
    }
    

}
