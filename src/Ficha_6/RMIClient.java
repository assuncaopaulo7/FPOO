package Ficha_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // Apenas um BufferedReader

        while (true) {
            System.out.println("\n-- RMI APPLICATION --");
            System.out.println(" Escolha uma opção: \n");
            System.out.println(" 1 - Adiciona ");
            System.out.println(" 2 - Consulta ");
            System.out.println(" 3 - Contador ");
            System.out.println(" 4 - Sair ");
            System.out.println(" --------------------- ");

            // Lendo a escolha corretamente
            int choice;
            try {
                choice = Integer.parseInt(in.readLine().trim()); // Corrigindo a leitura da opção
            } catch (NumberFormatException e) {
                System.out.println(" Opção inválida. Digite um número de 1 a 4.");
                continue; // Volta para o menu
            }

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome a adicionar: ");
                    String add_var = in.readLine();
                    try {
                        RMIInterface myServerObject = (RMIInterface) Naming.lookup("RMIImpl");
                        myServerObject.adiciona(add_var);
                        System.out.println("Nome adicionado com sucesso.");
                    } catch (Exception e) {
                        System.out.println("Exception occurred: " + e);
                        System.exit(0);
                    }
                    break; // Parar após executar o case

                case 2:
                    try {
                        RMIInterface myServerObject = (RMIInterface) Naming.lookup("RMIImpl");
                        System.out.println("Lista: " + myServerObject.consulta());
                    } catch (Exception e) {
                        System.out.println("Exception occurred: " + e);
                        System.exit(0);
                    }
                    break; // Parar após executar o case

                case 3:
                    try {
                        RMIInterface myServerObject = (RMIInterface) Naming.lookup("RMIImpl");
                        System.out.println("Contador: " + myServerObject.getCont());
                    } catch (Exception e) {
                        System.out.println("Exception occurred: " + e);
                        System.exit(0);
                    }
                    break; // Parar após executar o case

                case 4:
                    System.out.println("Saindo...");
                    System.exit(0); // Encerra o programa

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
                    break; // Volta para o menu
            }
        }
    }
}
