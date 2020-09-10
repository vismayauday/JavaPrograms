import java.io.*;
import java.util.*;

class oddev
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=n%2==0?"even":"odd";
        System.out.println(s);
    }
}