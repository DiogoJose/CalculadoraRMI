import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;

public class RMI extends UnicastRemoteObject implements Calculadora {

    public RMI() throws RemoteException{
        super();
    }
    public String sayHello() {
        return "Hello facape!";
    }

    public Integer Adc(Integer x, Integer y) {return x+y;}
    public Integer Sub(Integer x, Integer y) {return x-y;}
    public Integer Multi(Integer x, Integer y) {return x*y;}
    public Integer Divi(Integer x, Integer y) {return x/y;}
    public Integer Porc(Integer x, Integer y) {return x*(y/100);}
    public double RaizQ(double x) {x = Math.sqrt(x); return x;}
    public double Poten(double x, double y) {return Math.pow(x, y);}

}
