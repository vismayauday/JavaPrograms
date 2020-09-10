import java.util.*;
class ssort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int[] c = new int[a.length()];
        int[] d = new int[b.length()];
        int i = 0;
        for(i=0;i<a.length();i++)
            c[i]=Integer.parseInt(a.substring(i,i+1));
        for(i=0;i<b.length();i++)
            d[i]=Integer.parseInt(b.substring(i,i+1));
        Arrays.sort(c);
        Arrays.sort(d);
        for(int e:c)
            System.out.print(e+" ");
        for(int e:d)
            System.out.print(e+" ");
    }
}