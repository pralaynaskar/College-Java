import java.util.Scanner;

class BinaryCheck
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter an integer: ");
        	int num = sc.nextInt();
        	boolean isBinary = true;
        	while (num != 0) 
		{
            		int a = num % 10;
            		if (a != 0 && a != 1) 
			{
                		isBinary = false;
                		break;
            		}
            		num = num / 10;
        	} 
        	if (isBinary)
		{
            		System.out.println("YES");
        	}
		else
		{
            		System.out.println("NO");
        	}
    	}
}
