import java.io.*;
import java.util.*;
class c
{
    public static int af=0;
    public static char[][] a=new char[9][20];
    public static int[] ps={8,0};
    public static boolean cp(int i,int j)
    {
        while(a[i][j]=='.')
        {
            System.out.println("("+i+","+j+")");
            i++;
            j++;
            if(a[i][j]=='c' || a[i][j]=='a')
            {
                af++;
                break;
            }
            if(a[i][j]=='*')
                break;
        }
        ps[0]=i;
        ps[1]=j;
        boolean q=a[i][j]=='*'?true:false;
        return q;
    }
    public static boolean ap(int i,int j)
    {
        while(a[i][j]=='.')
        {
            System.out.println("("+i+","+j+")");
            i--;
            j++;
            if(a[i][j]=='c' || a[i][j]=='a')
            {
                af++;
                break;
            }
            if(a[i][j]=='*')
                break;
        }
        ps[0]=i;
        ps[1]=j;
        boolean q=a[i][j]=='*'?true:false;
        return q;
    }
    public static void main(String args[])
    {
                int i,j,h,n=0,af=0;
                boolean d;
                String s=new String();
                Scanner in=new Scanner(System.in);
                for(i=0;i<9;i++)
                {
                    s=in.nextLine();
                    for(j=0;j<20;j++)
                    {
                        a[i][j] = (char) s.charAt(j);
                        if (a[i][j]=='c' || a[i][j]=='a')
                            n++;
                    }
                }
                h=0;
                System.out.println("(0,0)");
                d=cp(ps[0],ps[1]);
                while(true)
                {
                    if(d)
                        h++;
                    if(h==2)
                        break;
                    if(a[ps[0]][ps[1]]=='a' || a[ps[0]][ps[1]]=='*')
                        d=ap(ps[0],ps[1]);
                    else
                        d=ap(ps[0],ps[1]);
                }
                System.out.println("Saved : "+(n-af));
                System.out.println("Affected: "+af);
    }
}