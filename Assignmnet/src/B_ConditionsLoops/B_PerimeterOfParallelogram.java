package B_ConditionsLoops;
import java.util.Scanner;

public class B_PerimeterOfParallelogram {
    //Perimeter Of Parallelogram P = 2 ( a + b ) where [ b = base , a = side ]

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base , side;
        base = input.nextDouble();
        side = input.nextDouble();

        double ans = 2 * ( base + side);
        System.out.println(ans);
    }

}
