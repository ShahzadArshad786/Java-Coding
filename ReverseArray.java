import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in); 
    
    int size ; 
    
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
    }
	
	System.out.print("\n\nArray in Reverse  Order is : " ); 
	
	for( int i = length - 1 ; i >=0 ; i--)
	{
	    System.out.print(arr[i] + " "); 
	}
    sc.close();
    }
    
}
