class java_method
{
    public static void main(String args[])
    {
        int n1=25;
        int n2=15;
        
        //creating an object 
        java_method obj= new java_method();
        //caling the method or function
        int result=obj.addnum(n1,n2);
        System.out.println("Sum is:"+result);
    }
    
    int addnum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    
}