import java.util.*;
public class FactorialWithLoop {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Any Positive Number : = ");
    int num = sc.nextInt();

    int fact = 1 ; 

    for(int i = 1 ; i <= num ; i++)
    {
        fact = fact * i ; 
    }

    System.out.print("\nFactorial of " + num + " is : " + fact);

    sc.close();
    }
    
}
