//A computer manufacturing company announces a special offer to their customers 
//on purchasing Laptops and the printers accordingly:
//On Laptop : Discount - 15%
//On Printer : Discount - 10%
///WAP a program in Java to calculate the discount, if a customer purchases a 
//Laptop and a printer


class Computer
{
    public static void main(int c, int p)
    {
        double r1=15;
        double r2=10;
        double d1;
        double d2;
        double m,n;
        d1=(r1/100)*c;   ///calculating the discount 
        d2=(r2/100)*p;
        m=c-d1;   //calculating the final value og the product after the discount
        n=p-d2;
    
        System.out.println("The price of the Laptop after discount is"+m);
        System.out.println("The price of the Printer after discount is"+n);
}
}
    
    
    