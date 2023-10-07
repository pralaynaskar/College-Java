import java.util.Scanner;
class FrequencyOfElement
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in); // create an instance of Scanner class
        	System.out.print("Enter the required size of the array: ");
        	int size = input.nextInt(); // take user input for array size
        	if (size <= 0)
            		System.out.print("Invalid input! Array size can't be less than or equal to zero.");
        	else
		{	
            		int array[] = new int[size];            		 
			System.out.print("Enter the elements of the array: ");	// Input the elements of the array
        		for (int i = 0; i < size; i++) 
			{
            			array[i] = input.nextInt();
        		}
            		System.out.print("\nEnter an array element to find its frequency: ");
           		int num = input.nextInt(); // take user input against the given problem
            		int count = 0;
            		for (int i = 0; i < size; i++)
			{
                		if (array[i] == num)
                    		count++; // count the frequency of the given user input
            		}
            		if (count == 0)
                		System.out.print(num + " is not present in the given array.");
           		 else
                		System.out.print("Occurrence of " + num + " is: " + count);
        	}
    	}
}
