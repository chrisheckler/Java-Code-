
/**
 * Christopher Heckler
 * 
 * Problem Set 4 #3
 */

import java.util.*;
public class check2_ps4_problem3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String newDir = "";
        
        System.out.print("Enter a direction: ");
        String dir = in.next();
        
        newDir = dir.toLowerCase();
        
       
        if (newDir.equals("north"))
        {
            System.out.println("^");
        }   
        else if (newDir.equals("south"))
        { 
            System.out.println("V");
        }    
        else if (newDir.equals( "west")) 
        {    
            System.out.println("<");
        }
        else if (newDir.equals("east"))
        {    
            System.out.println(">"); 
        }
        else
        {
            System.out.println("Invalid direction: " + dir);
        }
        
        
    }
}
