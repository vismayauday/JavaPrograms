import java.util.*;
class asc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        for(i=n-1;i>-1;i--)
            System.out.print(a[i]+" ");
    }
}