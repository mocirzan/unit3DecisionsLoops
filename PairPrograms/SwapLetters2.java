import java.util.Scanner;
import java.util.Random;

public class SwapLetters2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("Enter a word");

        String word = input.next();
        int wordLength = word.length();

        System.out.println("");
        int i = 0;
        int j = 0;
        
        for (int index = 0;index<wordLength ; index++)
        {
            i = gen.nextInt(wordLength - 1);
            j = gen.nextInt(wordLength);
            while  (j<=i)
            {
                j = gen.nextInt(wordLength);
            }
            String firstLetter = word.substring(i, i+1) ;
            String start = word.substring(0,i);
            String middle = word.substring(i+1, j);
            String secondLetter = word.substring(j, j+1) ;
            String end = word.substring(j+1,wordLength);
            word = (start + secondLetter + middle + firstLetter + end);
        }
        System.out.print(word);
        
    }
}
