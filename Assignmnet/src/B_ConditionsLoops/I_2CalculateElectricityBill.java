package B_ConditionsLoops;

import java.util.Scanner;

public class I_2CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of Unit : ");
        int unit = input.nextInt();
        double bill = 0;

        // unit price = 5 ;
        if(unit >= 50 && unit <= 200)
            bill = unit * 5 * 1.5;
        else if (unit >= 500 )
            bill = unit * 5 * 2.5;

        System.out.println("Total bill cost : "+bill);

    }
}
