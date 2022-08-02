/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int array[] = {5, 3, 2, 1, 4};
        BuscarArreglo array1 = new BuscarArreglo();
        int dato = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número desea buscasr? "));
        array1.Imprimir(array);
        array1.Ordenar(array);
        array1.Imprimir(array);

        int posicion = array1.BusquedaBinaria(array, dato);
        if (posicion != -1) {
            System.out.println("El dato está en la posición " + posicion);
        } else {
            System.out.println("No existe el elemento");
        }

    }

}
