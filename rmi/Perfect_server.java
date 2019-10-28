import java.rmi.*;
import java.net.*;
public class Perfect_server
{
    public static void main(String args[])
    {
        try
        {
        Perfect_Impli perfectpli=new Perfect_Impli();
        Naming.rebind("RmiPerfect",perfectpli);
        }
        catch(Exception ex){}
    }
}
