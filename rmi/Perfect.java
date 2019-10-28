import java.rmi.*;
public interface Perfect extends Remote
{
    public int check_perfect(int no) throws RemoteException;
}
