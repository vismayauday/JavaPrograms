import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        StringBuilder s=new StringBuilder();
        s.append(in.nextLine());
        System.out.print(a+s.reverse());
    }
}