package Ficha_5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection extends Thread {
    private Socket S;
    public Connection ( Socket s) {
        super();
        S = s;
        start();
    }
    public void run () {
        try {
            ObjectOutputStream os = new ObjectOutputStream( S.getOutputStream());
            os.writeObject ( "A data e hora do sistema: " + new java.util.Date() );
            os.flush();
        }
        catch ( IOException e) {System.err.println("Erro ao dar run: " + e.getMessage());}
    }
}
