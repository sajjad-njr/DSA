package B_ConditionsLoops;

import java.util.Scanner;

public class I_5DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter between to points cordinate x1,y1,x2,y2 : ");
        //coordinate
        double x1, y1 , x2 , y2;
        x1 = in.nextDouble();y1 = in.nextDouble();x2 = in.nextDouble();y2 = in.nextDouble();

        System.out.println("Distance Beetween 2 point is : "+DistanceTwoPoint(x1,  y1 ,   x2 , y2));


    }
    static  double DistanceTwoPoint(double x1, double y1 , double x2 , double y2)
    {
        double X = Math.pow((x1-x2), 2);
        double Y = Math.pow((y1-y2), 2);

        return  Math.sqrt((X+Y));
    }
}
