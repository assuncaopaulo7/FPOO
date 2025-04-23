package Ficha_3;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;


public class Teste {

    public int[] rand_array(int dim){
        int[] RandArray = new int[dim];
        Random rand = new Random();


        for (int i = 0; i < dim; i++){
            RandArray[i] = rand.nextInt(10);
        }
        return RandArray;
    }

    public static void main (String[] str){
        int dim = 3;
        int[] A = new int[dim];
        int[] B = new int[dim];
        int[] C = new int[dim];

        //A = rand_array(dim);
        ThreadSoma T = new ThreadSoma(A,B,C, 0,3);
    } }
