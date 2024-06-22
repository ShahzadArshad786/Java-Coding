/* 
   Write a Java Program that inputs a Positive Number as starting and ending 
   range. It then displays the sum of all odd numbers and sum of all even numbers 
   between given range. 
*/
import java.util.*;
public class SumOfEvenandOddNumbers {
    public static void main(String[] args) {
    
    int start , end ,  evensum = 0 , oddsum = 0 ; 

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Any Number For Starting Range : ");
    start = sc.nextInt();

    System.out.print("Enter Any Number For Ending   Range : ");
    end = sc.nextInt();

    for(int i = start ; i <= end ; i++)
    {
        if(i % 2 == 0)
        {
            evensum = evensum + i ; 
        }

        else 
        {
            oddsum = oddsum + i ; 
        }
    }

    System.out.println("\nSum of Even Numbers From " + start + " to " + end + " is : " + evensum);
    System.out.println("\nSum of Odd  Numbers From " + start + " to " + end + " is : " + oddsum);

    sc.close();
    }
}
