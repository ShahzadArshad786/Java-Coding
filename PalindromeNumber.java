/* 
   Write a Java program to input any integer number and checks whether it is a number is a 
   palindrome or not. A palindrome is a number that reads the same backwards as forwards 
   such as 62526 and 4994. 
*/

import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int num , digit , rev = 0 ; 

        System.out.print("Enter any Positive Number : ");
        num = sc.nextInt();

        int n = num ; 

        for(int i = n; i != 0 ; i = i / 10)
        {
            digit = i % 10 ; 
            rev = (rev * 10) + digit ; 
        }

        if(num == rev)
        {
            System.out.print(n + " is a Plaindrome Number");
        }

        else 
        {
            System.out.print(n + " is not a Plaindrome Number");
        }  
        sc.close();
    }
}
