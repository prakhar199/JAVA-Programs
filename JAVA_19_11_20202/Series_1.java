// S= 1+(1/2)+(1/3)+ ........+(1/10)

class Series_1
{
    public static void main(String args[])
    {
        int s=0;
        for(int a=1; a<=20;a++)
        {
            s=s+(1/a);
        }
        System.out.println("Sum of the series_1 is= "+s);
    }
}
        
        