package A_FirstJava;

import java.util.Scanner;

public class StingPalin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String str2 ="";

        for(int i = str.length()-1 ; i>= 0 ; i--)
        {
            str2 += str.charAt(i);
        }
        if(str.equals(str2)) System.out.println("Yes ! its palindrome");
        else System.out.println("No this is not Palindrome !!");
    }
}
