/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_multidimensional;

/**
 *
 * @author user23
 */

public class JDV_Multidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int name[][] = {{1,2,3,4,5},{6,7,8,9,10}};
        
        for(int i = 0;i < 2;i++){
            for(int j = 0;j<5;j++){
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
