class Methodoverloading 
{
   Methodoverloading()
    {
        System.out.println("The is the Method Overloading program");
    }
    
   public static void display(int a)
   {
       System.out.println("Arguments: " +a);
   }
    
    public static void display(int a, int b)
    {
        System.out.println("Arguments: " +a+" and "+b);
    }
   
    public static void display(String m)
    {
        System.out.println("Arguments: "+m);
    }
    public static void main(String args[])
    {
        int a=1;
        int b=2;
        String m="h";
        Methodoverloading obj=new Methodoverloading();
        obj.display(a);
        obj.display(a,b);
        obj.display(m);
    }
}
