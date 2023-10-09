import java.util.Scanner;

class RMCM 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

        	// Input the dimensions of the matrix
        	System.out.print("Enter the number of rows (m): ");
        	int m = input.nextInt();
        	System.out.print("Enter the number of columns (n): ");
        	int n = input.nextInt();

		if (m < 1 || n < 1) 
		{
            		System.out.println("Warning: Please enter positive values for the number of rows and columns.");
            		return; 	// Exit the program
        	}

        	// Input the matrix
        	int[][] matrix = new int[m][n];
        	System.out.println("Enter the elements of the matrix:");
        	for (int i = 0; i < m; i++) 
		{
            		for (int j = 0; j < n; j++) 
			{
                		matrix[i][j] = input.nextInt();
            		}
        	}

        	// Find row minimums and column maximums
        	int[] rowMin = new int[m];
        	int[] colMax = new int[n];

        	for (int i = 0; i < m; i++) 
		{
            		int min = matrix[i][0];
            		for (int j = 1; j < n; j++) 
			{
                		if (matrix[i][j] < min) 
				{
                    			min = matrix[i][j];
                		}
            		}
            		rowMin[i] = min;
        	}

        	for (int j = 0; j < n; j++) 
		{
            		int max = matrix[0][j];
            		for (int i = 1; i < m; i++) 
			{
                		if (matrix[i][j] > max) 
				{
                    			max = matrix[i][j];
                		}
            		}
            		colMax[j] = max;
        	}
		System.out.print("\n");
        	// Print the modified matrix
        	System.out.println("Modified Matrix:");
        	for (int i = 0; i < m; i++) 
		{
            		for (int j = 0; j < n; j++) 
			{
                		System.out.print(matrix[i][j] + "\t");
            		}
            		System.out.print(rowMin[i]);
            		System.out.println();
        	}

        	for (int j = 0; j < n; j++) 
		{
            		System.out.print(colMax[j] + "\t");
        	}
    	}
}
