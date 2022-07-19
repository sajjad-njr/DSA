package C_SwitchCase;

import java.util.Scanner;

public class A_ClassPrectice12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();

        switch (dayNumber)
        {
            case 1 -> System.out.println("Sajjad");
            case 2 -> System.out.println("Kunal");
            case 3 ->{
                System.out.println(" write dp name ");
                String nameOfDepartment = input.next();
                switch (nameOfDepartment)
                {
                    case "it" -> System.out.println("IT DEPARTMENT");
                    case "bba" -> System.out.println("BBA department");
                    default -> System.out.println("More comming soon");
                }
            }
            default ->System.out.println("More Name comming soon");
        }
    }
}
