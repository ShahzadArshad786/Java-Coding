import java.util.*;

public class PerfectNumberBetweenRange {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int start , end , sum , i , j ; 

        System.out.print("Enter Starting Number : ");
        start = sc.nextInt();

        System.out.print("Enter Ending Number   : ");
        end = sc.nextInt();

        System.out.print("\nPerfect Numbers Between " + start + " and " + end + " are : ");
        for( i = start ; i <= end ; i++)
        {
            sum = 0 ; 
            for( j = 1; j < i ; j++)
            {
                if(i % j == 0)
                {
                    sum = sum + j; 
                } 
            }

        if(sum == i)
        {
            System.out.print( i + "  " );
        }
    }
       
    sc.close();

    }  
}
