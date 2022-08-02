/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.factorial;

/**
 *
 * @author Wladimir Tierra
 */
public class Factorial {

    public static int calculoFactorial(int array[], int num) {
        int factorial;
        if (num<=0){
            return 1;
        } 
            factorial = array[num-1] * calculoFactorial(array,num-1);

        return factorial;

    }
   

            

}
