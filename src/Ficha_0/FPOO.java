package Ficha_0;
import java.io.*;

public class FPOO {
    public static void main(String args[]) throws IOException {
        BufferedReader br;
        String line;
        br = new BufferedReader(new FileReader("C:\\Users\\assun\\iCloudDrive\\UBI_\\UBI- 3º ano\\2º Semestre\\SD\\teste.txt"));
        while ( (line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}