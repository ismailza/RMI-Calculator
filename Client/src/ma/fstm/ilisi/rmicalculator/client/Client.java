package ma.fstm.ilisi.rmicalculator.client;

import ma.fstm.ilisi.rmicalculator.server.services.InterfServiceDistant;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            InterfServiceDistant service = (InterfServiceDistant) Naming.lookup("rmi://localhost:6666/service");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first operand: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second operand: ");
            int b = scanner.nextInt();
            System.out.println("Enter the operation: ");
            String operation = scanner.next();
            switch (operation) {
                case "+":
                    System.out.println("Result: " + service.somme(a, b));
                    break;
                case "-":
                    System.out.println("Result: " + service.soustraction(a, b));
                    break;
                case "*":
                    System.out.println("Result: " + service.multiplication(a, b));
                    break;
                case "/":
                    try {
                        System.out.println("Result: " + service.division(a, b));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
