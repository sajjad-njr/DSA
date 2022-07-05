package B_ConditionsLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // area of circle = pi * r * r [ where r is radius ]
        double pi = Math.PI;
        double ans , radius = input.nextDouble();

        ans = pi * radius * radius;

        System.out.println(ans);
    }
}
