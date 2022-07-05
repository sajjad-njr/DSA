package A_FirstJava;

import java.util.Scanner;

public class GreateTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1 == num2) System.out.println("Both numbers are equal");
        else if (num1 > num2) System.out.println("Number 1 is greater than Number 2");
        else System.out.println("Number 2 is grater than Number 1");
    }
}
