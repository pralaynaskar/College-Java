import java.util.Scanner;
class NumberPattern
{
    	public static void main(String[] args)
	{
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the number of rows: ");
        	int nr = input.nextInt();
        	for (int i = 1; i <= nr; i++) 
		{
            		for (int j = 1; j <= i; j++)
			{
                		System.out.print(j);
            		}
            		for (int j = i - 1; j >= 1; j--) 
			{
                		System.out.print(j);
            		}
            		System.out.println();
        	}
    	}
}
