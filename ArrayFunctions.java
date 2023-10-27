import java.util.Scanner;

public class ArrayFunctions 
{

   
   
   public static void acceptArray1D(int [] arr)
   {
	   Scanner sc = new Scanner(System.in);
	   
       for(int i=0;i<arr.length;i++)
       {
       	System.out.println("Enter number for "+i+" array : ");
       	arr[i]=sc.nextInt();
       }
   }
   
   public static void display1D(int [] arr)
   {
       for(int i=0;i<arr.length;i++) 	   
       {
       	System.out.print(arr[i]);
       }
   }
   
   public static void acceptArray2D(int [][] arr)
   {
	   Scanner sc = new Scanner(System.in);
       for(int i=0; i<arr.length;i++)
       {
       	for(int j=0;j<arr[0].length;j++)
       	{
       		System.out.println("Enter value for "+i+" : "+j);
       		arr[i][j]=sc.nextInt();
       	}
       }
   }
   
   public static void display2D(int [][] arr)
   {
       for(int i=0; i<arr.length;i++)
       {
       	for(int j=0;j<arr[0].length;j++)
       	{
       		System.out.print(arr[i][j]+"\t");
       	}
       	System.out.println();
       }
   }
   
   public static void sumArray1D(int [] arr)
   {
 	   int sum=0;
       for(int i=0;i<arr.length;i++)
       {
      	 sum=sum+arr[i];	 
       }
       System.out.println("Sum of array is : "+sum);
   }
   
   public static void sum2Array1D(int [] arr,int [] arr1)
   {
	   int sum =0;
       for(int i=0;i<arr.length;i++)
       {
      	 sum=sum+arr[i]+arr1[i];	 
       }
       System.out.println("Sum of array is : "+sum);
   }
   
   public static void sumArray2D(int [][] arr)
   {
	   int sum =0;
       for(int i=0; i<arr.length;i++)
       {
       	for(int j=0;j<arr[0].length;j++)
       	{
       		sum=sum+arr[i][j];
       	}
       	
       }
       System.out.println("Sum of 2D Array is : "+sum);
   }
   
   
   public static void sumArray2DRow(int [][] arr)
   {
	  
       for(int i=0; i<arr.length;i++)
       {
    	   int sum =0;
       	for(int j=0;j<arr[0].length;j++)
       	{
       		sum=sum+arr[i][j];
       	}
       	System.out.println("Sum of 2D Array is : "+sum);
       }
       
   }
   
   public static void sumArray2DColumn(int [][] arr)
   {
	  
       for(int i=0; i<arr[0].length;i++)
       {
    	   int sum =0;
       	for(int j=0;j<arr.length;j++)
       	{
       		sum=sum+arr[j][i];
       	}
       	System.out.println("Sum of 2D Array is : "+sum);
       }
       
   }
   
   public static void sum2Array2D(int [][] arr,int [][] arr1)
   {
	   int sum =0;
       for(int i=0; i<arr.length;i++)
       {
       	for(int j=0;j<arr[0].length;j++)
       	{
       		sum=sum+arr[i][j]+arr1[i][j];
       	}
       	
       }
       System.out.println("Sum of 2D Array is : "+sum);
   }
   
   public static void min1D(int [] arr)
   {
	   int minimum = arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]<minimum)
		   {
			   minimum=arr[i];
		   }
	   }
	   System.out.println("Minimum value of the array is : "+minimum);
   }
   
   public static void min2D(int [][] arr)
   {
	   int minimum = arr[0][0];
	   for(int i=0;i<arr.length;i++)
	   {
		  for(int j=0;j<arr[0].length;j++)
		  {
			  if(arr[i][j]<minimum)
			   {
				   minimum=arr[i][j];
			   }
		  }
	   }
	   System.out.println("Minimum value of the 2D Array is : "+minimum);
   }
   
   public static void max1D(int [] arr)
   {
	   int maximum = arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]>maximum)
		   {
			   maximum=arr[i];
		   }
	   }
	   System.out.println("Maximum value of the array is : "+maximum);
   }
   
   public static void max2D(int [][] arr)
   {
	   int maximum = arr[0][0];
	   for(int i=0;i<arr.length;i++)
	   {
		  for(int j=0;j<arr[0].length;j++)
		  {
			  if(arr[i][j]>maximum)
			   {
				   maximum=arr[i][j];
			   }
		  }
	   }
	   System.out.println("Maximum value of the 2D Array is : "+maximum);
   }
   
   public static void search(int [] arr)
   {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a value to be searched : ");
       int searchVal=sc.nextInt();
       boolean flag=false;
       int i=0;
       for(;i<arr.length;i++)
       {
       	if(arr[i]==searchVal)
       	{
       		flag=true;
       		break;

       	}
     
       	
       }
       
       if(flag) {
    	   System.out.println("Element found : "+arr[i]);
       }else {
    	   System.out.println("Element not found ");
       }
   }
   
   public static void transpose(int [][] arr)
   {
       for(int i=0;i<arr.length;i++)
       {
      	 for(int j=i+1;j<arr[0].length;j++)
      	 {
      		 if(i != j)
      		 {
      			 int temp = arr[i][j];
      			 arr[i][j]=arr[j][i];
      			 arr[j][i]=temp;
      		 }
      	 }
       }
   }
   
   public static void appear(int[][] arr) {
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[0].length;j++) {
				  countOfNum(arr,arr[i][j]);
			  }
		  }
		  
	  }
	  public static void countOfNum(int[][] arr,int ans) {
		  int count=0;
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr.length;j++) {
				  if(arr[i][j]==ans) {
					  count++;
				  }
			  }
		  }
		  
		  
	  }
   
}
