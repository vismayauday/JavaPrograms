class pat2
{
    public static void main(String args[])
    {
        int i,j;
        String s;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                s=(i+j)>=4?"*":" ";
                System.out.print(s);
            }
            System.out.println();
        }
    }
}