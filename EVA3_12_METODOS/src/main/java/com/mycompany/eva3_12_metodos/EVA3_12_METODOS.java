/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_12_metodos;

/**
 *
 * @author Alexs
 */
public class EVA3_12_METODOS {

    public static void main(String[] args) {
        //invocar el metodo ---> lamada ---> call
        mostrarMensaje("hola mundo");
        mostrarMuchosMensajes("hola", 5);
    }
    //public static --> para la materia de POO
    //vold ---> (tipo de dato) valor que regresa el metodo
    // vold --> no regresa nada
    //nombre del metodo --> identificador valido 
    //                     empezar en minusculas, debe ser un verbo
    //()<-- parametros del metodo (argumentos) --> valores que necesita
    public static void mostrarMensaje(String mensaje) {
        //curpo del metodo aqui va nuestro codigo 
        System.out.println(mensaje);
        
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces) {
        for (int i = 0; i< veces; i++) {
            System.out.println(mensaje);
        }
    }
}
