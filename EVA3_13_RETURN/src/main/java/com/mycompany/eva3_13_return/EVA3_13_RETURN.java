/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA3_13_RETURN {

    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       System.out.println("valor 1: ");
       int val1 = captu.nextInt();
       System.out.println("valor 2: ");
       int val2 = captu.nextInt();
        System.out.println("la suma = " + sumar(val1,val2));
    }
        public static int sumar (int num1, int num2) {
            int resu = num1 + num2;
            return resu;//Es la ultima instruccion del metodo 
                        //despues del return no puede haber mas 
                        //introducciones 
        }
    }

