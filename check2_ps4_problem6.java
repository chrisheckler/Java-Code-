
/**
 * Christopher Heckler
 * 
 * Problem set 4 #6 
 **/
import java.util.*;
public class check2_ps4_problem6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int k;
        
        System.out.print("Enter a wrap: ");
        String wrap = in.next();
        
        System.out.print("Enter second word: ");
        String word = in.next();
        
        k = wrap.length()/2;
        
        System.out.println(wrap.substring(0, k) + word + wrap.substring(k, wrap.length()));
        
        
        
    }
}
