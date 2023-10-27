import java.util.Scanner;
public class Array {

	public static void main(String[] args) 
	{
        System.out.println("Enter number of elements : ");
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int [] arr = new int[e];
              
                
        ArrayFunctions.acceptArray1D(arr);
        ArrayFunctions.display1D(arr);
       
	}

}

