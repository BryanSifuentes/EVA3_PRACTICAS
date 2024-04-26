/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_propiedades_de_reglas;

/**
 *
 * @author Alexs
 */
public class EVA3_5_PROPIEDADES_DE_REGLAS {

    public static void main(String[] args) {
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        //------
                arreglo = new int[5];
        System.out.println("");
        System.out.println("DESPUESDE DEL CAMBIO DE TAMAÑO");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }
}
