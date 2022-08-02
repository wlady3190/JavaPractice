
package com.desarrollo.test;

import com.desarrollo.multimedia.Disco;
import com.desarrollo.multimedia.Multimedia;
import com.desarrollo.multimedia.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Wladimir Tierra
 */
public class ClaseEjecutable {

    public static void main(String[] args) {
        String tittle, author, format, actor ;
        char optionFilm, optionDisc;
        double price, duration;
        int capacity, option1;
        Scanner sc = new Scanner(System.in);
        Multimedia multimedia = null;
        Disco disc = null;
        Pelicula film = null;
        do {
            System.out.println("");
            System.out.println("SISTEMA DE COMPRAS DE PELICULAS Y DISCOS");
            System.out.println("1. INGRESO DE PELÍCULAS: ");
            System.out.println("2. INGRESO DE DISCOS: ");
            System.out.println("3. SALIR ");

            System.out.println("Seleccione una opción: ");
            option1 = sc.nextInt();

            switch (option1) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**PELÍCULAS**");
                        System.out.println("1. Ingrese el título de la película");
                        tittle = sc.next();
                        System.out.println("2. Ingrese el autor del película: ");
                        author = sc.next();
                        System.out.println("Ingrese el formato de la película: ");
                        format = sc.next();
                        System.out.println("Ingrese el precio en USD: ");
                        price = sc.nextDouble();
                        System.out.println("Ingrese la duracion en minutos");
                        duration = sc.nextInt();
                        System.out.println("Ingrese el actor principal");
                        actor = sc.next();
                        System.out.println("¿Desea ingresar otra película (s/n)?");
                        optionFilm = sc.next().charAt(0);
                        film = new Pelicula(tittle, author, format, price, duration, actor)
                                ;
                    } while (optionFilm!='n');
                    System.out.println(film.toString());
                    film.calcularDescuento();  

                    break;
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("**DISCOS**");
                        System.out.println("1. Ingrese el título del Disco: ");
                        tittle = sc.next();
                        System.out.println("2. Ingrese el autor del Disco: ");
                        author = sc.next();
                        System.out.println("Ingrese el formato de la Disco: ");
                        format = sc.next();
                        System.out.println("Ingrese el precio en USD: ");
                        price = sc.nextDouble();
                        System.out.println("Ingrese la duración en minutos");
                        duration = sc.nextDouble();
                        System.out.println("Ingrese la capacidad en MB: ");
                        capacity = sc.nextInt();
                      
                        System.out.println("¿Desea ingresar otra película (s/n)?");
                        optionDisc = sc.next().charAt(0);
                        disc = new Disco(tittle, author, format, price, duration, capacity);
                    } while (optionDisc!='n');
                    System.out.println(disc.toString());
                    disc.contarDiscos();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema *WT*");

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

            System.out.println("");

        } while (option1 != 3);

    }

}
