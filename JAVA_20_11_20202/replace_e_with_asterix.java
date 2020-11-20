//Wap program to replace 'e' with '*' in string 

import java.io.*;
class replace_e_with_asterix
{
    public static void main(String args[])throws IOException 
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st;
        String st2="";
        char ch;
        System.out.println("Enter a string");
        st=in.readLine();
            
        int len=st.length();     //elephant
            
        for(int i=0; i<len;i++)
            {
              ch=st.charAt(i);
              if(ch=='e')
              {
                  ch='*';
                  st2=st2+ch;
                }
                else
                {
                    st2=st2+ch;
                }
                //System.out.print(ch);
            }
        System.out.println(st2);
    }
}
            