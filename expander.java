import java.util.*;
import java.io.*;
import java.lang.Math.*;
class expander
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int j,l=s.length(),k;
        for(int i=0;i<l;i++)
        {
            j = Integer.parseInt(s.substring(i, i + 1));
            k=(int)Math.pow(10,l-i-1);
            System.out.print(j*k);
            if(i!=l-1)
                System.out.print("+");
        }
    }
}