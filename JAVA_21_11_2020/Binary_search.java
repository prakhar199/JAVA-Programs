//to search using binary search technique 
//to enter the data in either ascending or decending order

import java.io.*;
class Binary_search
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

while(First<=Last)
{
    mid=(First+Last)/2;
    
    if(m[mid]<n)
    {
        First=mid+1;
    }
    if(m[mid]>n)
    {
        Last=mid-1;
    }
    
    if(m[mid]==n)
    {
      find=1;
      break;
    }
}

if(find==1)
{
    System.out.println("The search is sucessfull");
}
else
System.out.println("The search is unsucessfull");
}
}
    









