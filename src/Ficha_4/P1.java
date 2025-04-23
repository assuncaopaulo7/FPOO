package Ficha_4;

public class P1 extends Thread {
    private int[] vp;
    private int x = 1000000, y = -1000000;
    public P1 (int [] vp){
        super();
        this.vp = vp;
        start();
    }

    public void run (){
        int a;
        while (true){
//secção crítica1
            synchronized (vp) {
                x = x + vp[0];
                y = y
                        - vp[0];
            }
// <parte restante 1>
            if
            (x+y != 0 ){
                System.out.println(" Secção crítica violada" );
                break;
            }//fim do if
        }// end while
    } // end run
} // end P1
