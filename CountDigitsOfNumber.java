/*
    Write a Program using Java that inputs any positive integer, count the total number of 
    Digits in the given integer using loop. 
 */

import java.util.*;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num , count = 0 ; 

        System.out.print("Enter Any Positive Number : ");
        num = sc.nextInt();

        for( int i = num ; i != 0 ; i = i / 10 )
        {
            
            count = count + 1 ; 
        }
        System.out.print("\nYou Entered Number : " + num); 
        System.out.print("\n\nTotal Digits of a " + num + " are : " + count);
           
        sc.close();    
    }
}
