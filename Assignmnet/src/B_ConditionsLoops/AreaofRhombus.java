package B_ConditionsLoops;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // area of Parallelogram  = ( diagonal1 * daigonal2 ) / 2

        double ans , diagonal1 = input.nextDouble() , diagonal2 = input.nextDouble();

        ans = ( diagonal1 * diagonal2)/2;

        System.out.println(ans);
    }
}
