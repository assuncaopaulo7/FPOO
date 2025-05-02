package Ficha_0_redo;
import java.io.*;

public class c1 {
    public static void main (String args[]){
        BufferedWriter bw;
        BufferedReader br;
        String line;
        try {
            bw = new BufferedWriter ( new FileWriter("C:\\Users\\assun\\iCloudDrive\\UBI_\\UBI- 3º ano\\2º Semestre\\SD\\FPOO\\texto1.txt"));
            bw.write("Hello Java!");
            bw.newLine();
            bw.write("Hello Java! 2");
            bw.flush();
            bw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            br = new BufferedReader ( new FileReader("C:\\Users\\assun\\iCloudDrive\\UBI_\\UBI- 3º ano\\2º Semestre\\SD\\FPOO\\texto1.txt"));
            while((line = br.readLine())!= null){ // preciso atribuir o valor de cada linha para uma var auxiliar "line"
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }}
