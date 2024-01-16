/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_pyramid;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_Pyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = input.nextInt();
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= num);

    }
}
