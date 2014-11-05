import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of one side of the diamond: ");
        int userLength = in.nextInt();
        String space = " ";
        
        for (int row=0;row<2*userLength-1;row++)
        {
            int numstar=1;
            
        {for (numstar;numstar<(2*userLenth)-1; numstar+=2)
            {System.out.print("*");}
            
        }
        System.out.println("");
        
    }
}}
      