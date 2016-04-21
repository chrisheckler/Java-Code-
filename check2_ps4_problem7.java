
/**
 * Christopher Heckler
 * 
 * Problem set 4 #7 
 **/
import java.util.*;
public class check2_ps4_problem7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter the first character's name: ");
        String char1 = in.nextLine();
        
        System.out.print("Enter the second character's name: ");
        String char2 = in.nextLine();
        
        System.out.print("Enter the third character's name: ");
        String char3 = in.nextLine();
        
        if (char1.compareTo(char2) > 0 && char1.compareTo(char3) > 0 )
        {
            System.out.print(char1 + ", ");
        }
        
        else if (char2.compareTo(char3) > 0 && char2.compareTo(char1) > 0)
        {
            System.out.print(char2 + ", ");
        }
        
        else if (char3.compareTo(char1) > 0 && char3.compareTo(char2) > 0)
        {
            System.out.print(char3 + ", ");
        }
        
        
        if (char1.compareTo(char2) > 0 && char1.compareTo(char3) < 0 )
        {
            System.out.print(char1 + ", ");
        }
        
        else if (char2.compareTo(char3) > 0 && char2.compareTo(char1) < 0)
        {
            System.out.print(char2 + ", ");
        }
        
        else if (char3.compareTo(char1) > 0 && char3.compareTo(char2) < 0)
        {
            System.out.print(char3 + ", ");
        }
        if (char1.compareTo(char2) < 0 && char1.compareTo(char3) < 0 )
        {
            System.out.print(char1 + ", ");
        }
        
        else if (char2.compareTo(char3) < 0 && char2.compareTo(char1) < 0)
        {
            System.out.print(char2 + ", ");
        }
        
        else if (char3.compareTo(char1) < 0 && char3.compareTo(char2) < 0)
        {
            System.out.print(char3 + ", ");
        }
    }
}
