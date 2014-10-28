import java.util.Scanner;

public class CircleOverlap
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the radius of the first circle: ");
        double radius1 = in.nextDouble(); 
        double xcenter1 = 0;
        double ycenter1 = 0;
        System.out.print("Input the radius of the second circle: ");
        double radius2 = in.nextDouble(); 
        double xcenter2 = 40;
        double ycenter2 = 0;

        if ((radius1 + radius2) == 40)
        {
            System.out.println("The circles are sharing a point");
        }
        
        else if((radius1 + radius2) < 40)
        {
            System.out.println("The circles are not touching");
        }
        
        else if((radius1 + radius2) > 40)
        {
            if(radius2 < (radius1 - 40))
            {
                System.out.println("The circles are overlapping each other");
            }
            
            else if(radius1 < (radius2 - 40))
            {
                System.out.println("The circles are overlapping each other");
            }
            
            else if(radius1 == (radius2 - 40))
            {
                System.out.println("The circles are overlapping each other and sharing a point.");
            }
            
            else if(radius2 == (radius1 - 40))
            {
                System.out.println("The circles are overlapping each other and sharing a point.");
            }
            
            
        }
    }
}