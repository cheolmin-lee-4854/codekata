
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();

        System.out.print("나이 : ");
        int a = sc.nextInt();
        System.out.println("결과는 " + op.Birth_year_search(a));
    }
}
