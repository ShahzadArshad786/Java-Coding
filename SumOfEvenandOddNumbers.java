import java.util.*;

public class SumOfEvenandOddNumbers {
    public static void main(String[] args) {
    
    int num , evensum = 0 , oddsum = 0 ; 

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Limit : ");
    num = sc.nextInt();

    for(int i = 1 ; i <= num ; i++)
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

    System.out.println("\nSum of Even Numbers From 1 to " + num + " is : " + evensum);
    System.out.println("\nSum of Odd  Numbers From 1 to " + num + " is : " + oddsum);

    sc.close();
    }
}
