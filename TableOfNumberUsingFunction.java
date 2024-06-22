/*
    Write a Java Program that inputs a number from the user and passes the 
    number to a Table() function then it displays a table of that number using 
    for loop. 
*/

import java.util.Scanner;
public class TableOfNumberUsingFunction {
    
    static void Table(int n)
    {
        System.out.println("\nTable of a " + n + " is : \n");

        for(int i = 1 ; i <= 10 ; i++)
        {   
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num ; 

    System.out.print("Enter Any Positive Number : ");
    num = sc.nextInt();

    Table(num);
    sc.close();

    }
}
