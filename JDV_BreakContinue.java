/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_breakcontinue;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + ") ");
            int num2 = input.nextInt();

            if (num2 % 2 == 0) {
                continue;
            } else {
                System.out.println("You entered odd number");
                break;
            }
        }

    }
}
