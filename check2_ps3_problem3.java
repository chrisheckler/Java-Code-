
/**
 * Christopher Heckler
 * 
 * Problem Set 3 # 3
 * 
 */
import java.util.*;
public class check2_ps3_problem3
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      int num;
      
      System.out.println("");
      System.out.print("(1-12): ");
      num = input.nextInt();
      
      switch(num)
      {
          case 1: 
            System.out.print("January: 31 days"); break;
          
          case 2:
            System.out.print("February: 29 days (sometimes 28)"); break;
            
          case 3: 
            System.out.print("March: 31 days"); break;
            
          case 4: 
            System.out.print("April: 30 days"); break;
            
          case 5: 
            System.out.print("May: 31 days"); break;
         
          case 6: 
            System.out.print("June: 30 days"); break;
            
          case 7: 
            System.out.print("July: 31 days"); break;
            
          case 8: 
            System.out.print("August: 31 days"); break;
            
          case 9: 
            System.out.print("September: 30 days"); break;
            
          case 10: 
            System.out.print("October: 31 days"); break;
            
          case 11: 
            System.out.print("November: 30 days"); break;
            
          case 12: 
            System.out.print("December: 31 days"); break;
            
          default:
            System.out.print("Invalid number");
            
          
          
        }
      
      
      
  }
}
