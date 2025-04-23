package Ficha_1;
import java.io.*;
import java.net.InetAddress;

public class GetName {
    public static void main (String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host.getHostName());
    }
}
