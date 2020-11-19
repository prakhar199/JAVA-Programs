//"Atul Transport company' charges for the parcels from delhi to lucknow or vice versa
//as per the given price:
// Up to 10 kg --- Rs.20 per kg
//for next 20 kg----Rs.10 per kg
//for next 20 kg----Rs.8 per kg
//More than 50 kg----Rs.5 per kg

//WAP to calculate the charges for the parcel taking the weight of the parcel as a input
//from the user
 
import java.io.*;
class transport
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        
        int w,c=0;
        
        System.out.println("Enter the weight of parcel");
        w=Integer.parseInt(br.readLine());
        
        if(w<=10)
        {
            c=20*w;
        }
        if((w>10) && (w<=30))
        {
            c=200+((w-10)*10);
        }
        if((w>30) && (w<=50))
        {
            c=200+200+((w-30)*8);
        }
        if(w>50)
        {
            c=200+200+160+((w-50)*5);
        }
        System.out.println("The weight of the parcel is="+w);
        System.out.println("The cost of the parcel is="+c);
    }
}
        