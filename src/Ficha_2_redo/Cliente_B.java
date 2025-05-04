package Ficha_2_redo;

import java.io.*;
import java.net.*;

public class Cliente_B {
    public Cliente_B() {
        String tipo = "B";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Processo Cliente B");
            Socket sc = new Socket("127.0.0.1", 2222);

            ObjectOutputStream os = new ObjectOutputStream(sc.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(sc.getInputStream());

            System.out.println(is.readObject()); // mensagem do servidor
            os.writeObject(tipo); // envia tipo
            os.flush();

            System.out.print("Digite um número inteiro: ");
            int num = Integer.parseInt(br.readLine()); // lê inteiro da linha
            os.writeObject(num);
            os.flush();

            Object resposta = is.readObject();
            System.out.println("Resposta do servidor: " + resposta);

            os.close();
            is.close();
            sc.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Cliente_B(); // corrige chamada
    }
}
