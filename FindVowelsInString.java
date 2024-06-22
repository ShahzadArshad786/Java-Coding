/*
    Write a Java Program that inputs a string and find the total number of vowels in a 
     string using for loop. 
*/

import java.util.Scanner;
public class FindVowelsInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Input String : ");
        String str = sc.nextLine();

        int count = 0 ; 
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
               str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
               str.charAt(i) == 'U' || str.charAt(i) == 'a' ||
               str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'u')
               {
                   count++; 
               }
        }
	    System.out.println("\nInput String is  : " + str); 
		System.out.println("\nTotal Vowels in the String are : " + count);
        sc.close();
    }
}
