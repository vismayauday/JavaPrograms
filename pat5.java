class pat5
{
    public static void main(String args[])
    {
        int i,j,l=1;
        for(i=0;i<7;i++)
        {
            for(j=0;j<14;j++)
            {
                if((i+j)<7)
                    System.out.print(" ");
                else
                {
                    for(l=1;j<=7;j++,l++)
                        System.out.print(l);
                    for(l-=2;j<=i+7;j++,l--)
                        System.out.print(l);
                    break;
                }
            }
            System.out.println();
        }
        for(i=12;i>5;i--)
        {
            for(j=0;j<12;j++)
            {
                if((i+j)<14)
                    System.out.print(" ");
                else
                {
                    for(l=1;j<=7;j++,l++)
                        System.out.print(l);
                    for(l-=2;j<=i+5 && l>0;j++,l--)
                        System.out.print(l);
                    break;
                }
            }
            System.out.println();
        }
    }
}