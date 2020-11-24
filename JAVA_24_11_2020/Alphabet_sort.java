//to arrange the alphabet of a word in ascending order

import java.io.*;
class Alphabet_sort
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n[]=new int[10];
        
        //int len=n.length;   //length of the array 
        String m;
        char ch;
        int d;
        System.out.println("Enter the string to arramged in the sorted format");
        m=in.readLine();
        d=m.length();    //length of the string 
       for(int i=0;i<d;i++)
       {
           ch=m.charAt(i);
           n[i]=(int)ch;
       }
       
       int t;
       for(int i=0; i<d-1;i++)
       {
           for(int j=0;j<d-1-i;j++)
           {
               if(n[j]>n[j+1])
               {
                   t=n[j];
                   n[j]=n[j+1];
                   n[j+1]=t;
                }
                
            }
        }
        
        
        for(int i=0; i<d;i++)
        {
            System.out.println("The sorted string is"+(char)n[i]);
        }
    }
}

        
        
        
        
       
            
            
 