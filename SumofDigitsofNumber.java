import java.util.Scanner; 

public class SumofDigitsofNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int num , digit , sum = 0 ; 
    
        System.out.print("Enter Any Positive Number : ");
        num = sc.nextInt();
    
        for(int i = num;  i != 0 ;  i = i / 10)
        {
             digit = i % 10 ; 
             sum = sum + digit ; 
        }
    
        System.out.println("\nSum of Digits of " + num + " is : " + sum );
        sc.close(); 
    }
}
