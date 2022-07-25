package B_ConditionsLoops;

import java.util.Scanner;

public class I_22PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int   sum = 0;
        int num = input.nextInt();
        for(int i = 1 ; i <= num/2 ; i++)
        {
            if(num % i == 0) sum += i;
        }
    if(sum == num) System.out.println("Perfect number");
    else System.out.println("Not perfect ");
    }
}
