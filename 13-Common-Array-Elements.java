import java.util.Scanner;

class CommonArrayElements
{
	public static void main(String[] args)
    	{
        	Scanner input = new Scanner(System.in); // create an instance of Scanner class
        	System.out.print("Enter the required size of the first array: ");
        	int size1 = input.nextInt(); // take user input for the size of the first array
        	System.out.print("Enter the required size of the second array: ");
        	int size2 = input.nextInt(); // take user input for the size of the second array

        	if (size1 <= 0 || size2 <= 0) 
        	{
            		System.out.print("Invalid input! Array size can't be less than or equal to zero.");
        	} 
        	else 
        	{
            		// Initialize the arrays
            		int array1[] = new int[size1];
            		int array2[] = new int[size2];
            		int aux[] = new int[size1];

            		System.out.print("Enter the elements of the first array: ");	// Input the elements of the array
        		for (int i = 0; i < size1; i++) 
			{
            			array1[i] = input.nextInt();
        		}


            		System.out.print("Enter the elements of the second array: ");	// Input the elements of the array
        		for (int i = 0; i < size2; i++) 
			{
            			array2[i] = input.nextInt();
        		}

            		int i = -1;

            		for (int j = 0; j < size1; j++) 
            		{
                		for (int k = 0; k < size2; k++) 
                		{
                    			if (array1[j] == array2[k] && array1[j] != -1 && array2[k] != -1) 
                    			{
                        			aux[++i] = array1[j]; // moves a copy of the common element into an auxiliary array
                        			array1[j] = -1; // replaces the common element with -1
                        			array2[k] = -1;
                    			}
                		}
            		}

            		if (i == -1)
			{
                		System.out.println("\nNo common element found.");
            		}
			else
			{
                		System.out.print("\nThe common element(s) between the given arrays:");
                		for (int j = 0; j <= i; j++)
                    		System.out.print(" " + aux[j]);
				
				System.out.print("\nFirst array elements without common array element(s):");
            			for (int j : array1) 
            			{
                			if (j != -1)
                    				System.out.print(" " + j);
            			}

            			System.out.print("\nSecond array elements without common array element(s): ");
            			for (int j : array2) 
            			{
                			if (j != -1)
                    				System.out.print(" " + j);
            			}
            		}

        	}
    	}
}
