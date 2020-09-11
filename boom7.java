import java.util.*;
public class boom7
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String s;
        for(int i=0;i<n;i++)
        {
            s=in.next();
            if(s.contains("7"))
            {
                System.out.print("Boom!");
                return;
            }
        }
        System.out.print("there is no 7 in the array");
    }
}