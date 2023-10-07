import java.util.Scanner;

class PairSum
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

        	// Input the size of the array
        	System.out.print("Enter the size of the array: ");
        	int size = input.nextInt();

        	// Create an array of the specified size
        	int[] array = new int[size];

        	// Input array elements
        	System.out.print("Enter the elements of the array: ");
        	for (int i = 0; i < size; i++) 
		{
            		array[i] = input.nextInt();
        	}

        	// Input the target sum
        	System.out.print("Enter a number to find its summation pairs: ");
        	int sum = input.nextInt();

        	// Find pairs with the specified sum
		boolean pairFound = false; // Flag to check if a pair is found
        	System.out.println("Pairs with sum " + sum + ":");
        	for (int i = 0; i < size; i++) 
		{
            		for (int j = i + 1; j < size; j++) 
			{
                		if (array[i] + array[j] == sum) 
				{
                    			System.out.println("(" + array[i] + ", " + array[j] + ")");
					pairFound = true; // Set the flag to true when a pair is found
                		}
            		}
        	}
		// Check if no pair was found
        	if (!pairFound) 
		{
            		System.out.println("No summation pair is available for " + sum);
        	}
    	}
}
