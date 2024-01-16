/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_switchapp;

/**
 *
 * @author user23
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class JDV_SwitchApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.##");
        System.out.println("CALCULATORS:\n\t 1.Math Calculator\n\t 2.Salary Calculator\n\t 3.Grade Calculator");
        System.out.print("Enter Choice: ");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("\n-Math Calculator-");
                System.out.print("\nEnter First Value: ");
                long x = input.nextLong();
                System.out.print("Enter Second Value: ");
                long y = input.nextLong();
                long sum = x + y;
                long sub = x - y;
                float pro = x * y;
                float div = x / y;

                System.out.println("\nSum: " + sum);
                System.out.println("Different: " + sub);
                System.out.println("Product: " + pro);
                System.out.println("Quoteint: " + div);
                break;
            case 2:
                System.out.println("\n-Salary Calculator-");
                System.out.print("\nEnter no. of hrs. works: ");
                float hoursWorked = input.nextFloat();
                System.out.print("Enter rate per hour: ");
                float rph = input.nextFloat();
                float grossPay = hoursWorked * rph;
                System.out.println("Grosspay: " + grossPay);
                System.out.print("Enter Deductions: ");
                float deduct = input.nextFloat();
                float netPay = grossPay - (grossPay * deduct);
                System.out.println("Netpay: " + netPay);
                break;

            case 3:
                System.out.println("\n-Grade Calculator-");
                float oneG,
                 twoG,
                 thirdG,
                 ave;
                System.out.print("\nEnter Grade ICT: ");
                oneG = input.nextFloat();
                System.out.print("Enter Grade Math: ");
                twoG = input.nextFloat();
                System.out.print("Enter Grade  Filipino: ");
                thirdG = input.nextFloat();

                ave = (oneG + twoG + thirdG) / 3;
                if (oneG >= 120 || twoG >= 120 || thirdG >= 120) {
                    System.out.println("120 or up grade is invalid");

                } else {
                    System.out.println("Total Average: " + dF.format(ave));
                    if (ave >= 75) {
                        System.out.println("Passed!");
                    } else {
                        System.out.println("Failed!");
                    }
                }
                break;
            default:
                System.out.println("Invalid Choices!");
                break;
        }
    }

}
