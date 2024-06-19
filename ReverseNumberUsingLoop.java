import java.util.*; 
public class ReverseNumberUsingLoop
{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter an Positive Number : ");
int num = sc.nextInt();

int rev = 0 ; 
int digit ; 
   
System.out.print("\nOriginal Number is : " + num + "\n\n");
    
 for ( int i = num ; i != 0 ; i = i / 10) 
 {
    digit = i % 10 ;
    rev = (rev * 10 ) + digit ; 
 }
 
 System.out.println("Reverse Number is  : " + rev); 

sc.close();

	}
}