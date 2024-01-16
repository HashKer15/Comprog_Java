
package jdv_inputnames;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class JDV_InputNames {

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
