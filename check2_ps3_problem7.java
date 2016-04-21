
/**
 *Christopher Heckler
 *
 *Problem set 3 #7
 *
 */
import java.util.*;
public class check2_ps3_problem7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double wght;
        int plnt;
        
        System.out.println("1: Mercury");
        System.out.println("2: Venus");
        System.out.println("3: Earth");
        System.out.println("4: Mars");
        System.out.println("5: Jupiter");
        System.out.println("6: Saturn");
        System.out.println("7: Uranus");
        System.out.println("8: Neptune");
        System.out.println("9: Pluto");
        System.out.println("");
        
        System.out.println("Select a planet number from above.");
        System.out.print("> ");
        System.out.print("");
        plnt = input.nextInt();
        
        System.out.println("Enter your weight in pounds.");
        System.out.print("> ");
        wght = input.nextDouble();
       
        
        switch (plnt)
        {
            case 1:
                double mcry = ((3.724/9.8) * wght);
                System.out.print("Your weight on " + "Mercury " + "is " + mcry);
                break;
            
            case 2:
                double vens = ((8.918/9.8) * wght);
                System.out.print("Your weight on " + "Venus " + "is " + vens);
                break;
                
            case 3:
                double erth = ((9.8/9.8) * wght);
                System.out.print("Your weight on " + "Earth " + "is " + erth);
                break;
                
            case 4:
                double mars = ((3.724/9.8) * wght);
                System.out.print("Your weight on " + "Mars " + "is " + mars);
                break;
                
            case 5:
                double juptr = ((24.892/9.8) * wght);
                System.out.print("Your weight on " + "Jupiter " + "is " + juptr);
                break;
                
            case 6:
                double satn = ((10.584/9.8) * wght);
                System.out.print("Your weight on " + "Saturn " + "is " + satn);
                break;
                
            case 7:
                double urns = ((8.918/9.8) * wght);
                System.out.print("Your weight on " + "Uranus " + "is " + urns);
                break;
                
            case 8:
                double neptn = ((11.662/9.8) * wght);
                System.out.print("Your weight on " + "Neptune " + "is " + neptn);
                break;
                
            case 9:
                double plto = ((1.622/9.8) * wght);
                System.out.print("Your weight on " + "Pluto " + "is " + plto);
                break;
                
            default: 
                System.out.print("Error, Planet must be in our Solar System!");
                break;
        }
    }
}
