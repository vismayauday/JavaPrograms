import java.util.*;
public class dm
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<3 || n>100)
        {
            System.out.print("Invalid Input");
            return;
        }
        int k=(n*2)-1;
        int j,l=n-1,r=n-1,s=0;
        String m;
        for(int i=0;i<k;i++)
        {
            if(i<=n)
            {
                for(j=0;j<=r;j++)
                {
                    m=j>=l?" ":"*";
                    System.out.print(m);
                }
                System.out.println();
                l--;
                r++;
            }
            else
            {
                for(j=0;j<=r;j++)
                {
                    m=j>=l?" ":"*";
                    System.out.print(m);
                }
                System.out.println();
                l++;
                r--;
            }
        }
        System.out.print(s);
    }
}