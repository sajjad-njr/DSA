package A_FirstJava;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
         int size = input.nextInt();
         int[] arr = new int[size+1];

         arr[0] = 0;
         arr[1] = 1;

         for(int i = 2; i <= size ; i++)
         {
             arr[i] = arr[i-1] + arr[i-2];
         }
            for(int i = 0; i <= size ; i++)
            {
                System.out.println("\t "+i+"\t"+arr[i]);
            }
        }

}
