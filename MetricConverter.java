import java.util.*;
import java.lang.Math;

public class MetricConverter
{
    public static void main(String[] args)
    {
        boolean done = false;
        double meters = 0;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Input length in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        System.out.println("Length in miles: " + (meters / 1609));
        System.out.println("Length in feet: " + (meters * 3.281));
        System.out.println("Length in inches: " + (meters * 39.37));
    } 
}