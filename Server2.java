import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server2 {
    public static void main (String args [ ]) {

        try {
            //Registry registry = LocateRegistry.createRegistry(10999);
            Registry registry2 = LocateRegistry.createRegistry(9999);

            RMI obj2 = new RMI();
            registry2.rebind("HelloServer2", obj2);
            System.out.println("Hello Server pronto.");

        } catch(Exception e) {
            System.out.println("HelloServer erro"+ e.getMessage());
        }
    }
}
