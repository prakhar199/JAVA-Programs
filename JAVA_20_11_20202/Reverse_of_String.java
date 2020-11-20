import java.io.*;
class Reverse_of_String
{
    public static void main(String args[])throws IOException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String name;
        System.out.println("Enter the string");
        name=in.readLine();       //i am prakhar   //i am prakhar and i live in lucknow 
        int len;
        char ch;
        String rev="";
        String reverse="";
        len=name.length();
        for(int i=len-1; i>=0; i--)
        {
            ch=name.charAt(i);
            //reverse=reverse+ch;
            if(ch==' ') 
            {
              continue;
        }
        else 
        {
            rev=rev+ch;
        }
    }
        System.out.println(rev);   //i am prakhar //rahkrap....//prakhar i am 
    }
}
