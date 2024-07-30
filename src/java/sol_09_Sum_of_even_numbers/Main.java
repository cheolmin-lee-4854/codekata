
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SumOfEvenNumbers sn = new SumOfEvenNumbers();
        Random rd = new Random();
        int a = rd.nextInt(10);

        System.out.println(a+"까지 짝수들의 합");
        System.out.println("결과는 " + sn.solution(a));
    }    
}
