
/**
 * Christopher Heckler
 * 
 * Problem set 3 #6
 * 
 * 
 */
import java.util.*;


public class check2_ps3_problem6
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
      
       int dice;
       int sides;
       int roll;
       
       System.out.print("Enter the number of sides: ");
       sides = input.nextInt();
       
      
       
       dice = (int) Math.ceil(Math.random() * sides);
       
       
       if (sides <= 0)
        System.out.println("Invalid dice");
       else if (dice == 1)
        System.out.println("CRITICAL MISS");
       else if (dice == sides)
        System.out.println("CRITICAL HIT");
       else
        System.out.print(dice);
        
      
    }
}
