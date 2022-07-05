package B_ConditionsLoops;

import java.util.Scanner;

public class B_PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // PerimeterOfCircle = 2 * pi * radius

        double radius = input.nextDouble();
        double ans = Math.PI * radius * 2;

        System.out.println(ans);
    }
}
