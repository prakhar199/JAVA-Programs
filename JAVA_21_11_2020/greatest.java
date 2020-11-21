//Wap program in java to assign 10 numbers in single dimension array and display the greatest number of the array

//to display the greatest number 
import java.io.*;
class greatest
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
       
        int m[]=new int[10]; 
        int n;
        int max=0;
        for(int i=0; i<10;i++)
        {
            System.out.println("Enter the "+i+"th"+" element of the array");
            m[i]=Integer.parseInt(in.readLine());
        }
        
        
        for(int i =0; i<10; i++)
        {
           if(max<m[i])
           {
               max=m[i];
            }
        }
        System.out.println("The greatest of all the elements are ="+max);
    }
}

        