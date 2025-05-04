package Ficha_3_redo;

public class MyThread extends Thread {
    public MyThread(){
        super();
    }
    public void run() {
        System.out.println("Hello there, from " + getName() );
        System.out.println("This is a test and im being executed first!");
    }}

