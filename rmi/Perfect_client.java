import java.io.*;
import java.rmi.*;
import java.net.*;
public class Perfect_client
{
    public static void main(String args[])
    {
        try
        {
            String url="rmi://127.0.0.1/RmiPerfect";
            Perfect intf=(Perfect)Naming.lookup(url);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter No : ");
            int no=Integer.parseInt(br.readLine());
            int x=intf.check_perfect(no);
            if(x==no)
            System.out.println(no+" is perfect number");
            else
            System.out.println(no+" is not perfect number");   
    }
        catch(Exception ex){}
    }
}
