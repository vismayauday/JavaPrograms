import java.util.*;
class occ
{
    public static void main(String args[])
    {
        int[] a=new int[26];
        Arrays.fill(a,0);
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s.toLowerCase();
        char[] b=s.toCharArray();
        Arrays.sort(b);
        int i,j;
        for(i=0;i<b.length;i++)
        {
            j=(int)b[i]-97;
            a[j]++;
        }
        for(i=0;i<26;i++)
        {
            if(a[i]!=0)
                System.out.println((char)(i+97)+" "+a[i]);
        }


    }
}