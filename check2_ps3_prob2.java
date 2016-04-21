
/**
 * Christopher Heckler
 * Problem Set 3 # 2
 *  
 *
 */
import java.util.*;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
public class check2_ps3_prob2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            SecureRandom num = SecureRandom.getInstance("SHA1PRNG");
            
            int rNum1;
            int rNum2;
            int rNum3;
            
            int Ans; 
            int realAns;
            
            rNum1 = num.nextInt(10);
            rNum2 = num.nextInt(10);
            rNum3 = num.nextInt(10);
            
            realAns = rNum1 + rNum2 + rNum3;
            
            System.out.println("");
            System.out.print(rNum1 + " + " + rNum2 + " + " + rNum3 + " = ");
            Ans = input.nextInt();
        
            if (Ans == realAns)
                System.out.println("CORRECT");
            
            else
                System.out.println("INCORRECT.  SUM IS " + realAns);    
    
        }
        catch (NoSuchAlgorithmException nsae)
        {
        }
}
}