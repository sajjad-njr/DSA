package C_SwitchCase;

import java.util.Scanner;

public class A_ClassPrectice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();

        switch (dayNumber)
        {
            // multiple case same vlaue no break
            case 1,2,3,4,5 -> System.out.println("Monday");
             case 6,7 -> System.out.println("Friday");
            default -> System.out.println("Out of range");
        }
    }
}
