/*
    Write a Program using Java that inputs any positive integer and checks whether 
    it is an Even or not using IF-Else Structure. 
 */

import java.util.*;
public class SingleEvenNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num ; 

        System.out.print("Enter any Positive Number : ");
        num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.print(num + " is a Even Number");
        } 
        else 
        {
            System.out.print(num + " is Not a Even Number");
        }
        sc.close();
    }
}
