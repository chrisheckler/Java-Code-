
/**
 * Christopher Heckler
 * 
 * Problem Set 4 #4
 */

import java.util.*;
public class check2_ps4_problem4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your new password: ");
        String passwrd = in.next();
        
      
       
        if (passwrd.length() == 5)
        { 
            if (!(Character.isDigit(passwrd.charAt(0)) || Character.isDigit(passwrd.charAt(1)) || 
                Character.isDigit(passwrd.charAt(2)) || Character.isDigit(passwrd.charAt(3)) ||
                Character.isDigit(passwrd.charAt(4))))
                {
                    System.out.println("Your password should contain at least one digit.");
                }
            else if (!(Character.isUpperCase(passwrd.charAt(0)) || Character.isUpperCase(passwrd.charAt(1)) || 
                Character.isUpperCase(passwrd.charAt(2)) || Character.isUpperCase(passwrd.charAt(3)) ||
                Character.isUpperCase(passwrd.charAt(4))))
                {
                     System.out.println("Your password should contain at least one uppercase letter.");
                }
            else
            {
                System.out.println("Password changed!");
            }
    }
        else
        {
            System.out.println("You password needs to be 5 characters");        
        }
        }
}

