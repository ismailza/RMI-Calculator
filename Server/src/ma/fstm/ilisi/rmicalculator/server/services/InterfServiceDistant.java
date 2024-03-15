package ma.fstm.ilisi.rmicalculator.server.services;

import ma.fstm.ilisi.rmicalculator.server.exceptions.DividedByZeroException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfServiceDistant extends Remote {

    int somme(int a, int b) throws RemoteException;
    int soustraction(int a, int b) throws RemoteException;
    int multiplication(int a, int b) throws RemoteException;
    double division(int a, int b) throws RemoteException, DividedByZeroException;

}
