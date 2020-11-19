// A program to display all odd numbers using continue statement in while loop

class Odd_continue_while
{
    public static void main(String args[])
    {
        int i;
        i=0;
        
        while(i<10)
        {
            i++;
            if(i%2==0)
            {
                continue;
                
            }
          System.out.println(i);
        }
    }
}
