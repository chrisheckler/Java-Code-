
/**
 * Christopher Heckler
 * Problem Set 3 #5
 *  
 * 
 **/
import java.util.*;
public class check2_ps3_problem5
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       double num1;
       double num2;
       double num3;
      
       System.out.print("Number 1: ");
       num1 = input.nextDouble();
       
       System.out.print("Number 2: ");
       num2 = input.nextDouble();
       
       System.out.print("Number 3: ");
       num3 = input.nextDouble();
       
       if (num1 >= num2 && num1 >= num3)
        System.out.println(num1);
       else if (num2 >= num1 && num2 >= num3)
        System.out.println(num2); 
       else if (num3 >= num2 && num3 >= num1)
        System.out.println(num3);
    
        
       if (num1 > num2 && num1 <= num3)
        System.out.println(num1);
       else if (num1 >= num3 && num1 <= num2)
        System.out.println(num1);  
       else if (num2 >= num1 && num2 <= num3)
        System.out.println(num2); 
       else if (num2 >= num3 && num2 <= num1)
        System.out.println(num2); 
       else if (num3 >= num1 && num3 <= num2)
        System.out.println(num3); 
       else if (num3 >= num2 && num3 <= num1)
        System.out.println(num3); 
      
        
        
        
       if (num3 <= num2 && num3 <= num1)
        System.out.println(num3);
       else if (num2 <= num1 && num2 <= num3)
        System.out.println(num2); 
       else if (num1 <= num3 && num1 <= num2)
        System.out.println(num1); 
    }
}
