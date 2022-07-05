package B_ConditionsLoops;

import java.util.Scanner;

public class B_PerimeterOfEquilateralTriangle {
    // Perimeter Of Equilateral Triangle P = 3 a [ a = side ]
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        System.out.println(3*a);
    }
}
