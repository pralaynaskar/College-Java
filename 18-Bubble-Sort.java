import java.util.Scanner;

class BubbleSort 
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
        			// Perform Bubble Sort
        			for (int i = 0; i < n - 1; i++) 
				{
            				for (int j = 0; j < n - 1 - i; j++) 
					{
                				if (arr[j] > arr[j + 1]) 
						{
                    					// Swap arr[j] and arr[j+1]
                    					int temp = arr[j];
                    					arr[j] = arr[j + 1];
                    					arr[j + 1] = temp;
                				}
            				}
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
