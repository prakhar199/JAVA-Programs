import java.io.*;
class blanks_words_characters
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
        String reverse="";
        len=name.length();
        for(int i=len; i>0; i++)
        {
            ch=name.charAt(i);
            reverse=reverse+ch;
        }
        System.out.println(reverse);
    }
}
