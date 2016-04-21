
/**
 * Christopher Heckler
 * 
 * Problem set 4 #5 
 **/
 
import java.util.*;
public class check2_ps4_problem5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String set1 = in.next();
        
        System.out.print("Enter second string: ");
        String set2 = in.next();
        
        if (set1.contains(set2))
        {
            System.out.println(set2 + " is a substring of " + set1);
        }
        
        
    }
}
