package Ficha_2_redo;


import java.io.*;
import java.net.*;

import static java.lang.Math.sqrt;

public class Servidor_conversa {
    public Servidor_conversa() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String recebo;
        String mando;

        try {
            ServerSocket ss = new ServerSocket(2222);
            System.out.println("Aguardando Conexão...");

            // loop do servidor
            while (true) {
                Socket sos = ss.accept();
                System.out.println("Conexão Completa!");

                ObjectOutputStream os = new ObjectOutputStream(sos.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(sos.getInputStream());

                os.writeObject("Servidor: Conexão estabelecida");
                os.flush();
                while (true){

                    // Espera pela fala do cliente para iniciar Protocolo
                    recebo = (String) is.readObject();
                    System.out.println("Cliente: " + recebo);

                    // Escreve msg
                    mando = br.readLine();
                    os.writeObject(mando);

                    // condição de parada
                    if ((mando.equals("fim"))||(mando.equals("Fim"))) {
                        System.out.println("Conexão encerrada! Aguardando novo cliente...");
                        break;
                    }
                }
                os.close();
                is.close();
                sos.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        new Servidor_conversa();
    }
}
