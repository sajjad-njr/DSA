package B_ConditionsLoops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // area of Parallelogram  = ( base * height )

        double ans , base = input.nextDouble() , height = input.nextDouble();

        ans = (base * height);

        System.out.println(ans);
    }
}
