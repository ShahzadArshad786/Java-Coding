
import java.util.*;
public class ReverseNumber5Digits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num , a , a1, b, b1 , c, c1 , d , e , rev ; 

        System.out.print("Enter any 3-Digit Number : ");
        num = sc.nextInt();

        // check number is 3-digit or not 
        if(num  < 10000 || num > 99999)
            {
                System.out.print(num + " is a Invalid Number");
            } 
        else 
            {
                a = num / 10000 ; 
                a1 = num % 10000 ; 
                b = a1 / 1000 ; 
                b1 = a1 % 1000 ;
                c =  b1 / 100 ; 
                c1 = b1 % 100 ; 
                d = c1 / 10 ; 
                e = c1 % 10 ; 

       
             // 1st Method calculate and print reverse number 
       
               rev = (e*10000) + (d * 1000) + (c*100) + (b*10) + a ; 
       
               System.out.print("Original Number is : " + num);
               System.out.print("\n\nReverse Number is  : " + rev);
       
               // Print Reverse Number using Direct Method
               System.out.print("\nReverse Number is  : " + e + d + c + b + a);
            }
        sc.close();

    }
    
}
