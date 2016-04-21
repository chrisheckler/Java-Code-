
/**
 * Christopher Heckler
 * Problem Set 3 #4
 *  
 * 
 **/
import java.util.*;
public class check2_ps3_problem4
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       int num1;
       int num2;
       int num3;
       
       System.out.print("Number: ");
       num1 = input.nextInt();
       
       System.out.print("Divisibility Number 1: ");
       num2 = input.nextInt();
       
       System.out.print("Divisibility Number 2: ");
       num3 = input.nextInt();
       
       System.out.print("Is " + num1 + " divisible by " + num2 + " or " + num3 + "?");
       
       if (num1 % num2 == 0 || num1 % num3 == 0)
        System.out.println(" true"); 
       else
        System.out.println(" false");
       
       System.out.print("Is " + num1 + " divisible by " + num2 + " and " + num3 + "?");
       
       if (num1 % num2 == 0 && num1 % num3 == 0)
        System.out.println(" true");
       else
        System.out.println(" false");
       
       System.out.print("Is " + num1 + " divisible by " + num2 + " or " + num3 + " but not both" + "?"); 
       
       if (num1 % num2 == 0 ^ num1 % num3 == 0)
        System.out.println(" true");
       else
        System.out.println(" false");
       
       
    
    
    }
}
