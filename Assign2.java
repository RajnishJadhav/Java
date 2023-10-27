import java.util.Scanner;
public class Assign2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for adding two array : ");
		System.out.println("Enter 2 for transposing array :");
		System.out.println("Enter 3 for minimum number from 2D Array :");
		System.out.println("Enter 4 for maximum number from 2D Array :");
		System.out.println("Enter 5 for displaying an array :");
		System.out.println("Enter 6 for checking a particular number how many times in an 2D array");
		System.out.println("Enter 7 to Exit");
		System.out.println("Enter 8 to go to back page");
		boolean flag =false;
		int opt = sc.nextInt();

do {
		switch(opt)
		{
		case 1:
		{
            int [][] arr=new int[3][3];
            int [][] arr1=new int[3][3];
            ArrayFunctions.acceptArray2D(arr);
            ArrayFunctions.acceptArray2D(arr1);
            ArrayFunctions.sum2Array2D(arr, arr1);  
            flag=true;
            break;
		}
		case 2:
		{
            int [][] arr=new int[3][3];
            ArrayFunctions.acceptArray2D(arr);
            ArrayFunctions.display2D(arr);
            ArrayFunctions.transpose(arr);
            System.out.println();
            ArrayFunctions.display2D(arr);
            flag=true;
            break;
		}
		case 3:
		{
            int [][] arr=new int[3][3];
            ArrayFunctions.acceptArray2D(arr);
            ArrayFunctions.display2D(arr);
            ArrayFunctions.min2D(arr);
            flag=true;
            break;
		}
		case 4:
		{
			int [][] arr=new int[3][3];
            ArrayFunctions.acceptArray2D(arr);
            ArrayFunctions.display2D(arr);
            ArrayFunctions.max2D(arr);
            flag=true;
            break;
		}
		case 5:
		{
			int [][] arr=new int[3][3];
            ArrayFunctions.acceptArray2D(arr);
            ArrayFunctions.display2D(arr);	
            flag=true;
            break;
		}
		case 6:
		{
			System.out.println("Not ready yet !!");
			flag=true;
            break;
		}
		case 7:
		{
			flag=false;
			System.exit(0);
		}
		default:
		  {
			System.out.println("Enter valid option");
			break;
		  }
		}
}while(flag=false);
	
	}

}
