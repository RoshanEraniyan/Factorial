import java.util.*;


class Factorial
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return fact(n-1)*n;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fact(n));
    }
}
