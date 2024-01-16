/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdv_birthmonth;

/**
 *
 * @author user23
 */
import java.util.Scanner;

public class JDV_birthMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Birth Number 1-12: ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Month: January");
                System.out.println("Birthstone: Garmet\nGarmet is the stone that represent symbol of love and friendship.");
                break;
            case 2:
                System.out.println("Month: February");
                System.out.println("Birthstone: Amethyst\nAmethyst have been used to symbolize deep love, happiness, humility, sincerity, and wealth");
                break;
            case 3:
                System.out.println("Month: March");
                System.out.println("Birthstone: Aquamarine & Bloodline\nAquamarine symbolize of youth and happiness");
                break;
            case 4:
                System.out.println("Month: April");
                System.out.println("Birthstone: Diamond\nDiamond symbolize love, good fortune, good health, and courage");
                break;
            case 5:
                System.out.println("Month: May");
                System.out.println("Birthstone: Emerald\nEmerald symbolize loyalty, new beginnings, peace, and security");
                break;
            case 6:
                System.out.println("Month: June");
                System.out.println("Birthstone: Pearl\nPearl have been associated with purity, humility, and innocence, and is often presented as a wedding gift");
                break;
            case 7:
                System.out.println("Month: July");
                System.out.println("Birthstone: Ruby\nRuby associated with love, passion, protection, and wealth");
                break;
            case 8:
                System.out.println("Month: August");
                System.out.println("Birthstone: Sardonyx\nSardonyx is often associated with strength, courage, and protection.");
                break;
            case 9:
                System.out.println("Month: September");
                System.out.println("Birthstone: Sapphire\nSapphire has long been associated with wisdom, intelligence, and mental clarity");
                break;
            case 10:
                System.out.println("Month: October");
                System.out.println("Birthstone: Opal\nOpal is often associated with creativity, imagination, and inspiration");
                break;
            case 11:
                System.out.println("Month: November");
                System.out.println("Birthstone: Topaz\nTopaz is often associated with strength, courage, and resilience");
                break;
            case 12:
                System.out.println("Month: December");
                System.out.println("Birthstone: Turquoise\nTurquoise is often regarded as a protective stone");
                break;
            default:
                System.out.println("Invalid BirthMonth Number");
                break;

        }

    }

}
