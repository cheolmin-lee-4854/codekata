
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AddSurplus sn = new AddSurplus();
        Random rd = new Random();
        int a = rd.nextInt(1000);

        System.out.println("넣은 겂 : "+a);
        System.out.println("합친 나머지 값 : "+sn.solution(a));
    }
}
