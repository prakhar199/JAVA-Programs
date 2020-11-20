//January 26 is celebrated as the Republic Day of India.
//replacee 26 to 15 and January to August  and republic to Independence 

 class Compare_to
{
    public static void main(String args[])
    {  
            char ch;
            String t="";
            String st1="";
            String st= "January 26 is celebrated as the Republic Day of India.";
            st=st+" ";
            int len=st.length();
            for( int i=0; i<len; i++)
            {
                ch=st.charAt(i);
                if(ch!=' ')
                {
                    t=t+ch;
                }
                else
                {
                    if(t.compareTo("26")==0)
                    {
                      st1=st1+" "+"14";
                    }
                    else if(t.compareTo("January")==0)
                    {
                        st1=st1+" "+"August";
                    }
                    else if(t.compareTo("Republic")==0)
                    {
                        st1=st1+" "+"Independence";
                    }
                    else
                    st1=st1+" "+t;
                    t="";
                }
            }
            System.out.println("Modified String is");
            System.out.println(st1);
        }
    }
    
            