
/**
 * Christopher Heckler
 * Problem Set 3 # 1
 * 
 * 
 **/
import java.util.*;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class check2_ps3_problem1
{
   public static void main(String[] args)
   {
       try
       {
           SecureRandom num = SecureRandom.getInstance("SHA1PRNG");
           Scanner input = new Scanner(System.in);
       
           int guess;
           int ball;
           ball = num.nextInt(5) + 1;
       
           System.out.println("Which cup is the ball in?");
           System.out.println("1  2  3  4  5");
           System.out.println("C  C  C  C  C");
           System.out.print(">> ");
           guess = input.nextInt();
       
           if (guess == ball)
            System.out.print("CORRECT");
        
           else
            System.out.print("BALL WAS IN CUP " + ball);
        }  
       catch (NoSuchAlgorithmException nsae)
        {
        }
           
       
       
       
       
    }
}
