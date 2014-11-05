import java.util.Scanner;

public class Diamond2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of one side of the diamond: ");
        int userLength = in.nextInt();
        String space = " ";
        
    for (int row = 0; row < 2*userLength - 1 ;row++)
        {
           for (int numStar = 0; numStar < 2*userLength -1; numStar ++)
           {
           System.out.print("*");
           if (numStar = 2*userLength - 1)
           {
               row += 1;
            }
           
           }
           System.out.println(space);
        }
    }
}
        