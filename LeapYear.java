import java.util.*;

public class LeapYear {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
    int year ; 

    System.out.print("Enter Any Year : ");
    year = sc.nextInt();

    if(year % 4 == 0)
    {
        System.out.println("\n"+ year + " is a Leap Year");
    } 
    else 
    {
    System.out.println("\n"+year + " is Not a Leap Year");
    }
        sc.close();

    }   
}
