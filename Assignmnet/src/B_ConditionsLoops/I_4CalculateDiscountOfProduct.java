package B_ConditionsLoops;

import java.util.Scanner;

public class I_4CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Product price and discount  ");
        double price = 0 , discount = 0;

        price = input.nextDouble();
        discount = input.nextDouble();

        price = price - (price * (discount/100));

        System.out.println("After discount Price = "+price);

    }

}
