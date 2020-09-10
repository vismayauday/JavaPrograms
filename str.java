import java.util.*;
public class str
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<3 || n>15)
        {
            System.out.print("Invalid Input");
            return;
        }
        int i,j,l=0,m,k=n*2-1;
        int p=n%2==0?1:2;
        System.out.println(p);
        System.out.println((n*2)+p);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n-1)
                {
                    for(m=j;m<=n+i-1;m++,l++)
                        System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=n;i<k;i++)
        {
            for (j = 0; j < k; j++)
            {
                if (i - j == n - 1)
                {
                    for (m = j; i + m <= (n * 2) + p; m++, l++)
                        System.out.print("*");
                    break;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print(l);
    }
}