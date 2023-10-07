
import java.util.Scanner;
class PairSum1 
{
    	public static void main(String[] args) 
	{
        		Scanner input = new Scanner(System.in);		// Input the number of elements in the array
        		System.out.print("Enter the size of the array: ");
        		int size = input.nextInt();
        		int array[] = new int[size];
        		int resultArray[] = new int[size * 2];
        		int flag = 0, k = 0, count = 0;
        		System.out.print("Enter the array elements: ");	// Input the array elements
        		for (int i = 0; i < size; i++) 
		{
            			array[i] = input.nextInt();
        		}					// Input the specific element to find pairs for
        		System.out.print("Enter a number to find its summation pairs: "); 
        		int targetNumber = input.nextInt();
			System.out.println("Pairs with sum " + targetNumber+ ":");
        		for (int i = 0; i < size; i++) 				// Find and print pairs with the specified sum
		{
            			for (int j = 0; j < size; j++) 
			{
                			if (i != j) 
				{
                    				if (array[i] + array[j] == targetNumber) 
					{
                        					resultArray[k++] = array[i];
                        					flag = 1;
                        					count = 0;

// Count the occurrences of the same element in the resultArray
                        					for (int p = 0; p < k; p++) 
						{
                            						if (resultArray[p] == array[i]) 
							{
                                						count++;
                            						}
                        					}
                        					if (count == 1) 		// Print the pair if it's not a duplicate
						{
                            						System.out.print("(" + array[i] + "," + array[j] + ")  ");
                        					}
                    				}
                			}
            			}
        		}
        		System.out.println();
        		if (flag == 0) 		// Check if no pair was found
		{
            			System.out.println("No summation pair is available for " + targetNumber);
        		}
    	}
}
