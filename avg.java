import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[20];
        int i;
        for(i=0;i<20;i++)
            a[i]=in.nextInt();
        for(i=0;i<3;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        Arrays.sort(a);
        for(i=0;i<3;i++)
            System.out.print(a[i]+" ");

    }
}