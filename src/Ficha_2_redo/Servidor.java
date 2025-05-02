package Ficha_2_redo;

import java.io.*;
import java.net.*;

import static java.lang.Math.sqrt;

public class Servidor {
    public Servidor() {
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

                // ... resto do código igual

                String tipo = (String) is.readObject();
                System.out.println("Tipo cliente: " + tipo);

                // Decide que tipo de número ler e processar
                if (tipo.equals("A")) {
                    int num = (int) is.readObject();
                    os.writeObject(ClienteTipoA(num));
                } else if (tipo.equals("B")) {
                    double num = (double) is.readObject();
                    os.writeObject(ClienteTipoB((int) num));
                } else {
                    os.writeObject("Tipo de cliente inválido");
                }


                // Encerra a conexão com o cliente
                os.close();
                is.close();
                sos.close();
                System.out.println("Cliente desconectado. Servidor aguardando novo cliente...");
            }

        } catch (Exception e) {
            e.printStackTrace(); // mostra erro no terminal
        }
    }

    public int ClienteTipoA(int num) {
        return num * num;
    }

    public double ClienteTipoB(int num) {
        return sqrt(num);
    }

    public static void main(String args[]) {
        new Servidor();
    }
}
