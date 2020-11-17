//WAP in Java to accept the number of days and display the result after converting into the number of years,number of months and the remaining 
//number of days 

public class Years
{
    public static void main(int a)
    {
        int y,b,c,m,d,w;
        y=a/365;
        b=a%365;
        m=b/30;
        c=b%30;
        w=c/7;
        d=c%7;
        
        System.out.println("The number of years = "+y);
        System.out.println("The number of months = "+m);
        System.out.println("The number of weeks = "+w);
        System.out.println("The number of days = "+d);
    }
}
        