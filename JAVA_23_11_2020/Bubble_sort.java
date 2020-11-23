import java.io.*;

class Bubble_sort
{
  public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);


int m[]= new int[10];
for(int i=0;i<10;i++)
{
System.out.println("Enter the "+i+"th"+" value of the array"); 
m[i]=Integer.parseInt(in.readLine());

}
int t;
//Bubble Sort technique
int len=m.length;
for(int i=0;i<len-1;i++)
{
    for(int j=0; j<(len-1-i); j++)
    {
        if(m[j]<m[j+1])
        {
            t=m[j];
            m[j]=m[j+1];
            m[j+1]=t;
        }
    }
}
for(int i=0; i<10;i++)
{
    System.out.println("The elements are");
    System.out.println(m[i]);
}
}
}
