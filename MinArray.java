
public class MinArray {

	public static void main(String[] args) 
	{
        int [] arr = new int [3];
        ArrayFunctions.acceptArray1D(arr);
        ArrayFunctions.min1D(arr);
        
        int [][] arr1 = new int [3][3];
        ArrayFunctions.acceptArray2D(arr1);
        ArrayFunctions.display2D(arr1);
        ArrayFunctions.min2D(arr1);
	}

}
