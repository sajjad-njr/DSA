package B_ConditionsLoops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // area of  rectangle  = (  width * length )

        double ans , width = input.nextDouble() , length = input.nextDouble();

        ans = (width * length);

        System.out.println(ans);
    }
}
