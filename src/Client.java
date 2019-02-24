import java.rmi.Naming;

public class Client {
    public static void main(String args[])throws Exception{
        Hello hello = (Hello) Naming.lookup("rmi://localhost:1997/hello");
        System.out.println("Msg: "+hello.say());
    }

}
