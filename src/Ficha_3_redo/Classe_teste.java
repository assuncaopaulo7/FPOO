package Ficha_3_redo;

import static java.lang.Thread.sleep;

public class Classe_teste {
    public static void main (String[] arg) throws InterruptedException {

        ThreadGroup MyGroup1 = new ThreadGroup("Grupo A");
        ThreadGroup MyGroup2 = new ThreadGroup("Grupo B");

        // Criar threads no grupo1
        Thread t1 = new MyThread5(MyGroup1, "T1-A");
        Thread t2 = new MyThread5(MyGroup1, "T2-A");

        // Criar threads no grupo2
        Thread t3 = new MyThread5(MyGroup2, "T1-B");
        Thread t4 = new MyThread5(MyGroup2, "T2-B");

        // Iniciar threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        sleep(500);
        MyGroup1.interrupt();
        MyGroup2.interrupt();


    }

}







//    EXERCICIO  4

/*
    Normal thread = new Normal();
    Daemon thread2 = new Daemon();
            Thread A,B;
    A = new Thread(thread);
    B = new Thread(thread2);
            B.setDaemon(true); // setDaemon tem que estar ativado para que a daemon para imediatamente depois da normal.
            A.start();
            B.start();

 */


//   EXERCICIO  5

/*
            MyThread5 Ta, Tb, Tc;
    ThreadGroup this_group;
    this_group = Thread.currentThread().getThreadGroup();

            System.out.println("O nome do grupo é: " + this_group.getName());
            System.out.println("O nº de Threads activas no grupo é " + this_group.activeCount());

    Ta=new MyThread5 ("Thread A");
    Tb=new MyThread5 ("Thread B");
    Tc=new MyThread5 ("Thread C");
            Ta.start();
            Tb.start();
            Tc.start();

    // obtenha o nome do grupo e o número de threads activas nesse grupo
            System.out.println("O nome do grupo é: " + this_group.getName());
            System.out.println("O nº de Threads activas no grupo é " + this_group.activeCount());

            try{
            Thread.sleep (500);
            }catch (InterruptedException e){
            System.out.println(e.getMessage());
            }
            // Pode invocar um metodo em todas as Threads do grupo:
            this_group.interrupt();

 */