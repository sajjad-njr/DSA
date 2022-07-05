package B_ConditionsLoops;

import java.util.Scanner;

public class B_PerimeterOfRectangle {
    //Perimeter Of Rectangle = 2 * (length + wide)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length , wide ;
        length = input.nextDouble();
        wide = input.nextDouble();

        double ans = 2 * (length + wide);
        System.out.println(ans);
    }
}
