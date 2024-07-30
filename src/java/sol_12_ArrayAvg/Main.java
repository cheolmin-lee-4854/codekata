
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayAvg sn = new ArrayAvg();
        Random rd = new Random();
        int a = rd.nextInt(20);
        double[] array = new double[a];
        int b = 0;
        int i = 0;

        for (i=0 ; i<array.length ; i++){
            b = rd.nextInt(100);
            array[i] = b;
        }

        System.out.print("[");
        for (i=0 ; i<array.length ; i++){
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("배열의 평균 값 : "+sn.solution(array));
    }    
}
