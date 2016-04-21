
/**
 * Christopher Heckler
 * 
 * Problem set 4 #2
 * 
 */
import java.util.*;
public class check2_ps4_problem2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String ltrs = "";
        String endltr = "";
        char itm1;
        char itm2;
        char itm3;
        
        

        System.out.print("Enter three letters: ");
        ltrs = in.next();
        
        itm1 = ltrs.charAt(0);
        itm2 = ltrs.charAt(1);
        itm3 = ltrs.charAt(2);
        
        if (Character.isUpperCase(itm1))
        {
            itm1 = Character.toLowerCase(itm1);
        }
        else if (Character.isLowerCase(itm1))
        {
            itm1 = Character.toUpperCase(itm1);
        }
        
        
        if (Character.isUpperCase(itm2))
        {
            itm2 = Character.toLowerCase(itm2);
        }
        else if (Character.isLowerCase(itm2))
        {
            itm2 = Character.toUpperCase(itm2);
        }
        
        
        if (Character.isUpperCase(itm3))
        {
            itm3 = Character.toLowerCase(itm3);
        }
        else if (Character.isLowerCase(itm3))
        {
            itm3 = Character.toUpperCase(itm3);
        }
        
        endltr = itm1 + "" + itm2 + "" + itm3 + "";
        System.out.print(endltr);
    }
}
