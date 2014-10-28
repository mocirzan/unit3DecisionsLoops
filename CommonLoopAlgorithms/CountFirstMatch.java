
import java.util.Scanner;

public class CountFirstMatch
{
    /**
     * Counts the first space ( ' ' ) in a string.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter a string: ");
        String str = in.nextLine();
        
        boolean found = false;
        int index = 0;
        
        while ( !found && index < str.length() )
        {
            char ch = str.charAt( index );
            if (ch == ' ' )
            {
                found = true;
            }
            
            index++;
            
        }
        
        index -= 1;
        System.out.println("First space is at position: " + index);
    }
}
