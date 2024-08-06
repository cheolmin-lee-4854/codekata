
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StrToInt rn = new StrToInt();
        Random rd = new Random();
        String x = "-1234";

        System.out.println("X: "+x);
        System.out.println("result: "+rn.solution(x));
    }
}
