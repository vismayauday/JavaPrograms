import java.util.*;

class sumoe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s=(n+m)%2==0?"even":"odd";
        System.out.println(s);
    }
}