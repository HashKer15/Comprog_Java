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
import java.util.Arrays;

public class JDV_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many animals you want to insert? ");
        int numOfAnimals = input.nextInt();

        String[] animals = new String[numOfAnimals];

        for (int i = 0; i < numOfAnimals; i++) {
            System.out.print("[" + (i + 1) + "] ");
            animals[i] = input.next();
        }
        Arrays.sort(animals);
        System.out.println("You entered the following animals:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

    }
}
