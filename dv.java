import java.util.*;
public class dv
{
    public static int lcm(int a, int b)
    {
        while(a % b == 0)
            a = a/b;
        return a;
    }
    public static boolean ul(int n)
    {
        n = lcm(n, 2);
        n = lcm(n, 3);
        n = lcm(n, 5);
        if(n==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i=1,c=1;
        while(c<n)
        {
            i++;
            if(ul(i))
                c++;
        }
        System.out.print(i);
    }
}