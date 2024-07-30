
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AvgArray sn = new AvgArray();
        Random rd = new Random();
        int a = 0;
        int[] array = new int[10];


        for (int i=0 ; i<array.length ; i++){
            a = rd.nextInt(10);
            array[i] = a;
        }

        System.out.print("[");
        for (int i=0 ; i<array.length ; i++){
            System.out.print(array[i]);
            if (i < 9){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sn.solution(array);
    }    
}
