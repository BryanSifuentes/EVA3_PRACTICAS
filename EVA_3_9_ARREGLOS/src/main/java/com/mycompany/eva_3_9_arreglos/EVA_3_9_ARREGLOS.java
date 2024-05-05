/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_9_arreglos;

/**
 *
 * @author Alexs
 */
public class EVA_3_9_ARREGLOS {

    public static void main(String[] args) {
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Tamaño del arreglo diaSemana =" + diasSemana.length);
        System.out.println("Tamaño de arreglo vocales =" + vocales.length);
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }
    }
}
