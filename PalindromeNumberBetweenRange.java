import java.util.*;

public class PalindromeNumberBetweenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int start , end ,  digit , rev  ; 

        System.out.print("Enter Starting Number : ");
        start = sc.nextInt();

        System.out.print("Enter Ending Number   : ");
        end = sc.nextInt();
    
        System.out.print("\nPlaindrome Numbers Between " + start + " and " + end + " are : ");

        for(int i = start; i <= end ; i++)
        {
            rev = 0 ; 
    
            for( int j = i ; j !=0 ; j = j / 10)
            {
                digit = j % 10 ; 
                rev   = (rev * 10) + digit ;  
            }

            if(rev == i)
            {
            System.out.print(i + "  ");
            }
        }
        sc.close();   
    }
}
