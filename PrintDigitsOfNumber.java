import java.util.*; 

public class PrintDigitsOfNumber {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int num , i = 0 , k = 1 ; 

        System.out.print("Enter Any Positive Number : ");
        num = sc.nextInt();
        int n = num ;

        int[] arr = new int[10];

        while( num != 0 ) 
        {
            int digit = num % 10 ; 
            arr[i] = digit; 
            num = num / 10 ;
            i++;
               
        }
    System.out.println("\nYou Entered Number : " + n);
    System.out.println("\nDigits of a " + n + " are : \n" );

    for(int j = i - 1 ; j >= 0 ; j--)
    {
        System.out.println("Digit " + k + " : " + arr[j]);
        k++ ; 
    }
        sc.close(); 
    }   
}
