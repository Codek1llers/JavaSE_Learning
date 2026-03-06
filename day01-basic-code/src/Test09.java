import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        System.out.println("请猜一个1～100的数字");
        while(true) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            if (m > n) {
                System.out.println("猜的数字太大了");
            } else if (m < n) {
                System.out.println("猜的数字太小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
