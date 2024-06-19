
import java.util.Scanner;

public class LeapYearBetweenRange {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int start_Year , end_Year , i ; 
    
        System.out.print("Enter Any Starting Year : ");
        start_Year = sc.nextInt();
    
        System.out.print("Enter Any Ending Year   : ");
        end_Year = sc.nextInt();

        System.out.print("\nLeap Years Between "+ start_Year + " and " + end_Year + " : \n");
        for( i = start_Year ; i <= end_Year ; i++)
        {
            if(i % 4 == 0)
            {
                System.out.println(i);
            } 
        }

    sc.close();

    }    
}
