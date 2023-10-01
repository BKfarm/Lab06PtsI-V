import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        boolean done = false;
        double gallons = 0;
        double mpg = 0;
        double ppg = 0;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Input the amount of gallons of gas: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        done = false;
        do
        {
            System.out.println("Input the miles per gallon: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        done = false;
        do
        {
            System.out.println("Input price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                ppg = in.nextDouble();
                done = true;
            }
            in.nextLine();
        }while(!done);
        done = false;
        double range = (gallons * mpg);
        System.out.println("Your car's range: " + range + " miles");
        System.out.println("Cost per 100 miles: " + ((100.0 / mpg) * ppg) + "$");
    } 
}
