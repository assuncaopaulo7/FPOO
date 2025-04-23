package Ficha_6;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class RMIImpl extends UnicastRemoteObject implements RMIInterface
{
    int cont = 0;
    ArrayList<String> lista;
    public RMIImpl() throws java.rmi.RemoteException {
        super();
        lista = new ArrayList<String>();
    }
    public void adiciona ( String s) throws java.rmi.RemoteException {
        lista.add(s);
    }
    public ArrayList<String> consulta() throws java.rmi.RemoteException{
        cont++;
        return lista;
    }
    public int getCont() throws java.rmi.RemoteException {return cont;}
}
