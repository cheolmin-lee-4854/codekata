import java.util.Random;

public class Main {
    public static void main(String[] args) { 
        Operation op = new Operation();
        Random rd = new Random();
        int a = rd.nextInt(10);
        int b = rd.nextInt(10);

        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("결과는 " + op.Number_Identification(a, b));
    }
}
