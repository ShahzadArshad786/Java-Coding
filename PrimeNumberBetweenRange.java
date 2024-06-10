import java.util.Scanner;

public class PrimeNumberBetweenRange {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start , end,  factor  , i , j ; 
    
        System.out.print("Enter an Starting Number : ");
        start = sc.nextInt();

        System.out.print("Enter an Ending Number   : ");
        end = sc.nextInt();

        System.out.print("\nPrime Numbers between " + start  + " and " + end + " are : ");

        for( i = start; i <= end ; i++)
        {
            factor = 0 ; 
            for( j = 1 ; j <= i ; j++)
            {
                if( i % j == 0 )
                {
                    factor = factor + 1 ; 
                }
            }   
    
            if(factor == 2)
            {
               System.out.print( i + " ");
            }  
        }

        sc.close();
    }   
}
