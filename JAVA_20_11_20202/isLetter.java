import java.io.*;

class isLetter
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char p;
        int n;
        System.out.println("Enter the character");
        //p=(char)(in.read());
        n=(int)(in.read());
        p=(char)n;
        if(n>=65 && n<=122)
        {
            System.out.println(p+" is a Letter");
        }
        //System.out.println(n);
        //if(Character.isLetter(p))
        //{
            
        // 
        //}
        else
        {
            System.out.println(p+" is not a Letter");
        }
    }
}

 