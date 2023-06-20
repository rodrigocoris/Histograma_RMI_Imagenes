package histograma;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {

    public static void main(String[] args) throws RemoteException {
        // Seleccionar ip del servidor
        // System.setProperty("java.rmi.server.hostname", "192.168.0.12");

        Registry registry = LocateRegistry.createRegistry(8080);
        registry.rebind("server", new ServerImpl());
        System.out.println("Server is up!");
    }
}
