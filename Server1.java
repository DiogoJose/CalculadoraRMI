import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server1 {
    public static void main (String args [ ]) {
        try {
            Registry registry = LocateRegistry.createRegistry(10999);

            RMI obj = new RMI();
            registry.rebind("HelloServer", obj);
            System.out.println("Hello Server pronto.");

        } catch(Exception e) {
            System.out.println("HelloServer erro"+ e.getMessage());
        }
    }
}
