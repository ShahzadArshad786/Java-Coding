import java.util.*;
public class ReverseNumberUsingFunction {

    int rev = 0 ; 
    int digit ; 
    
public void Reverse(int n)
{
    System.out.print("\nOriginal Number is : " + n + "\n\n");
     
  for( int i = n ; i != 0 ; i = i / 10) 
  {
     digit = i % 10 ;
     rev = (rev * 10 ) + digit ; 
  }
  
  System.out.println("Reverse Number is  : " + rev); 
 
}
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any Number : ");
    int num = sc.nextInt();

    ReverseNumberUsingFunction obj = new ReverseNumberUsingFunction();

    obj.Reverse(num);

    sc.close();

    }
}
