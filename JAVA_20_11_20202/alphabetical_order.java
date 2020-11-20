//to arrange the characters of the string in alphabetical order 


class alphabetical_order
{
    public static void main(String str)
    
    {
        char ch;
        int len=str.length();
        for( int i=65;i<=90; i++)
        {
            for(int j =0; j<len;j++)
            {
                ch=str.charAt(j);
                if(ch==(char)i || ch==(char)(i+32))
                System.out.print(ch);
            }
        }
    }
}