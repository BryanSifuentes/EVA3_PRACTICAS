/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_5_dimenciones;

/**
 *
 * @author Alexs
 */
public class EVA3_8_5_DIMENCIONES {

    public static void main(String[] args) {
        int cubo[][][][][] = new int[25][20][15][10][5];
        for (int i = 0; i < cubo.length; i++) {
            for(int j = 0; j < cubo[i].length; j++) {
                for(int k = 0; k < cubo[i][j].length; k++) {
                    for(int m = 0; m < cubo[i][j][k].length; m++) {
                        for(int p = 0; p < cubo[i][j][k][p].length; p++) {
                            cubo[i][j][k][m][p] = (int) (Math.random() * 100);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for(int j = 0; j < cubo[i].length; j++) {
                for(int k = 0; k < cubo[i][j].length; k++) {
                    for(int m = 0; m < cubo[i][j][k].length; m++) {
                        for(int p = 0; p < cubo[i][j][k][p].length; p++) {
                            System.out.println("[" + cubo[i][j][k][m][p] +"]");
                        }
                    }
                }
            }
        }
    }
}
    
                        
                    
                       
                        
                    
                
                    
    

