//to find the number of blanks, words, characters

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
        int b=0;  //blank space 
        int w;   // words 
        len=name.length();
        for(int i=0; i<len;i++)
        {
          ch=name.charAt(i);
          if(ch==' ')
          {
              b=b+1;
          }
        }
        w=b+1;
        System.out.println("The no. of blanks are "+b);
        System.out.println("The no. of words are "+(b+1));
        System.out.println("The no. of characters are "+(len-b));
    }
}
