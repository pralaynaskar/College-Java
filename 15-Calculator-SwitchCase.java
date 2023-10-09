import java.util.Scanner;
class Calculator 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

       		// Input dimensions of the matrices
        	System.out.print("Enter the number of rows for matrix A: ");
        	int m1 = input.nextInt();
        	System.out.print("Enter the number of columns for matrix A: ");
        	int n1 = input.nextInt();

        	System.out.print("Enter the number of rows for matrix B: ");
        	int m2 = input.nextInt();
        	System.out.print("Enter the number of columns for matrix B: ");
        	int n2 = input.nextInt();

		if (m1 < 1 || n1 < 1 || m2 < 1 || n2 < 1) 
		{
            		System.out.println("Please enter positive values for the number of rows and columns.");
            		return; 	// Exit the program
        	}

        	// Input matrices A and B
        	int[][] matrixA = new int[m1][n1];
        	int[][] matrixB = new int[m2][n2];

        	System.out.println("Enter elements for matrix A:");
        	for (int i = 0; i < m1; i++) 
		{
            		for (int j = 0; j < n1; j++) 
			{
               			matrixA[i][j] = input.nextInt();
            		}
        	}

        	System.out.println("Enter elements for matrix B:");
        	for (int i = 0; i < m2; i++) 
		{
            		for (int j = 0; j < n2; j++) 
			{
                		matrixB[i][j] = input.nextInt();
            		}
        	}

        	// Choose the operation
        	System.out.println("Choose operation:");
        	System.out.println("1. Addition");
        	System.out.println("2. Subtraction");
        	System.out.println("3. Multiplication");
        	System.out.print("Enter your choice (1/2/3): ");
        	int choice = input.nextInt();

        	int[][] result = new int[m1][n2];

        	// Perform the chosen operation
        	switch (choice) 
		{
            		case 1:
                		// Addition
                		if (m1 != m2 || n1 != n2) 
				{
                    			System.out.println("Matrix addition is not possible. Matrices A and B must have the same dimensions.");
                    			return;
                		}
                		for (int i = 0; i < m1; i++) 
				{
                    			for (int j = 0; j < n2; j++) 
					{
                        			result[i][j] = matrixA[i][j] + matrixB[i][j];
                    			}
                		}
                		break;
            		case 2:
                		// Subtraction
                		if (m1 != m2 || n1 != n2) 
				{
                    			System.out.println("Matrix subtraction is not possible. Matrices A and B must have the same dimensions.");
                    			return;
                		}
                		for (int i = 0; i < m1; i++) 
				{
                    			for (int j = 0; j < n2; j++) 
					{
                        			result[i][j] = matrixA[i][j] - matrixB[i][j];
                    			}
                		}
                		break;
            		case 3:
                		// Multiplication
				// Check if matrices can be operated on
        			if (n1 != m2) 
				{
            				System.out.println("Matrix multiplication is not possible. Number of columns in A must be equal to the number of rows in B.");
            				return;
        			}
                		for (int i = 0; i < m1; i++) 
				{
                    			for (int j = 0; j < n2; j++) 
					{
                        			result[i][j] = 0;
                        			for (int k = 0; k < n1; k++) 
						{
                            				result[i][j] += matrixA[i][k] * matrixB[k][j];
                        			}
                    			}
                		}
                		break;
            		default:
                		System.out.println("Invalid choice");
                		return;
        	}

        	// Print the result matrix
        	System.out.println("Result Matrix:");
        	for (int i = 0; i < m1; i++) 
		{
            		for (int j = 0; j < n2; j++) 
			{
                		System.out.print(result[i][j] + " ");
            		}
            		System.out.println();
        	}
    	}
}
