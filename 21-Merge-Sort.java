import java.util.Scanner;
class MergeSort 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

        	// Input: Read the array size and elements from the user
        	System.out.print("Enter the number of elements: ");
        	int n = input.nextInt();
		if(n>0)
		{
        		int[] arr = new int[n];
        		System.out.println("Enter the elements:");
        		for (int i = 0; i < n; i++) 
			{
            			arr[i] = input.nextInt();
        		}

            		// Check if the array is already sorted
            		boolean isSorted = true;
            		for (int i = 1; i < n; i++) 
			{
                		if (arr[i] < arr[i - 1]) 
				{
                    			isSorted = false;
                    			break;
                		}
            		}

			if (isSorted) 
			{
                		System.out.println("The input array is already sorted.");
            		} 
			else
			{
        			// Perform merge sort
        			mergeSort(arr, 0, n - 1);

        			// Output: Display the sorted array
        			System.out.println("Sorted array in ascending order:");
        			for (int i = 0; i < n; i++) 
				{
            				System.out.print(arr[i] + " ");
        			}
			}
		}	
		else
		{
			System.out.println(" !! Enter a positive number of elements !!");
		}
    	}

    	// Merge Sort function
    	static void mergeSort(int[] arr, int l, int r) 
	{
        	if (l < r) 
		{
            		int mid = (l + r) / 2;
            		mergeSort(arr, l, mid);
            		mergeSort(arr, mid + 1, r);
            		merge(arr, l, mid, r);
        	}
    	}

    	// Merge function to combine two sorted subarrays
    	static void merge(int[] arr, int l, int mid, int r) 
	{
        	int n1 = mid - l + 1;
        	int n2 = r - mid;

        	int[] lArr = new int[n1];
        	int[] rArr = new int[n2];

        	for (int i = 0; i < n1; i++) 
		{
            		lArr[i] = arr[l + i];
        	}
        	for (int j = 0; j < n2; j++) 
		{
            		rArr[j] = arr[mid + 1 + j];
        	}

        	int i = 0, j = 0;
        	int k = l;
        	while (i < n1 && j < n2) 
		{
            		if (lArr[i] <= rArr[j]) 
			{
                		arr[k] = lArr[i];
                		i++;
            		} 
			else 
			{
                		arr[k] = rArr[j];
                		j++;
            		}
            		k++;
        	}

        	while (i < n1) 
		{
            		arr[k] = lArr[i];
            		i++;
            		k++;
        	}

        	while (j < n2) 
		{
            		arr[k] = rArr[j];
            		j++;
           		k++;
        	}
    	}
}
