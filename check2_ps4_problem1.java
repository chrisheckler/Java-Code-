
/**
 * Christopher Heckler
 * 
 * Problem Set 4 #1
 */

import java.util.*;
public class check2_ps4_problem1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        String entr = "";
        char num;
    
        System.out.print("Enter a digit: ");
        entr = in.next().trim();
        
        num = entr.charAt(0);
        
        if (Character.isDigit(num))
        {
            System.out.println("Thank you");
            
        }
        
        if (!(Character.isLetterOrDigit(num)))
        {
            System.out.println("Invalid data");
        }
        
        if (Character.isLetter(num))
        {
            System.out.println("No, that's a letter!");
        }
        
    }
}
