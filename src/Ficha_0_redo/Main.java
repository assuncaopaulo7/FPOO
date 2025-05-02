package Ficha_0_redo;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(26, "Maria", "IT");
        Pessoa pessoa2 = new Pessoa(21, "Marcos", "Engenheiro Informatico");

        //----------------------------------------------------//
        //                  Object Streams                    //
        //----------------------------------------------------//

        try {
            FileOutputStream fileOut = new FileOutputStream("pessoas.ser"); // Especifica o ficheiro
            ObjectOutputStream out = new ObjectOutputStream(fileOut);             // Atribui o ficheiro ao out

            out.writeObject(pessoa1);
            out.writeObject(pessoa2);

            out.close();
            fileOut.close();

            System.out.println("Objetos gravados com sucesso no ficheiro 'pessoas.ser'.");
        } catch (IOException e) {
            e.printStackTrace();



        }
    }
}

