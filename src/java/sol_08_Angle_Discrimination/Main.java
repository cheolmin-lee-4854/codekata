import java.util.Random;

public class Main {
    public static void main(String[] args) { 
        Operation op = new Operation();
        Random rd = new Random();
        int a = rd.nextInt(180);

        System.out.println("ANGLE : "+a);
        System.out.println("결과는 " + op.Angle_Identification(a));
    }
}
