package C_SwitchCase;

import java.util.Scanner;

public class A_ClassPrectice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String st = input.next();

         switch (st)
         {
             case "mango" -> System.out.println("A sweet food");
             case "banana" -> System.out.println("A yellow food but ");
             case "orange" -> System.out.println("Deppend of locations");
             default -> System.out.println("Enter correct furites name");
         }
    }
}
