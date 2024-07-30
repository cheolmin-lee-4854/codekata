
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EvenOdd sn = new EvenOdd();
        Random rd = new Random();
        int a = rd.nextInt(10);

        System.out.println("정수 : "+a);
        System.out.println(sn.solution(a));
    }    
}
