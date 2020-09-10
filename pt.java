import java.util.*;
public class pt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = n - 1;
        int r = l;
        int k = (n * 2) - 1;
        int i, j, s = 0;
        for (i = 0; i < k; i++)
        {
            if (i < n - 1)
            {
                for (j = 0; j < k; j++)
                {
                    if (j == l)
                    {
                        for (; j <= r; j++, s++)
                            System.out.print("*");
                        l -= 1;
                        r += 1;
                        System.out.println();
                        break;
                    }
                    else
                        System.out.print(" ");
                }
            }
            else
            {
                for (j = 0; j < k; j++)
                {
                    if (j == l)
                    {
                        for (; j <= r; j++, s++)
                            System.out.print("*");
                        l += 1;
                        r -= 1;
                        System.out.println();
                        break;
                    }
                    else
                        System.out.print(" ");
                }
            }
        }
        System.out.print(s);
    }
}
