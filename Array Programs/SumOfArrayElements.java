import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    
    int size , sum = 0 ; 
    
    System.out.print("Enter Size of Array : ");
    size = sc.nextInt();
    
    int[] arr = new int [size]; 
    
    int length = arr.length; 
    
    System.out.println();

    for (int i = 0 ; i < length ; i++)
    {
        System.out.print("Enter Element at Index Arr["+i+"] : ");
        arr[i] = sc.nextInt(); 
    }

    System.out.print("\nArray in Original Order is : " );
    for(int i = 0 ; i < length ; i ++)
    {
        System.out.print(arr[i] + " ");
        sum = sum + arr[i]; 
    }
	
	System.out.print("\n\nSum of Array Elements are  : " + sum); 
	sc.close();
    }
}
