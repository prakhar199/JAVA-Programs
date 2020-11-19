//to determine the roots of quadratic equation 

import java.io.*;
class Quadratic_equation 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        int a,b,c;
        double d,x1,x2,r,i;
        System.out.println("Enter the value of a,b,c");
        
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        
        d=(b*b)-(4*a*c);

        if(d >0)
        {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are real and different");
            System.out.println("x1= "+x1);
            System.out.println("x2= "+x2);
        }

        else if(d==0)
        {
            System.out.println("Roots are real and same");
            x1=-b/(2*a);
            System.out.println("x1 = x2 ="+x1);
        }
        else if(d<0)
        {
            r=-b/(2*a);
            i=Math.sqrt(-d)/(2*a);
            System.out.println("Roots are complex and different.");
            System.out.println("x1= "+r+"+"+"i"+i);
            System.out.println("x2= "+r+"-"+"i"+i);
        }
    }
}
