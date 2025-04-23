package Ficha_3;

public class ThreadSoma extends Thread{
    int[] A,B,C;
    int u, p;

    public ThreadSoma(int[] A, int[]B, int[]C, int p, int u){
        super();
        this.A = A;
        this.B = B;
        this.C = C;
        this.u = u;
        this.p = p;
        start();
    }

    public void run(){
        for(int i = p; i < u; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }
    }
}
