package Ficha_3_redo;

public class ThreadSoma implements Runnable{
    public int[] A, B, C;
    int p,u;

    public ThreadSoma(int[]A, int[]B, int[]C, int p, int u){
        this.A = A;
        this.B = B;
        this.C = C;
        this.p = p;
        this.u = u;
    }

    public void run(){
        for (int i = p; i < u; i++) {
            C[i] = A[i] + B[i];
        }
    }


}