package B_ConditionsLoops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Area Of Equilateral Triangle = (sqrt(3)/4) * a * a;
        double a = input.nextDouble();

        double ans =( Math.sqrt(3)/4) * a * a ;
        System.out.println(ans);
    }
}
