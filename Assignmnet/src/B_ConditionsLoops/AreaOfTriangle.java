package B_ConditionsLoops;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // area of  traingle  = ( base * height ) / 2

        double ans , base = input.nextDouble() , height = input.nextDouble();

        ans = (base * height)/2;

        System.out.println(ans);
    }
}
