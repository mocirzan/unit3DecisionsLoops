public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        int result1 = word1.compareTo("aaa");
        int result2 = word2.compareTo(word1);
        if (result1 > 0)
        {System.out.println("Word1 is greater than aaa");}
        
        if (result2 ==0)
        {System.out.println("Word2 is equal to word1");}
        if (result2 < 0)
        {System.out.println("Word1 is less than word 2");}
        String word1prefix=word1.substring(0,3);
        String word2prefix=word2.substring(0,3);
        if(word1prefix.equals(word2prefix))
        {System.out.println("word1 and word2 have the same prefix");}
        
        
        
        
        
        
    }
}