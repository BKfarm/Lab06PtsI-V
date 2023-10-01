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
    } 
}
