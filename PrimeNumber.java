/* 
   Write a Program using Java that inputs any positive integer and checks whether it 
   is a prime or not using for loop. 
*/

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int num , factor = 0  ; 
    
        System.out.print("Enter an Positive Number : ");
        num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                factor = factor + 1 ; 
            }
        }   

        if(factor == 2)
        {
           System.out.print( num + " is a Prime Number");
        }  
        
        else 
        {
           System.out.print(num + " is not a Prime Number");
        } 
        sc.close() ;
    }
}

