//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

class Pattern
{
    public static void main(String args[])
    {
        int a=1;
        while(a<=5)  //1  //2
        {
            int b=1;  //1
            while(b<=a)  //1  ..2
            {
                System.out.print(b);   //1  //2
                b++; //2 //3
            }
            System.out.println();
            a++;
        }
    }
}
