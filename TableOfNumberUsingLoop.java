import java.util.Scanner;

public class TableOfNumberUsingLoop {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num ; 

    System.out.print("Enter Any Positive Number : ");
    num = sc.nextInt();

    System.out.println("\nTable of a " + num + " is : \n");

    for(int i = 1 ; i <= 10 ; i++)
    {   
        System.out.println(num + " x " + i + " = " + num * i);

    }
    sc.close();
    }
    
}
