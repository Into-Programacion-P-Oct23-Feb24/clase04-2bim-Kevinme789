/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        
        // Lo llamo de esta forma ya que es un procedimiento el cual no retorna nada
        // por lo tanto solo lo invocamos, no tiene valor de algun tipo.
        obtenerMultiplicacion(7,50);
        
        
        // Lo hacemos de esta forma ya que es una funcion que devuelve un valor
        // tipo cadena por lo tanto para imprimir lo que se va a realizar
        // le damos el valor que va a retornar, a una variable.
        String miMensaje = obtenerMultiplicacionDos(7,50);
        System.out.printf("%s\n", miMensaje);
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        String cadena = "";
        for (int f = 1;f <= limite;f++) {
            int resultado = f * tabla;
            cadena=String.format("%s%d x %d: %d\n", cadena, tabla, 
                    f, resultado);

        }
               System.out.printf(cadena);
     }

    public static String obtenerNombre() {
        return "Luis";
    }
    public static String obtenerMultiplicacionDos(int tabla,int limite){
       String cadena = "";
        for (int f = 1;f <= limite;f++) {
            int resultado = f * tabla;
            cadena=String.format("%s%d x %d: %d\n", cadena, tabla, 
                    f, resultado);

        }
        return cadena;
    }

}
