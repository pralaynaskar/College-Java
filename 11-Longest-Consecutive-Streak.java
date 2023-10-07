import java.util.Scanner;

class LongestConsecutiveStreak
{
    	public static void main(String[] args)
	{
        	Scanner input = new Scanner(System.in);		// create an instance of Scanner class
        	System.out.print("Enter the required size of the array: ");
        	int size = input.nextInt(); 	// take user input for array size

        	if (size <= 0)
		{
            		System.out.print("Invalid input! Array size can't be less than or equal to zero.");
        	} 
		else
		{
            		int[] array = new int[size + 1];
			System.out.print("Enter the elements of the array: ");
        		for (int i = 0; i < size; i++) 
			{
            			array[i] = input.nextInt();
        		}

            		// Sort the array elements using the bubble sort technique
            		for (int i = 0; i < size - 1; i++) 
			{
                		int flag = 0;
                		for (int j = 0; j < size - i - 1; j++)
				{
                    			if (array[j] > array[j + 1])
					{
                        			int temp = array[j];
                        			array[j] = array[j + 1];
                        			array[j + 1] = temp;
                        			flag++;
                    			}
                		}
                		if (flag == 0)
                    		break;
            		}

            		int currentStreak = 1;
            		int longestStreak = 1;
            
            		for (int i = 0; i < size - 1; i++)
			{
                		if (array[i] + 1 == array[i + 1]) 
				{
                    			currentStreak++; // counts the longest consecutive streak
                		}
				else 
				{
                    			if (longestStreak < currentStreak)
                        			longestStreak = currentStreak; // updates the previous longest consecutive streak
                    				currentStreak = 1;
                		}
            		}

            		System.out.print("\nThe length of the longest consecutive streak present in the array is: ");
            
            		if (longestStreak > currentStreak)
                		System.out.print(longestStreak);
            		else
                		System.out.print(currentStreak);
        	}
    	}
}
