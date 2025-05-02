package Ficha_0_redo;
import java.io.*;

public class c2 {
    public static void main (String args[]){
        PrintWriter pw;
        BufferedReader br;
        String line;
        try {
            pw = new PrintWriter ( new FileWriter ("C:\\Users\\assun\\iCloudDrive\\UBI_\\UBI- 3º ano\\2º Semestre\\SD\\FPOO\\texto2.txt"));
            pw.println(2.31);
            pw.println(false);
            pw.print("X");
            pw.flush();
            pw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            br = new BufferedReader(new FileReader ("C:\\Users\\assun\\iCloudDrive\\UBI_\\UBI- 3º ano\\2º Semestre\\SD\\FPOO\\texto2.txt"));
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
