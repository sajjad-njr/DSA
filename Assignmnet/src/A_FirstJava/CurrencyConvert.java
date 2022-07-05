package A_FirstJava;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double taka = input.nextDouble();
        System.out.println(taka / 87.60);
    }
}
