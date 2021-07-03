import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Calculadora obj = null;
        Calculadora obj2 = null;
        try {
            obj = (Calculadora) Naming.lookup("rmi://localhost:10999/HelloServer");
            obj2 = (Calculadora) Naming.lookup("rmi://localhost:9999/HelloServer");
        } catch (NotBoundException e) { e.printStackTrace(); } catch (MalformedURLException e) { e.printStackTrace(); } catch (RemoteException e) { e.printStackTrace(); }
        boolean ativo = true;
        int Operando = 10;
        int x = 0;
        int y = 0;
        while (ativo) { //loop da calculadora, até o input do cliente ser "0". Encerrando a calculadora.
            System.out.println("Digite um numero para selecionar operção:0 para Sair," +
                    "1 para adição, " +
                    "2 para subtração, " +
                    "3 para Multiplicação, " +
                    "4 para divisão, " +
                    "5 para porcentagem, " +
                    "6 para raiz quadrada," +
                    "7 para potenciação");
            Operando = input.nextInt();
            System.out.println("Digite o primeiro operando:");
            x = input.nextInt();
            System.out.println("Digite o segundo operando:");
            y = input.nextInt();
            switch (Operando) {
                        case 1: {
                            System.out.println("Adição:");
                            try {System.out.println(obj.Adc(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }

                        case 2: {
                            System.out.println("Subtração:");
                            try {System.out.println(obj.Sub(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }

                        case 3: {
                            System.out.println("Multiplicação:");
                            try {System.out.println(obj.Multi(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }

                        case 4: {
                            System.out.println("Divisão:");
                            try {System.out.println(obj.Divi(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }

                        case 5: {
                            System.out.println("Porcentagem");
                            try {System.out.println(obj2.Porc(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }

                        case 6: {
                            System.out.println("Raiz quadrada:");
                            //try {System.out.println(obj2.RaizQ(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }
                        case 7: {
                            System.out.println("Potencia:");
                            try {System.out.println(obj2.Poten(x, y));} catch (RemoteException e) {e.printStackTrace();}
                          break;
                        }
                        case 0: { ativo = false; break;}
                        default: {
                            System.out.println("Operando(s) Invalidos, Tente novamente.");}
                        }


            }
        }
}
