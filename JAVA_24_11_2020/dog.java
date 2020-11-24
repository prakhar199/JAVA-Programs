class dog extends animal
{
    String name;
        public void display()
        {
         
        System.out.println("My name is " +name);
    }
    }

class Main
{
    public static void main(String args[])
    {
        dog labrador=new dog();
        labrador.name="Tommy";
        labrador.display();
        
        labrador.eat();
    }
}
