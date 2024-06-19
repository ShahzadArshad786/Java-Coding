import java.util.Scanner;

public class TableOfNumberUsingFunction {
    
    public void Table(int n)
    {
        System.out.println("\nTable of a " + n + " is : \n");

    for(int i = 1 ; i <= 10 ; i++)
    {   
        System.out.println(n + " x " + i + " = " + n * i);
    }
    }
    public static void main(String[] args) {
    
    TableOfNumberUsingFunction obj = new TableOfNumberUsingFunction();

    Scanner sc = new Scanner(System.in);

    int num ; 

    System.out.print("Enter Any Positive Number : ");
    num = sc.nextInt();

    obj.Table(num);
    sc.close();

    }
}
