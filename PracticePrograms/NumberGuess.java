import java.util.Scanner;
import java.util.Random;


public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userGuess = 0;
        Random generator = new Random();
        int number = generator.nextInt(101);
        System.out.println("Try and guess the number I am thinking of! (1-100)");
        
        while (userGuess != number)
        {
            System.out.print(": ");
            userGuess = input.nextInt();
            if (userGuess > number)
            {
                System.out.println("Too high!");
            }
            else if (userGuess < number)
            {
                System.out.println("Too low!");
            }
        }
        System.out.println("You got it! The number I was thinking of was " + number);
    }
}