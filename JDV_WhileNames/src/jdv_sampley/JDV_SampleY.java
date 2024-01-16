/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_sampley;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_SampleY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.print("How many names you want to input?: ");
        int numText = input.nextInt();
        input.nextLine();
        int count = 0;
        while (count < numText) {
            System.out.print("Enter Name " + (count + 1) + ": ");
            String name = input.nextLine();
            System.out.println(name);
            count++;
        }
    }

}
