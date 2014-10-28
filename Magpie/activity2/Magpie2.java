/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me about your family.";
        }
        
        else if (statement.indexOf("hello") >=0
            || statement.indexOf("hi") >= 0 
            || statement.indexOf("yo") >= 0
            || statement.indexOf("what's up") >= 0
            ||statement.indexOf("hey")  >= 0)
        {
            response = "How's it going?";
        }
        
        else if (statement.indexOf("good") >=0
            || statement.indexOf("fine") >= 0 
            || statement.indexOf("ok") >= 0
            || statement.indexOf("okay") >= 0
            || statement.indexOf("amazing") >= 0
            ||statement.indexOf("great")  >= 0)
        {
            response = "I was just kidding, I actually don't care about you";
        }
        
        else if (statement.indexOf("oh") >=0
            || statement.indexOf("wow") >= 0 
            || statement.indexOf("eh") >= 0
            || statement.indexOf("agh") >= 0)
        
        {
            response = "Does that surprise you? Fatty?";
        }
        
        else if (statement.indexOf("?") >=0)
        {
            response = "Go ask someone that doesn't want to murder you...";
        }
           
            
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Did you know that elephants can't jump?";
        }
        else if (whichResponse == 1)
        {
            response = "WOW!";
        }
        else if (whichResponse == 2)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 3)
        {
            response = "Tell me more.";
        }

        return response;
    }
}
