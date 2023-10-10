import java.util.Scanner;
class QuickSort 
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
        			// Perform quick sort
        			quickSort(arr, 0, n - 1);

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

    	// Quick Sort function
    	static void quickSort(int[] arr, int l, int h) 
	{
        	if (l < h) 
		{
            		int piv = partition(arr, l, h);
            		quickSort(arr, l, piv - 1);
            		quickSort(arr, piv + 1, h);
        	}
    	}

    	// Partition function to select a pivot and rearrange elements
    	public static int partition(int[] arr, int l, int h) 
	{
        	int pivot = arr[h];
        	int i = l - 1;
        	for (int j = l; j < h; j++) 
		{
            		if (arr[j] <= pivot) 
			{
                		i++;
                		int temp = arr[i];
                		arr[i] = arr[j];
               			arr[j] = temp;
            		}
        	}
        	int temp = arr[i + 1];
        	arr[i + 1] = arr[h];
        	arr[h] = temp;	
        	return i + 1;
    	}
}
