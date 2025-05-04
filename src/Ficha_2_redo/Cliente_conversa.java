package Ficha_2_redo;

import java.io.*;
import java.net.*;

public class Cliente_conversa{
    public Cliente_conversa() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String recebo;
        String mando;

        try {
            System.out.println("Processo Cliente_conversa");
            Socket sc = new Socket("127.0.0.1", 2222);

            ObjectOutputStream os = new ObjectOutputStream(sc.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(sc.getInputStream());

            System.out.println(is.readObject()); // mensagem do servidor

            while (true){
                System.out.print("Digite sua mensagem:");
                os.writeObject(br.readLine());
                os.flush();

                recebo = (String) is.readObject();
                System.out.println("Resposta do servidor: " + recebo);

                // condição de parada
                if ((recebo.equals("fim"))||(recebo.equals("Fim"))) {
                    os.writeObject("Cliente Desconectado");
                    break;
                }

            }
            os.close();
            is.close();
            sc.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Cliente_conversa()  ; // corrige chamada
    }
}
