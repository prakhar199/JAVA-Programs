//WAP in java to accept the sides of a triangle and display whether it is 
//equilateral or Isosceles or a Scalene triangle

import java.io.*;
class triangle 
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        
        System.out.println("Enter three sides of a triangle");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        
        if((a==b) && (b==c))
        {
            System.out.println("EQUILATERAL TRIANGLE");
        }
        else if((a==b)||(b==c)||(c==a))
        {
            System.out.println("ISOSCELES TRIANGLE");
        }
        else if((a!=b) && (b!=c) && (c!=a))
        {
            System.out.println("SCALENE TRIANGLE");
        }
    }
}
        
        