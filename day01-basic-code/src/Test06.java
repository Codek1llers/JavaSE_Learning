import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入一个3位数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    public static void check(int n) {
        int ge = n % 10;
        int shi = n / 10 % 10;
        int bai = n / 100;
        if(ge*ge*ge + shi*shi*shi + bai*bai*bai == n)
            System.out.println(n + "是水仙花数");
        else
            System.out.println(n + "不是水仙花数");
    }
}
