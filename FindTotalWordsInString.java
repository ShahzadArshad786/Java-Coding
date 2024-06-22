/*
    Write a Java Program that inputs a string and find the total number words in 
    the string using for loop. 
*/

import java.util.Scanner;
public class FindTotalWordsInString {
    public static void main(String[] args) 
	{
	    Scanner sc  = new Scanner(System.in);
	    
        System.out.print("Please Input String : ");
        String str = sc.nextLine();

        int words = 0 ; 
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == ' ' || str.charAt(i) == '\0')
               {
                   words++; 
               }       
        }  
	    System.out.println("\nInput String is  : " + str); 
		System.out.println("\nTotal Number of Words in the String : " + (words + 1));
        sc.close();
	}
}
