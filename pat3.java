class pat3
{
    public static void main(String args[])
    {
        int i,j,l=1;
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
                    for(l-=2;j<=i+5;j++,l--)
                        System.out.print(l);
                    break;
                }
            }
            System.out.println();
        }
    }
}