import java.rmi.*;
import java.util.Date;

public interface Calculadora extends Remote {
    String sayHello() throws RemoteException;

    Integer Adc(Integer x, Integer y) throws RemoteException;
    Integer Sub (Integer x, Integer y) throws RemoteException;
    Integer Multi(Integer x, Integer y) throws RemoteException;
    Integer Divi(Integer x, Integer y) throws RemoteException;
    Integer Porc(Integer x, Integer y) throws RemoteException;
    double RaizQ (double x) throws RemoteException;
    double Poten (double x, double y) throws RemoteException;

}