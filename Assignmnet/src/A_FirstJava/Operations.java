package A_FirstJava;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        char operator = input.next().charAt(0);

        if(operator == '+') System.out.println(num1+num2);
        else if (operator == '-')System.out.println(num1 - num2);
        else if (operator == '*')System.out.println(num1 * num2);
        else if (operator == '/')System.out.println(num1 / num2);
        else System.out.println("This is not valid operator that you put ");

    }
}
