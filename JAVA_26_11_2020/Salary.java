//Define a class salary as described 
// data members : Name, adress, phone,subject,specialization,monthly salary, Income tax
// Member methods :  
     // To accpet the details of a worker including the monthly salary
     // To display the details of the worker 
     // To compute the annual Income tax as 5% of the annual salary above 1,75,000 
     
//Wap to create a object of a class and call the above member methods 


//import java.io.*;
class Salary
{
    //String name,address,subject;
    //int ph;
    
    //double sal,tax=0;
    //double tax;
    int tax=0;
    //void accept(String args[])throws IOException//to take the details of the worker for the user 
    //{
        /*InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter name");
        name=in.readLine();
        System.out.println("Enter address");
        address=in.readLine();
        System.out.println("Enter subject");
        subject=in.readLine();
        System.out.println("Enter phone number");
        ph=Integer.parseInt(in.readLine());
        System.out.println("Enter salary");
        sal=Double.parseDouble(in.readLine());*/
    //}
    
    Salary()
    {
        System.out.println("TAX CALCULATOR");
    }
    
    void display(String name,String address, String ph, String subject,int sal)
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+ph);
        System.out.println("Subject Specialization: "+subject);
        System.out.println("Monthly Salary: "+sal);
        System.out.println("Income Tax: "+tax);
    }
    
    void calculate(int sal)
    {
       
        if((12*sal) >175000)
        {
            tax=((sal*12)*5)/100;
        }
        else{
            tax=0;
        }
    }
    
   /* public static void main(String name,String address,String subject,String phonenumber,int salary)
    {
        //InputStreamReader read=new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
        
        Salary teacher1=new Salary();
        //teacher1.accept();
        teacher1.calculate(salary);
        teacher1.display(name,address,phonenumber,subject,salary);
    }*/
    }
    




