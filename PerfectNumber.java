import java.util.*; 

public class PerfectNumber {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int num , sum = 0 ; 

        System.out.print("Enter Any Positive Number : ");
        num = sc.nextInt();

        for(int i = 1; i < num ; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i ; 
            } 
        }

        if(sum == num)
        {
            System.out.print("\n" + num + " is a Perfect Number");
        }

        else 
        {
            System.out.print("\n" + num + " is not a Perfect Number");
        }
            
        sc.close();
    }
    
}
