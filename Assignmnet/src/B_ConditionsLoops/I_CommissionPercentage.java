package B_ConditionsLoops;

import java.util.Scanner;

public class I_CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Price and Percentage , respectively : ");
        double price = input.nextDouble();
        double percentage = input.nextDouble();

        price = price - ( price * (percentage/100));
        System.out.println("Now the price is : "+price);
    }
}
