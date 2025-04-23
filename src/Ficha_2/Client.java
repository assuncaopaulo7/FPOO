package Ficha_2;

import java.io.*;
import java.net.*;

public class Client {
    public Client() {
        try {
            System.out.println ("Processo Cliente");
            Socket sc = new Socket("127.0.0.1", 2222);
            ObjectOutputStream os = new ObjectOutputStream(sc.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(sc.getInputStream());

            os.writeObject("Cliente: Olá, eu sou o cliente");
            System.out.println(is.readObject());
            os.flush();

            os.writeObject("Cliente: Ainda estou aqui");
            System.out.println(is.readObject());
            os.flush();

            os.close();
            is.close();
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]) {
        Client c = new Client();
    }
}
