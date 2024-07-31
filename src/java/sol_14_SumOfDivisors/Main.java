
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AddSurplus sn = new AddSurplus();
        Random rd = new Random();
        int a = rd.nextInt(100);

        System.out.println("넣은 겂 : "+a);
        System.out.println("약수들과 합친 값 : "+sn.solution(a));
    }
}
