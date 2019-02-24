import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements Hello {
    protected HelloServer() throws RemoteException {
        super();
    }

    @Override
    public String say() throws RemoteException {
        return "from the server";
    }

    public static void main(String args[])throws Exception{
        LocateRegistry.createRegistry(1997);
        Naming.bind("rmi://localhost:1997/hello", new HelloServer());
        System.out.println("Server Start!");
    }
}
