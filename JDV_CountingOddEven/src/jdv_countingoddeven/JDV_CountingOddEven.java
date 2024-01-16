/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_countingoddeven;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_CountingOddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to input?: ");
        int num = input.nextInt();
        int odd = 0, even = 0;

        for (int i = 1; i < num; i++) {
            System.out.print(i + ") ");
            int num2 = input.nextInt();

            if (num2 % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("There are " + even + " even ");
        System.out.println("There are " + odd + " odd");
    }

}
