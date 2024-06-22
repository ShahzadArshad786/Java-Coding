/*
    Write a Java Program that inputs a string and find the length of string. 
*/

import java.util.*;
public class FindLengthOfString {
    public static void main(String[] args) {
       
        String str ; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Any String : ");
           
        str = sc.nextLine(); 
        
        int len = str.length();

        System.out.print("\nLength of String is : " + len);   
        sc.close();
    } 
}
