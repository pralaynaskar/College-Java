import java.util.Scanner;

class SortAseDes
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

        	// Input: Read the number of elements
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

        		// Sort the first half in ascending order
        		for (int i = 0; i < n / 2; i++) 
			{
            			for (int j = i + 1; j < n / 2; j++) 
				{
                			if (arr[i] > arr[j]) 
					{
                    				int temp = arr[i];
                    				arr[i] = arr[j];
                    				arr[j] = temp;
                			}
            			}
        		}

        		// Sort the second half in descending order
        		for (int i = n / 2; i < n - 1; i++) 
			{
            			for (int j = i + 1; j < n; j++) 
				{
                			if (arr[i] < arr[j]) 
					{
                    				int temp = arr[i];
                    				arr[i] = arr[j];
                    				arr[j] = temp;
                			}
            			}
        		}

        		// Output: Display the sorted array
        		System.out.println("Sorted array with the first half in ascending and the second half in descending order:");
        		for (int i = 0; i < n; i++) 
			{
            			System.out.print(arr[i] + " ");
        		}
		}
		else
		{
			System.out.println(" !! Enter a positive number of elements !!");
		}
    	}
}
