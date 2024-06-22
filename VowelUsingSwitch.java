/* 
   Write a Java Program that inputs any single character using keyboard and 
   checks whether it is a vowel or not using switch Structure. 
*/

import java.util.*;
public class VowelUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Any Character : ");
        char ch = sc.next().charAt(0);  
        
        switch(ch)
        {
            case 'A':
            case 'a':
            System.out.println(ch + " is a Vowel"); 
            break; 

            case 'E':
            case 'e':
            System.out.println(ch + " is a Vowel"); 
            break; 

            case 'I':
            case 'i':
            System.out.println(ch + " is a Vowel"); 
            break; 

            case 'O':
            case 'o':
            System.out.println(ch + " is a Vowel"); 
            break; 

            case 'U':
            case 'u':
            System.out.println(ch + " is a Vowel"); 
            break; 

            default:
            System.out.println("Invalid Character");
        }
        sc.close();
    }  
}
