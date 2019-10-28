import java.rmi.*;
import java.rmi.server.*;
public class Perfect_Impli extends UnicastRemoteObject implements Perfect
{
    public Perfect_Impli() throws Exception
    {
    }

    public int check_perfect(int no) throws RemoteException
    {
        int i,sum=0;
        for(i=1;i<=no-1;i++)
	{
            if(no%i==0)
            {
                sum=sum+i;
                
            }
	}       
        return (sum);
    }
}
