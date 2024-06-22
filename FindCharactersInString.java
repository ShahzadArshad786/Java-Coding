/*
    Write a Java Program that inputs a string and find the characters of string 
    using loop. 
*/
import java.util.Scanner;
public class FindCharactersInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str ; 
        int count = 0 ; 
        
        System.out.print("Enter Any String : ");
           
        str = sc.nextLine(); 
        
        int len = str.length();

        System.out.print("\nTotal Length of String is  : " + len); 
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++ ; 
            }
        }
        System.out.print("\n\nCharacters in a String are : " + count);
        sc.close();
    }
}
