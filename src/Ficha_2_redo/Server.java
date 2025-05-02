package Ficha_2_redo;

import Ficha_2.Server2;

import java.io.*;
import java.net.*;

public class Server {
    public Server() {

        try {

            // ESTABELECE A CONEXÃO

            ServerSocket ss = new ServerSocket(2222); // cria o servidor
            System.out.println("Aguardando Conexão...");

            // loop
            while(true) {
                Socket sos = ss.accept();                      // espera pela conexão e guarda ela num socket
                System.out.println("Conexão Completa!");


                // --- COMUNICAÇÃO ---

                // criação das streams de comunicação
                ObjectOutputStream os = new ObjectOutputStream(sos.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(sos.getInputStream());

                // comnucação com o cliente
                os.writeObject("Servidor: Conexão estabelecida"); // manda msg para o cliente
                os.flush();                                       // assegura que o cliente recebe todos os dados
                System.out.println(is.readObject());              // usado para ler o que o cliente disse

                os.writeObject("Servidor: Mensagem Recebida");
                os.flush();
                System.out.println(is.readObject());


                // --- ENCERRA A CONEXÃO ---

                os.close();
                is.close();
                sos.close();
                System.out.println("Cliente desconectado. Servidor aguardando novo cliente...");

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }

    public static void main(String args[]) {
        Server s = new Server();
    }

}