//to search a numbe r using a linear search method 

import java.io.*;
class Linear_search
{
    public static void main(String args[])throws IOException 
   {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        int m[]=new int[10];
        int n;
        for(int i=0; i<10;i++)
        {
            System.out.println("Enter the " +i+"th"+" element of the array");
            m[i]=Integer.parseInt(in.readLine());
        }
        
        System.out.println("Enter the value to be searched in the array");
        n=Integer.parseInt(in.readLine());
        
        for(int i=0; i<10;i++)
        {
            if(m[i]==n)
            {
                System.out.println("The element " +n+ " s present in the array and its location is "+i+"th"+ " index");
            }
        }
    }
}
            
            
    