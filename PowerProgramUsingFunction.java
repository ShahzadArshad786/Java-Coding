/*
    Write a Java Program that inputs two numbers in main () and passes them 
    to a function. The function calculates the power of first number raised to the 
    power of second number, and return calculated power to the main() function. 
    For example if the user enters 2 and 4 it displays 16. 
*/

import java.util.Scanner;
public class PowerProgramUsingFunction {

     static int power( int base , int exp)
    {
        int pow = 1 ; 
        for(int i = 1 ; i <= exp ; i++)
        {
            pow = pow * base ;
        }
      
      return pow ;   
    }
    public static void main(String[] args) {
     int base, exp ; 
     
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter Value For Base     : " ); 
     base = sc.nextInt();
     
     System.out.print("Enter Value For Exponent : " ); 
     exp = sc.nextInt();
    
    System.out.print("\n"+base + " ^ " + exp + " is : " + (power(base, exp))); 
    sc.close();
    }
    
}
