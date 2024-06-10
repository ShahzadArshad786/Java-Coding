
import java.util.*;
class Factorial 
{

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      int num, fact = 1 ; 

      System.out.print("Enter an Positive Number : ");
      num = sc.nextInt();

      for(int i = 1 ; i <= num; i++)
      {
        fact = fact * i ; 
      }

      System.out.print("Factorial of" + num + " is : " + fact);
    }

}