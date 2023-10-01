import java.util.*;
import java.lang.Math;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        boolean done = false;
        double side1 = 0;
        double side2 = 0;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Input the length of the rectangle: ");
            if(in.hasNextDouble())
            {
                side1 = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        done = false;
        do
        {
            System.out.println("Input the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                side2 = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        System.out.println("Area of the rectangle: " + (side1 * side2));
        System.out.println("Perimeter of the rectangle: " + ((side1 * 2) + (side2 * 2)));
        System.out.println("Length of the diagonal: " + Math.sqrt((side1 * side1) + (side2 * side2)));
    } 
}