
public class ArraySum2D {

	public static void main(String[] args) 
	{
        int [][] arr= new int[3][3];
        int [][] arr1= new int[3][3];
        
        ArrayFunctions.acceptArray2D(arr);
        ArrayFunctions.display2D(arr);
//        ArrayFunctions.acceptArray2D(arr1);
//        ArrayFunctions.display2D(arr1);
//        ArrayFunctions.sum2Array2D(arr,arr1);
     //   ArrayFunctions.sumArray2DRow(arr);
        ArrayFunctions.sumArray2DColumn(arr);
   
	}

}
