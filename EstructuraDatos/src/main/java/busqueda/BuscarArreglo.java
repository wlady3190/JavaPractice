/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Wladimir Tierra
 */
public class BuscarArreglo {

    int elemento, primero, centro, ultimo, numCentro, aux;

    public BuscarArreglo() {
        this.elemento = 0;
        this.primero = 0;
        this.centro = 0;
        this.ultimo = 0;
        this.numCentro = 0;
        this.aux = 0;
    }

    public int BusquedaLineal(int arreglo[], int elemento) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                encontrado = true;
                return i;
            }
        }
        return -1; //Para determinar si el elemento no fue encontrado
    }
    public void Ordenar(int arreglo[]) {
        for (int i = 0; i < (arreglo.length) - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }
    public void Imprimir(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    //Método de búsqueda binaria
    public int BusquedaBinaria(int arreglo[], int elementos){
        ultimo = arreglo.length-1;
        while(primero<=ultimo){
            centro = (primero+ultimo)/2;
            numCentro = arreglo[centro];
            if (elemento == numCentro){
                return centro;
            }else if(elemento <numCentro){
                ultimo = centro -1;               
            }else{
                primero = centro+1;
            }           
        }
        return -1;
    }
}
