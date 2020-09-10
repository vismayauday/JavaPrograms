class pat4
{
    public static void main(String args[])
    {
        int i,j,l=1,c=64;
        for(i=0;i<6;i++)
        {
            for(j=0;j<12;j++)
            {
                if((i+j)<5)
                    System.out.print(" ");
                else
                {
                    for(l=1;j<=5;j++,l++)
                        System.out.print(l);
                    for(c=c+i;j<=i+5;j++,c--)
                        System.out.print((char)c);
                    break;
                }
            }
            System.out.println();
        }
    }
}