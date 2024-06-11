import java.util.*;
public class SingleOddNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num ; 

        System.out.print("Enter any Positive Number : ");
        num = sc.nextInt();

            if(num % 2 != 0)
            {
                System.out.print(num + " is a Odd Number");
            } 
            else 
            {
                System.out.print(num + " is Not a Odd Number");
            }
        sc.close();

    }
    
}
