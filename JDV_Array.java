/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_array;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which item do you want to display(0-3): ");
        int num = input.nextInt();
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int i;
            for (i = num; i < cars.length; i++) {
            System.out.println("You Choose " + cars[i]);
            break;
        
        }

        
    }
}
