import java.util.Scanner;
class SelectionSort 
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
       				// Perform Selection Sort
        			for (int i = 0; i < n - 1; i++) 
				{
            				int min = i;
            				for (int j = i + 1; j < n; j++) 
					{
                				if (arr[j] < arr[min]) 
						{
                    					min = j;
                				}
            				}
            
            				// Swap arr[i] and arr[min]
            				int temp = arr[i];
            				arr[i] = arr[min];
            				arr[min] = temp;
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
