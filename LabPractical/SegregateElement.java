
	import java.util.Arrays;
	 
	class SegregateElement {
	    
	    static void segregateElements(int arr[], int n)
	    {
	          
	        int temp[] = new int[n];
	        int j = 0;  
	        for (int i = 0; i < n; i++)
	            if (arr[i] >= 0)
	                temp[j++] = arr[i];
	        if (j == n || j == 0)
	            return;
	 
	        for (int i = 0; i < n; i++)
	            if (arr[i] < 0)
	                temp[j++] = arr[i];
	        for (int i = 0; i < n; i++)
	            arr[i] = temp[i];
	    }
	     
	    public static void main(String arg[])
	    {
	        int arr[] = {16, -6, -3, 2, -8, 5, -12, 1 };
	        int n = arr.length;
	 
	        segregateElements(arr, n);
	 
	        for (int i = 0; i < n; i++)
	            System.out.print( arr[i] + " ");
	    }
	}