
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AddSurplus sn = new AddSurplus();
        Random rd = new Random();
        int n = rd.nextInt(100);

        System.out.println("n: "+n);
        System.out.println("나눈값이 1인 값중 가장 큰 값 : "+sn.solution(n));
    }
}
