class Fibonacci
{
    public static void main(String[] args) 
    {
        int n = 20, prev = 0, current = 1;
        System.out.println("Fibonacci Series up to " + n + ":");
        while (prev <= n) 
        {
            System.out.print(prev + " ");
                int next = prev + current;
                prev = current;
                current = next;
            
        }
    }
}
