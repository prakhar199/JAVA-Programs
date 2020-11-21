//to search using binary search technique 
//to enter the data in either ascending or decending order

import java.io.*;
class Binary_search_try
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);

int m[]=new int[10];
int n;
for(int i=0;i<10;i++)
{
    System.out.println("Enter the "+i+"th"+" element of the array");
    m[i]=Integer.parseInt(in.readLine());
}

System.out.println("Enter the element to be searched");
n=Integer.parseInt(in.readLine());
int len=m.length;
int find=0;
int First,Last;
int mid;
Last=len-1;   //10-1=9
First=0;

mid=(First+Last)/2;

if(n <=m[mid])     //first half 
{
    for(int i=First;i<=mid;i++)
    {
        if(m[i]==n)
        {
            System.out.println("The location of the element is " +i+"th"+" index of the array");
        }
    }
}

if(n >=m[mid])     //second half
{
    for(int i=mid;i<len;i++)
    {
        if(m[i]==n)
        {
            System.out.println("The location of the element is " +i+"th"+" index of the array");
        }
    }
}

}
}








    
