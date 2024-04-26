/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_captura_de_datos;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA3_4_CAPTURA_DE_DATOS {

    public static void main(String[] args) {
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] listaNombre = new String[cant];
        captu.nextLine();
        // hay que preguntar cada nombre 
        for (int i = 0; i<listaNombre.length; i++){
            System.out.println("nombre #" +(i + 1)+ ": ");
        listaNombre[i] = captu.nextLine();
            
        }
          for (int i = 0; i<listaNombre.length; i++){
              System.out.println(listaNombre[i]);
          }      
        
        
 }   }

