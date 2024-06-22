/*
    Write a Java Program that gets two numbers base and exponent from the 
    user and displays the result of first number raised to the power of 
    second number using for loop. 
*/

import java.util.Scanner;
public class PowerProgramUsingLoop {
    public static void main(String[] args) {
        
     int base, exp , pow = 1 ; 
     
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter Value For Base     : " ); 
     base = sc.nextInt();
     
     System.out.print("Enter Value For Exponent : " ); 
     exp = sc.nextInt();
     
    for(int i = 1 ; i <= exp ; i++)
    {
        pow = pow * base ;
    }
        
    System.out.print("\n"+base + " ^ " + exp + " is : " + pow ); 
    sc.close();

    } 
}
