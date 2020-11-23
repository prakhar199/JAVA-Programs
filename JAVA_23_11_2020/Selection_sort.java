import java.io.*;

class Selection_sort
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int m[]=new int[10];
        int min;
        int t;
        for(int i=0; i<10;i++)
        {
            System.out.println("Enter the "+i+"th"+" value of the array");
            m[i]=Integer.parseInt(in.readLine());
        }
        
        //Selection sorting technique
        for(int i=0;i<10;i++)
        {
            min=i;
          for(int j=i+1;j<10;j++)
          {
              if(m[j]>m[min])
               {
                 min=j; 
                }
            }
               t=m[i];
               m[i]=m[min];
               m[min]=t;
            }
            
         System.out.println("The arranged numbers are:");
        for(int i=0;i<10;i++)
        {
         System.out.println(m[i]);
        }
    }
}            