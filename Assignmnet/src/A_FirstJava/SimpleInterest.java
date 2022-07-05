package A_FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double P , T,R , si; //principal amount, rate, time
        P = input.nextDouble();
        R = input.nextDouble();
        T = input.nextInt();

        si = ( P * T * R)/100;

        System.out.println("Simpe interst : "+si);
    }
}
