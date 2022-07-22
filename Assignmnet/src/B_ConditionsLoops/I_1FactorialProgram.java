package B_ConditionsLoops;

import java.math.BigInteger;
import java.util.Scanner;

public class I_1FactorialProgram {
   static  BigInteger Factorial(int num)
   {
        BigInteger fcatData = new BigInteger("1");
        for(int i = 2 ; i <= num ; i++)
        {
            fcatData = fcatData.multiply(BigInteger.valueOf(i));
        }
        return  fcatData;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factNum = input.nextInt();
        System.out.println(Factorial(factNum));
    }

}
