// In a toss game, you want to know the number of times of getting "head" and "tails". you keep record as '1' for getting head and 0 for tails.
//WAP to perform above task. Suppose you have tossed a cins for 20 times in this game.

import java.io.*;
class toss
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        double d;
        int c,h=0,t=0;
        for(int i=0; i<=20; i++)
        {
         d=Math.random()*2;
         
         c=(int)d;    //type  ..(double) (string)
         
         if(c==1)
         {
             h=h+1;
         }
         
         else
         
         t=t+1;
        }
        
        System.out.println("Number of times Head obtained= "+h);
        System.out.println("Number of times Tails obtained= "+t);
    }
}
        
        
    