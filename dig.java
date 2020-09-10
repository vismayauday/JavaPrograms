import java.util.*;
class dig
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=0;
        while(n>0)
        {
            k+=(n%10);
            n/=10;
        }
        System.out.println(k);
    }
}