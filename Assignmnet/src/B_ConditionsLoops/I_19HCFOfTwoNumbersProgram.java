package B_ConditionsLoops;

import java.util.Scanner;

public class I_19HCFOfTwoNumbersProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1,num2;
        num1 = input.nextInt();num2 = input.nextInt();
        System.out.println(HFC(num1, num2) );
    }
    static  int HFC(int num1,int num2)
    {
        int minmuNumber = Math.min(num1,num2);

        while(minmuNumber > 0)
        {
            if(num1 % minmuNumber == 0 && num2 % minmuNumber == 0)
            {
                break;
            }
            minmuNumber--;
        }
        return  minmuNumber;
    }
}
