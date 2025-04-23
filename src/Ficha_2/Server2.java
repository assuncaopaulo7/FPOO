package Ficha_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public Server2() {
        try {
            System.out.println("Processo Servidor");
            ServerSocket ss = new ServerSocket(2222);

            while (true) { // Mantém o servidor ativo para múltiplos clientes
                System.out.println("Aguardando conexão...");
                Socket sc = ss.accept(); // Espera um novo cliente
                System.out.println("Cliente conectado!");

                // Criando as streams para comunicação
                ObjectOutputStream os = new ObjectOutputStream(sc.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(sc.getInputStream());

                // Comunicação com o cliente
                os.writeObject("Servidor: Conexão estabelecida");
                os.flush();
                System.out.println(is.readObject());

                os.writeObject("Servidor: Mensagem recebida");
                os.flush();
                System.out.println(is.readObject());

                // Fechando apenas o cliente atual
                os.close();
                is.close();
                sc.close();
                System.out.println("Cliente desconectado. Servidor aguardando novo cliente...");
            }
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro de Classe: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        new Server2();
    }
}



