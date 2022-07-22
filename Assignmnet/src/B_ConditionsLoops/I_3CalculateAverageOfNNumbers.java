package B_ConditionsLoops;

import java.util.Scanner;

public class I_3CalculateAverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Total number  : ");
         int sum = 0 , totalNumber = input.nextInt();

         for(int i = 0 ; i < totalNumber ; i++)
         {
             int num = input.nextInt();
             sum += num;
         }
         double average = sum / totalNumber;

        System.out.println(average);

    }
}
