
public class ArrayTranspose {

	public static void main(String[] args) 
	{
         int [][] arr = new int[3][3];
         
         ArrayFunctions.acceptArray2D(arr);
         ArrayFunctions.display2D(arr);
         ArrayFunctions.transpose(arr);
         System.out.println();
         ArrayFunctions.display2D(arr);
	}

}
