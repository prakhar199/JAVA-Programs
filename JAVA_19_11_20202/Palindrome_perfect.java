import java.io.*;
class Palindrome_perfect
{
    public static void main(String args[])throws IOException 
   {
       
       int ch,n,d,r=0,p,s=0;
       InputStreamReader read= new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       
       System.out.println("Enter 1 for palindrome");
       System.out.println("Enter 2 for perfect");
       
       System.out.println("Enter your choice");
       
       ch=Integer.parseInt(in.readLine());
       
       switch(ch)
       {
           case 1:
           System.out.println("Enter the number");
           n=Integer.parseInt(in.readLine());
           p=n;
           while(n!=0)
           {
               d=n%10;
               r=r*10+d;
               n=n/10;
           }
           if(p==r)
           {
               System.out.println("It is palindrome "+p);
            }
            else
            {
            System.out.println("It is not palindrome "+p);
            }
            
            break;
            
           case 2:
           System.out.println("Enter the number");
           n=Integer.parseInt(in.readLine());
           
           for(int i=1; i<n;i++)
           {
               if((n%i)==0)
               s=s+i;
           }
           
           if(s==n)
           {
               System.out.println("The "+n+" is perfect ");
           }
           else
           {
               System.out.println("The "+n+" is perfect ");
            }
           break;
           
           default:
           System.out.println("It is a wrong choice");
        }
    }
}

     
           
            
            
            
            
            
           
            