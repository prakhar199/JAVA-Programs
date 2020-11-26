class Tax_calculator extends Salary
{
    public static void main(String name,String address,String subject,String phonenumber,int salary)
    {
        //InputStreamReader read=new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
        
        Salary teacher1=new Salary();
        //teacher1.accept();
        teacher1.calculate(salary);
        teacher1.display(name,address,phonenumber,subject,salary);
    }
}
