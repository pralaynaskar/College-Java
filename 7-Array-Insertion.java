import java.util.Scanner;

class ArrayInsert 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the size of the array: ");
        	int size = sc.nextInt();
        	int[] array = new int[size + 1]; 			// Increase array size by 1
        	System.out.print("Enter the elements of the array: ");
        	for (int i = 0; i < size; i++) 
		{
            		array[i] = sc.nextInt();
        	}
        	System.out.print("Enter the element to insert: ");
        	int elementToInsert = sc.nextInt();
        	System.out.print("Enter the position to insert (0-based index): ");
        	int position = sc.nextInt();
        	if (position < 0 || position > size) 
		{
            		System.out.println("Invalid position. Position should be between 0 and " + size);
        	} 
		else 
		{
            		for (int i = size; i > position; i--) 
			{
                		array[i] = array[i - 1];
            		}
            		array[position] = elementToInsert;
            		size++;
            		System.out.println("Array after insertion:");
            		for (int i = 0; i < size; i++) 
			{
                		System.out.print(array[i] + " ");
            		}
        	}
    	}
}
