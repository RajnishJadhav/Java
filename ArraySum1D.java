import java.util.Scanner;
public class ArraySum1D {

	public static void main(String[] args) 
	{
         int [] arr= new int[3];
         int [] arr1=new int[3];
         
         ArrayFunctions.acceptArray1D(arr);
         ArrayFunctions.display1D(arr);
         ArrayFunctions.acceptArray1D(arr1);
         ArrayFunctions.display1D(arr1);
         ArrayFunctions.sum2Array1D(arr,arr1);      
	}

}
