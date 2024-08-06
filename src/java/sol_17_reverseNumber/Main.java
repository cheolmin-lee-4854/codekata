
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        reverseNumber rn = new reverseNumber();
        Random rd = new Random();
        int x = rd.nextInt(1000000);
        int[] result = rn.solution(x);
        
        System.out.println("Input number: " + x);
        System.out.print("Digits: ");
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
