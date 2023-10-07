import java.util.Scanner;
class OddPosCheck 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        if (num > 0 && num % 2 != 0) 
	{
            System.out.println("ODD POSITIVE");
        } 
	else 
	{
            System.out.println("NO");
        }
    }
}
