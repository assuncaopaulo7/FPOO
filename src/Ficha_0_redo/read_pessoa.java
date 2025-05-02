package Ficha_0_redo;
import java.io.*;
import java.util.ArrayList;

public class read_pessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("pessoas.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            while (true) {
                try {
                    Pessoa pessoa = (Pessoa) in.readObject();
                    pessoas.add(pessoa);
                } catch (EOFException eof) {
                    // Chegou ao fim do ficheiro
                    break;
                }
            }

            in.close();
            fileIn.close();

            System.out.println("Objetos lidos do ficheiro:");
            for (Pessoa p : pessoas) {
                System.out.println(p.getName() + ", " + p.getIdade() + " anos, " + p.getProfissao());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}
