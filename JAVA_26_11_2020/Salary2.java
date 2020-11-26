//Define a class salary as described 
// data members : Name, adress, phone,subject,specialization,monthly salary, Income tax
// Member methods :  
     // To accpet the details of a worker including the monthly salary
     // To display the details of the worker 
     // To compute the annual Income tax as 5% of the annual salary above 1,75,000 
     
//Wap to create a object of a class and call the above member methods 


import java.util.*;
class Salary2
{
    String name,add,sub;
    long ph;
    double sal,tax=0;
    
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name");
        name=in.nextLine();
        System.out.println("Enter Addresss");
        add=in.nextLine();
        System.out.println("Enter the Subject Specialization");
        sub=in.nextLine();
        System.out.println("Enter the Phone Number");
        ph=in.nextLong();
        System.out.println("Enter the Salary");
        sal=in.nextDouble();
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Subject: "+sub);
        System.out.println("Phone number: "+ph);
        System.out.println("Salary: "+sal);
        System.out.println("Tax: "+tax);
    }
    
    void calculate()
    {
        if((12*sal) > 17500)
        {
            tax=((sal*12)*5)/100;
        }
        else
        {
            tax=0;
        }
    }
}
