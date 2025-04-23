package Ficha_4;

public class P2 extends Thread{
    private int [] vp;
    public P2 (int[] vp){
        super();
        this.vp = vp;
        setDaemon(true);
        start();
    }
    public void run(){
        int a;
        while (true) {
//secção crítica 2
            synchronized (vp){
                vp[0] = vp[0] + 1;
            }
//<parte restante 2>
            System.out.println("***************P2" + vp[0]);
        } // while
    } // run
} //P2
