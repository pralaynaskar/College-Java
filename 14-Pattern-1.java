import java.util.Scanner;

class Pattern1 
{
    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter the number of lines: ");
        	int num = input.nextInt();
		if(num>0)
		{
        		for (int i = 1; i <= num; i++) 
			{
				if (i%2 != 0)
				{
            				for (int j = 0; j < i; j++) 
					{
                				System.out.print("*");
            				}
            				for (int j = 0; j < i; j++) 
					{
                				System.out.print("0");
            				}
            				System.out.println();
				}
				else
				{
					for (int j = 0; j < i; j++) 
					{
                				System.out.print("0");
            				}
            				for (int j = 0; j < i; j++) 
					{
                				System.out.print("*");
            				}
            				System.out.println();
				}
			}	
        	}
		else
		{
			System.out.println("!! Enter a positive number !!");
		}
    	}
}
