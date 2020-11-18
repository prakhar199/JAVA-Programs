//program to accept the marks of a student in Physics, Maths and Biology.
// Display the total marks as well as the average 

class average
{
    public static void main(int p, int c, int b)
    {
        int s;
        float avg;
        s=(p+b+c);
        avg=s/3;
        
        System.out.println("The total marks obtained="+s);
        System.out.println("The average marks="+avg);
    }
}

        
