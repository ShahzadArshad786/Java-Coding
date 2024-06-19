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
