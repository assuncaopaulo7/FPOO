package Ficha_1;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class NameToIP {
    public static void main (String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your machine name: ");
        String input = br.readLine();
        InetAddress host =null;
        try {
            host = InetAddress.getByName(input);
            System.out.print(host.getHostAddress());
        }
        catch (UnknownHostException e){
            System.out.println("IP malformed ");
        }
    }
}



/*
        String s=" ";
        char c;
        System.out.print("IP address? ");
        while ( (c=(char)System.in.read()) != 10)
            s+=c;
        s=s.trim();
        InetAddress host =null;
        try {
            host = InetAddress.getByName(s);
            System.out.println(host.getHostName());
        }
        catch (UnknownHostException e){
            System.out.println("IP malformed ");
        }

*/