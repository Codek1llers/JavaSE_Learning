import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        check(n);
    }
    public static void check(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }
    }
}
