/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_1_arreglos;

/**
 *
 * @author Alexs
 */
public class EVA_3_1_ARREGLOS {

    public static void main(String[] args) {
        //LOS ARREGLOS EN JAVA SON OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[] ---> MANEJAR LOS INDICES : arreglo [3]acceso a la posicion
        //declaracion= creacion (new) [tamaño del arreglo]
        int arreglo[] = new int[10];//un arreglo de 10 enteros
        //atraves de indices:
        //conocen las pociciones de los valores:
        //PRIMER POCICON DE UN ARREGLOES CERO --> 0
        //ULTIMA POSICION DE UN ARREGLO ES --> N - 1, DONDE
        //N ES EL TAMAÑO DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("valor del arreglo [1] =" + arreglo [1]);
        System.out.println(arreglo);
                System.out.println(arreglo.length);
    }
}
