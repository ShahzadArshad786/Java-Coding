import java.util.*;

public class FactorialWithFunction {

    int fact = 1 ; 
    public void Factorial(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            fact = fact * i ; 
        }

        System.out.print("\nFactorial of " + n + " is : " + fact);
    }
    public static void main(String[] args) {
        
    FactorialWithFunction fact = new FactorialWithFunction();

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Any Positive Number : = ");
    int num = sc.nextInt();

    fact.Factorial(num);

    sc.close();

    }
    
}
