//string input using a buffer reader and printing it 

import java.io.*;

class buffer
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        
        String name="";
        int age;
        double salary;
        System.out.println("Enter the name:");
        name=br.readLine();
        System.out.println("Enter the age:");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter the salary:");
        salary=Double.parseDouble(br.readLine());
        
        
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
        System.out.println("The salary is: "+salary);
        
    }
}