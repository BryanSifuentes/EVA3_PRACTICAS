/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_19_referencias;

/**
 *
 * @author Alexs
 */
public class EVA3_19_REFERENCIAS {

    public static void main(String[] args) {
        int[] arreglo = new int [5];
        int x = 100;
        System.out.println("Antes de llamar al metodo. x = " + x);
        sumarUno(x);
        System.out.println("Ddespues de lllamar al metodo. x = " + x);
        System.out.println("-------------------------------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
       for (int i = 0; i < arreglo.length; i++) {
           System.out.println("[" + arreglo[i] + "]");
           
       }
    }
    public static void sumarUno(int valor) {
        System.out.println("Amntes de la operacion, valor: "+ valor);
        valor = valor  + 1;
         System.out.println("Despues de la operacion. valor: "+ valor);
    
}
     public static void modificarArreglo (int [] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int) (Math.random() * 100);
        }
     }
}
