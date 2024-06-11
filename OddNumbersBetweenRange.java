import java.util.Scanner;

public class OddNumbersBetweenRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start , end ; 

        System.out.print("Enter Starting Number For Range : ");
        start = sc.nextInt();

        System.out.print("Enter Ending Number For Range   : ");
        end = sc.nextInt();

        System.out.println("Odd Numbers between " + start  + " and " + end );

        for(int i = start ; i <= end ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + " ");
            }
            
        }
        sc.close() ;
    }
    
}
