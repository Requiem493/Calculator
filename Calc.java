package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int d = 0;
        
        System.out.println("Enter a number:");
        int x = scan.nextInt();

        System.out.println("Enter a second number:");
        int y = scan.nextInt();

        System.out.println("Would you like addition, subtraction, multiplication or division?");
        System.out.println("Type 1 to add, 2 to subtract, 3 to multiply, 4 to divide");
        d = scan.nextInt();

        while(d != 1 || d != 2 || d != 3 || d != 4){
        System.out.println("Would you like addition, subtraction, multiplication or division?");
        System.out.println("Type 1 to add, 2 to subtract, 3 to multiply, 4 to divide");
        d = scan.nextInt();
        }

        if (d == 1){
            System.out.println(x+y);
        }else if(d == 2){
            System.out.println(x-y);
        }else if(d == 3){
            System.out.println(x*y);
        }else if(d == 4){
            System.out.println(x/y);
        }
        

        scan.close();

    }
    
}
