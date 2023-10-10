import java.util.Scanner;
class InsertionSort 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
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
                		// Perform Insertion Sort
                		for (int i = 1; i < n; i++) 
				{
                    			int k = arr[i];
                    			int j = i - 1;
                   			while (j >= 0 && arr[j] > k) 
					{
                        			arr[j + 1] = arr[j];
                        			j--;
                    			}
                    			arr[j + 1] = k;
                		}

        			System.out.println("Sorted Array in Ascending Order:");
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
}
