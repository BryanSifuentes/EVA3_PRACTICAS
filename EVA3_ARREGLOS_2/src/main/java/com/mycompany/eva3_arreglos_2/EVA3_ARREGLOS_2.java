/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_arreglos_2;

/**
 *
 * @author Alexs
 */
public class EVA3_ARREGLOS_2 {

    public static void main(String[] args) {
        //JAVA: 0 PRIMER ELEMENTO
        //      N - 1 ULTIMO ELEMENTO 
        //N--> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y llenarlo de valores aleatorios
        // int datos[], x,y;---> SOLO datos ES UN ARREGLO
        //int[] datos, x, y;--->
        int datos[] = new int[10];
        
        //asignar valores aleatorios entre 0 y 99
        for(int i = 0; i < datos.length; i++) {
            datos [1] = (int)(Math.random() * 100);// 0- 99
        }
            //imprimir lo elementos del arreglo:
            for(int i = 0; i < datos.length; i++) {
                System.out.print("[" + datos[i] + "]");
            }
        }
    }

