package Ficha_3_redo;

public class Teste {

    // Metodos
    public static int[] preencheArray(int[] A, int tam){
        for(int i = 0; i < tam; i++){
            A[i] = (int) (Math.random() * 100);
            System.out.println(A[i]);
        }
        return A;
    }

    // Main
    public static void main (String[] str){
        int aux, soma=0;
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        preencheArray(A,TAM);
        preencheArray(B,TAM);

        ThreadSoma T1 = new ThreadSoma(A,B,C, 0, 5);
        ThreadSoma T2 = new ThreadSoma(A,B,C, 5, 10);
        Thread thread1,thread2;
        thread1 = new Thread(T1);
        thread2 = new Thread(T2);

        thread1.start();
        thread2.start();

        // codigo para esperar que acabe a execuçao das threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e ){
            System.out.println(e.getMessage());
        }

        // Mostrar o array resultado
        System.out.println("Array C (soma de A e B):");
        for (int i = 0; i < TAM; i++) {
            System.out.println(C[i]);
        }

        for (int i = 0; i < TAM; i++) {
            aux = C[i];
            soma = soma + aux;
        }

        System.out.println("Array C somado: "+soma);



    }

}




//public class Teste {
//    public static void main (String[] str){
//        MyThread Ta, Tb;
//        Ta = new MyThread();
//        Tb = new MyThread();
//        Ta.start();
//        Tb.start();
//    }}


//public static void main (String[] str){
//    MyThread2 T = new MyThread2();
//    Thread Ta, Tb;
//    Ta = new Thread( T );
//    Tb = new Thread( T );
//    Ta.start();
//    Tb.start();
//}