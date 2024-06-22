/* 
   Write a Program using Java that inputs any integer number and print all factors 
   of that number. 
*/

import java.util.*;
public class FactorsofNumber {
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an Integer Number : ");
    int num = sc.nextInt();

    System.out.print("\nFactors of a " + num + " are : ");
    for(int i = 1 ; i <=num ; i++)
    {
        if(num % i == 0)
        {
            System.out.print(i + " ");
        }
    }
        sc.close();
    }
}
