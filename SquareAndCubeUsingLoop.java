/*
    Write a Java Program that inputs a Number and prints Number, Square 
    and Cube till input number using for loop. 
*/

import java.util.Scanner; 
public class SquareAndCubeUsingLoop {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int num; 

    System.out.print("Enter Any Positive Number : ");
    num = sc.nextInt();

    System.out.println("Number\tSquare\tCube");

    for(int i = 1 ;  i <= num ;  i++)
    {
        System.out.println(i + "\t"+ i * i + "\t" + i * i * i);
    }

    sc.close(); 
}
    
}
