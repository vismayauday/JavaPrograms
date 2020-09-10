import java.io.*;
import java.util.*;
class dash
{
    public static void main(String args[])
    {
        int j,k=0;
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            j=Integer.parseInt(s.substring(i,i+1));
            if(j%2==0 || (j%2==1 && k%2==1))
                System.out.print(j);
            else
            {
                if(i==0)
                    System.out.print(j+"-");
                else if(i==s.length()-1)
                    System.out.print("-"+j);
                else
                    System.out.print("-"+j+"-");
            }
            k=j;
        }
    }
}