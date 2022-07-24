package D_FunctionsMethods;

import java.util.Scanner;

public class A_ClassPrectice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        String message = MyGreet(name);
        System.out.println(message);
    }

    static String MyGreet(String name) {
        return  "Hello "+name;
    }


}
