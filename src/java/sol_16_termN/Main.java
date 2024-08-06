
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        termN sn = new termN();
        Random rd = new Random();
        int x = rd.nextInt(10);
        int n = rd.nextInt(10);

        System.out.println("X: "+x);
        System.out.println("n: "+n);

        long[] result = sn.solution(x, n);
        System.out.print("결과: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
