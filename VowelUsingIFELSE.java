import java.util.*;
public class VowelUsingIFELSE {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character : ");
        char ch = sc.next().charAt(0);  
        
        if(ch =='A' || ch == 'a' || ch =='E' || ch == 'e' ||
           ch =='I' || ch == 'i' || ch =='O' || ch == 'o' ||
           ch == 'U' || ch == 'u' )
           {
            System.out.println(ch + " is a Vowel"); 
           }

           else 
           {
            System.out.println("Invalid Character");
           }
        sc.close();
    }
    
}
