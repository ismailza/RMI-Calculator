package ma.fstm.ilisi.rmicalculator.server;

import ma.fstm.ilisi.rmicalculator.server.services.ImplServiceDistant;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Démarrer l'annuaire
            LocateRegistry.createRegistry(6666);
            // Crée l'objet distant
            ImplServiceDistant serviceDistant = new ImplServiceDistant();
            // Publier sa référence dans l’annuaire
            Naming.rebind("rmi://localhost:6666/service", serviceDistant);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
