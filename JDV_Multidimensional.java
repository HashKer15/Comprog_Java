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
import java.util.Scanner;
import java.util.Arrays;

public class JDV_Multidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Arrays: ");
        int numArr = input.nextInt();
        int [][] array = new int[numArr][];
        
        for(int i=0; i<numArr;i++){
            System.out.print("\nEnter how many elements you want to store in array "+"["+i+"]: ");
            int arraysize = input.nextInt();
            array[i] = new int[arraysize];
            for(int j = 0; j <arraysize; j++){
                System.out.print("["+(j+1)+"]");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("\nThe Elements entered");
        for(int i=0; i<numArr;i++){
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
    
}
