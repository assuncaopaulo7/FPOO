package Ficha_1_R;
import java.net.*;
import java.io.*;

public class NametoIP {
    public static void main (String args[] ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // iniciar BufferedReader
        System.out.println("Enter Name: ");
        String s = br.readLine();
        InetAddress host =null;   // Para usar o InetAdress instanciamos ele como null, depois usamos o getByName com a var.
        try {
            host = InetAddress.getByName(s); // TIPO ASSIM
            System.out.println(host.getHostAddress());
        }
        catch (UnknownHostException e){
            System.out.println("IP malformed ");
        }
    }
}