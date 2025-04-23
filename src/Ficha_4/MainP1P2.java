package Ficha_4;

public class MainP1P2 {
    public static void main(String[] args) {
        int[] vp =new int [1];
        vp[0] = 0;
        P2 p2 = new P2(vp);
        P1 p1 = new P1 (vp);
        System.out.println(vp[0]);
    }
}