//wap to accept the length and breadth of a reactangle. Calculate and display the area,
//perimeter or the diagonal as per the users choice

import java.io.*;

class rectangle
{
    public static void main(String args[])throws IOException
    {
        int a,b,n,ar,pm;
        double d;
        
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        
        System.out.println("Enter the length and breadth");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        
        System.out.println("Enter 1 for area, Enter 2 for perimeter, Enter 3 for diagonal");
        n=Integer.parseInt(br.readLine());
        
        switch(n)
        {
            case 1:
            ar=a*b;
            System.out.println("Area is: "+ar);
            break;
            case 2:
            pm=a+b;
            System.out.println("Perimeter is: "+pm);
            break;
            case 3:
            d=Math.sqrt((a*a)+(b*b));
            System.out.println("Diagonal is: "+d);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}

            
            
        