import java.util.Scanner;

public class CompareAdjacent
{
    /**
    * An example of a method - replace this comment with your own
    * */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        double preValue = in.nextDouble();

        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            if(value == preValue)
            {
                System.out.println("Duplicate nubmer!");

            }
            preValue = value;
        }
        
    }
}
