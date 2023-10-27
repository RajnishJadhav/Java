import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) 
	{
		   System.out.println("Enter the number of rows : ");
		   Scanner sc = new Scanner(System.in);
		   int r=sc.nextInt();
		   
		   System.out.println("Enter the number of columns : ");
		   int c=sc.nextInt();
		   int [][] arr= new int[r][c];
		   
        ArrayFunctions.acceptArray2D(arr);
        ArrayFunctions.display2D(arr);
        
	}

}
