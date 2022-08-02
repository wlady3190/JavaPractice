package arregloBidimensional;
import java.util.Scanner;
public class Matriz2 {

    public static void main(String[] args) {
        int matriz[][], filas, columnas;
        boolean simetrica=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas");
        filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        if (filas == columnas) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    } 
                }
            }
        } if (simetrica == true){
            System.out.println("La matriz es simétrica");
        } else{
            System.out.println("La matriz no es simétrica");
        }

    }

}
