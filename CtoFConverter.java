import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
    boolean done = false;
    double startTemp = 0;
    Scanner in = new Scanner(System.in);
    do
        {
        System.out.println("Input temperature in Celsius: ");
        if(in.hasNextDouble())
        {
            startTemp = in.nextDouble();
            done = true;
        }
        in.nextLine();
        }while(!done);
        startTemp = (startTemp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + startTemp);
    } 
}
