package Ficha_5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    private ServerSocket ss
            ;
    private Socket s;
    private Connection c;
    public Servidor(){
        try
        {
            ss = new ServerSocket (5432);
        }
        catch ( IOException e){
            System.err.println("Erro ao criar o ServerSocket: " + e.getMessage());
        }
        try {
            while (true) {
                s = ss.accept();
                c = new Connection (s);
            }
        } catch (IOException e) {
            System.err.println("Erro ao aceitar conexão: " + e.getMessage());
        }

    }
    public static void main (String args[]){
        Servidor dataHora = new Servidor();
    }
}

