/* Write a Java program to input any integer number and check whether a number is a Perfect or not.
   A perfect number is a number that is numerically equal to the sum of its divisors exculsing  number itself.
   For example, 6 is a perfect number because the divisors of 6 are 1, 2, 3 and 
   1 + 2 + 3 = 6. 
*/

import java.util.*; 
public class PerfectNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int num , sum = 0 ; 

        System.out.print("Enter Any Positive Number : ");
        num = sc.nextInt();

        for(int i = 1; i < num ; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i ; 
            } 
        }
        if(sum == num)
        {
            System.out.print("\n" + num + " is a Perfect Number");
        }
        else 
        {
            System.out.print("\n" + num + " is not a Perfect Number");
        }
        sc.close();
    }
}
