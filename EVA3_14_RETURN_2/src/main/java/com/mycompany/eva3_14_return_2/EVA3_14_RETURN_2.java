/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA3_14_RETURN_2 {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.println("entero");
        int val1 = ver.nextInt();
        System.out.println("potencia:");
        int val2 = ver.nextInt();
        
        System.out.println("el resultado es = " + calcularPot(val1, val2));
    }
    public static int calcularPot(int base, int potencia) {
        int resu = 1;
        for (int i = 0; i < potencia; i++){
            resu *= base;
        }
        return resu;
        }
    }

