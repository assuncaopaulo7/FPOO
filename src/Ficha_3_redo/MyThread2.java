package Ficha_3_redo;

public class MyThread2 implements Runnable{
    public MyThread2(){ }
    public void run(){
        System.out.println("Hi there, from " + Thread.currentThread().getName() );
    } }