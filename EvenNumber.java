
import java.util.*;
public class EvenNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start , end ; 

        System.out.print("Enter Starting Number For Range : ");
        start = sc.nextInt();


        System.out.print("Enter Ending Number For Range   : ");
        end = sc.nextInt();

        System.out.println("Print All Even Number between " + start  + " and " + end );

        for(int i = start ; i <= end ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
            
        }
    }
    
}
