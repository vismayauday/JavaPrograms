import java.util.*;
public class dirnum
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int s=0,n;
       do {
           n=in.nextInt();
           s+=n;
       }while(n!=0);
       s%=4;
       switch(s)
       {
           case 0:System.out.print("EAST");break;
           case 1:System.out.print("SOUTH");break;
           case 2:System.out.print("WEST");break;
           case 3:System.out.print("NORTH");break;
       }
    }
}