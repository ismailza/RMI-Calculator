package ma.fstm.ilisi.rmicalculator.server.services;

import ma.fstm.ilisi.rmicalculator.server.exceptions.DividedByZeroException;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplServiceDistant extends UnicastRemoteObject implements InterfServiceDistant {

    public ImplServiceDistant() throws RemoteException {
        super();
    }


    @Override
    public int somme(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double division(int a, int b) throws RemoteException, DividedByZeroException {
        if (b == 0)
            throw new DividedByZeroException("Echec! Division par 0");
        return (double) a / b;
    }
}
