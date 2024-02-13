package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter a number:");
        int x = scan.nextInt();

        System.out.println("Enter a second number:");
        int y = scan.nextInt();

        System.out.println(x + y);

        scan.close();

    }
    
}
