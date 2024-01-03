/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        int arreglo1[][] = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int arreglo2[][] = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];
        // 
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1.length; c++) {
                int primerValor = arreglo1[f][c];
                int segundoValor = arreglo2[f][c];
                arreglo3[f][c] = obtenerMultiplicacion(primerValor, 
                        segundoValor);

            }
        }
        for (int f = 0; f < arreglo1.length; f++) {
            String cadena = "";
            for (int c = 0; c < arreglo1.length; c++) {

                cadena = String.format("%s%d ", cadena, 
                        arreglo1[f][c]);
            }
            System.out.printf(cadena + "\n");
        }
        System.out.printf("\n");
        for (int f = 0; f < arreglo1.length; f++) {
            String cadena = "";
            for (int c = 0; c < arreglo1.length; c++) {

                cadena = String.format("%s%d ", cadena, 
                        arreglo2[f][c]);
            }
            System.out.printf(cadena + "\n");
        }
        System.out.printf("\n");
        for (int f = 0; f < arreglo1.length; f++) {
            String cadena = "";
            for (int c = 0; c < arreglo1.length; c++) {

                cadena = String.format("%s%d ", cadena,
                        arreglo3[f][c]);
            }
            System.out.printf(cadena + "\n");
        }
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

}
