import java.util.Scanner;

class RemoveElement
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

        	// Input the element to be removed
        	System.out.print("Enter the element to remove: ");
        	int elementToRemove = input.nextInt();

        	// Find the index of the element to remove
        	int indexToRemove = -1;
        	for (int i = 0; i < size; i++) 
		{
            		if (array[i] == elementToRemove) 
			{
                		indexToRemove = i;
                		break;
            		}
        	}

        	if (indexToRemove == -1) 
		{
            		System.out.println("Element not found in the array.");
        	} 
		else 
		{
            		// Create a new array with one less element
            		int[] newArray = new int[size - 1];

            		// Copy elements before the index to be removed
            		for (int i = 0; i < indexToRemove; i++) 
			{
                		newArray[i] = array[i];
            		}

            		// Copy elements after the index to be removed
            		for (int i = indexToRemove + 1; i < size; i++) 
			{
                		newArray[i - 1] = array[i];
            		}

            		// Display the modified array
            		System.out.println("Array after removing the element:");
            		for (int i = 0; i < size - 1; i++) 
			{
                		System.out.print(newArray[i] + " ");
            		}
        	}
    	}
}
