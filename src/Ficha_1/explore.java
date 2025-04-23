package Ficha_1;
import java.io.*;
import java.net.InetAddress;

public class explore {
    /*
    public static void main (String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host.getByName("LAPTOP-5IG16KDM"));}

    public static void main (String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host.getHostName());}

    */

    public static void main (String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host.getHostAddress());
    }

}
