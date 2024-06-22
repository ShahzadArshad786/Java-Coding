/* 
   Write a Program using Java that inputs an Integer Number and passes the 
   Number to a function, that calculates the Factorial of a input number 
   and prints the Factorial of a Number. 
*/
import java.util.*;

public class FactorialWithFunction {

    static void Factorial(int n)
    {
        int fact = 1 ; 
        for(int i = 1 ; i <= n ; i++)
        {
            fact = fact * i ; 
        }

        System.out.print("\nFactorial of " + n + " is : " + fact);
    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Any Positive Number : = ");
    int num = sc.nextInt();

    Factorial(num);
    sc.close();

   }
}
