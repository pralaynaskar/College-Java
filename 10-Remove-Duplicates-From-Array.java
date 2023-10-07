import java.util.Scanner;

class RemoveDuplicates 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);        	
        	System.out.print("Enter the size of the array: ");		// Input the size of the array
        	int size = input.nextInt();        	
        	int[] array = new int[size];					// Create an array of the specified size  	
        	System.out.print("Enter the elements of the array: "); 	// Input array elements
        	for (int i = 0; i < size; i++) 
		{
            		array[i] = input.nextInt();
        	}     	
        	int newSize = 1; // Initialize the new size to 1 (at least one element is unique)
        	for (int i = 1; i < size; i++) 				// Remove duplicates and get the new length
		{
            		boolean isDuplicate = false;
            		for (int j = 0; j < newSize; j++) 		// Check if the current element is a duplicate
			{
                		if (array[i] == array[j]) 
				{
                    			isDuplicate = true;
                    			break;
                		}
            		}            			
            		if (!isDuplicate) 				// If it's not a duplicate, add it to the unique elements
			{
                		array[newSize] = array[i];
                		newSize++;
            		}
        	}
		if (newSize == size)
		{
			System.out.println("No duplicates found in the array.");
		}
        	else
		{
        		System.out.println("New length of the array: " + newSize);	// Display the new length and the
        		System.out.println("Array after removing duplicates:");		//modified array
        		for (int i = 0; i < newSize; i++) 
			{
    				System.out.print(array[i] + " ");
        		}
		}
    	}
}
